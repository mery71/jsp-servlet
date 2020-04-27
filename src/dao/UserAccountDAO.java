package dao;

import java.sql.ResultSet;

import connectiondb.MySQLConnUtils;
import model.UserAccount;

public class UserAccountDAO {


	public  static boolean themTaiKhoan(UserAccount us) {
		try {
			new MySQLConnUtils().thucThiSQL("insert into useraccount (username,password) values ('"+us.getUserName()+"','"+us.getPassword()+"')");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public UserAccount layThongTin(String username) {
		UserAccount us= new UserAccount();
		try {
			ResultSet rs=new MySQLConnUtils().chonDuLieu("Select*from useraccount where username='"+username+"'");
			while (rs.next()) {
				String user= rs.getString(1);
				String pass=rs.getString(2);
				return new UserAccount(user,pass);
			}

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;

	}
	public static boolean kiemTraDangNhap(String username, String password) {
		try {
			ResultSet rs=new MySQLConnUtils().chonDuLieu("Select*from useraccount where username='"+username+"' and password='"+password+"'");
			while (rs.next()) {
				if(rs.getString(1).equals(username) && rs.getString(2).equals(password)) {
					return true;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();

		}
		return false;	
	}
	public static void main(String[] args) {

	}
}
