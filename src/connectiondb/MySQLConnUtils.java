package connectiondb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnUtils {
	static Connection conn;

	public static Connection getMySQLConnUtils() {

		final String url = "jdbc:mysql://localhost:3306/myapp?autoreconnect=true";
		final String user = "root";
		final String pass = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
			
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public  void thucThiSQL(String sql) throws Exception{
		Connection connect =getMySQLConnUtils() ;
		Statement stmt = connect.createStatement();
		stmt.executeUpdate(sql);
	}
	public ResultSet chonDuLieu(String sql) throws Exception{
		Connection connect =getMySQLConnUtils() ;
		Statement stmt = connect.createStatement();
		ResultSet rs=	stmt.executeQuery(sql);
		return rs;
	
	}
	
public static void main(String[] args) throws Exception {
	
}

}