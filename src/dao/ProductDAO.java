package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectiondb.MySQLConnUtils;
import model.Product;


public class ProductDAO {

	public static ArrayList<Product> getProduct() {
		Connection conn= MySQLConnUtils.getMySQLConnUtils();
		ArrayList<Product> products=new ArrayList<>();
		try {
			ResultSet rs=conn.prepareStatement("select*from listproduct").executeQuery();
			while (rs.next()) {
				Product product=new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setQuantity(rs.getInt("quantity"));
				product.setPrice(rs.getFloat("price"));

				products.add(product);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return products;
	}


	public static boolean add(Product pr) {
		try {
			new MySQLConnUtils().thucThiSQL("insert into listproduct (Id,name,quantity,price) values ('"+pr.getId()+"','"+pr.getName()+"','"+pr.getQuantity()+"','"+pr.getPrice()+"')");
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static boolean  edit( Product pr) {

		try {	
			new MySQLConnUtils().thucThiSQL("Update listproduct set name='"+pr.getName()+"',quantity='"+pr.getQuantity()+"',price='"+pr.getPrice()+"',Id='"+pr.getId()+"' where Id='"+pr.getId()+"'");
			return true;
		} catch (Exception e) {

			System.out.println(e.getMessage());

			e.printStackTrace();
			return false;
		}

	}
	public static boolean delete(int Id) {
		try {

			new MySQLConnUtils().thucThiSQL("Delete from listproduct where Id="+Id);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());

			e.printStackTrace();
			return false;
		}
	}
	public static Product getProductId(int Id) {
		Connection conn= MySQLConnUtils.getMySQLConnUtils();
		Product product=new Product();
		String sql="select*from listproduct where id="+Id;
		PreparedStatement pts;
		try {
			pts=conn.prepareStatement(sql);
			ResultSet rs=pts.executeQuery();
			if(rs.next()) {
				//product.setId(rs.get)
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setQuantity(rs.getInt("quantity"));
				product.setPrice(rs.getFloat("price"));
			}
			return product;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public ArrayList<Product> getProductName(String name) throws Exception{

		ArrayList<Product> products=new ArrayList<>();
		try (
				Connection conn= MySQLConnUtils.getMySQLConnUtils();
				PreparedStatement pts=conn.prepareStatement("select*from listproduct where name like '%"+name+"%'");
				){
			try(ResultSet rs=pts.executeQuery();){
				while (rs.next()) {
					Product product=new Product();
					product.setId(rs.getInt("id"));
					product.setName(rs.getString("name"));
					product.setQuantity(rs.getInt("quantity"));
					product.setPrice(rs.getFloat("price"));

					products.add(product);
				}
			}
			return products;}
	}




	public static void main(String[] args) {
		//System.out.println("size " +getProduct().size());


	}
}
