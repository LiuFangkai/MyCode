package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPassword {
	public static void main(String []args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MyDB?characterEncoding=UTF-8","root", "root");
			Statement s = c.createStatement();)
			{
				String sql = "insert into hero values(" + 2 + "," + "'weien'" + ",55,60)";
				s.execute(sql);
				} catch (SQLException e) {
						e.printStackTrace();
					}
		}				
}			

