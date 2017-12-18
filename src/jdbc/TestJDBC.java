package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String []args){
		Connection c=null;
		Statement s=null;
		try{
			/*Class.forName是把这个类加载到JVM中，加载的时候，就会执行其中的
			静态初始化模块，完成驱动的初始化工作*/	
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
		//下面使用传统关闭数据库的方法
		try{
			String url="jdbc:mysql://127.0.0.1:3306/MyDB?characterEncoding=UTF-8";
			c=DriverManager.getConnection(url,"root","root");
			System.out.println("连接成功,获取连接对象"+c);
			
			//Statement是用于执行SQL语句的，比如增加，删除
			s=c.createStatement();
			System.out.println("获取Statement对象:"+s);
			
			String sql = "insert into hero values(null,"+"'timo'"+","+313.0f+","+50+")"; 
			s.execute(sql);
			System.out.println("执行插入语句成功");
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			
			//数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
			if(s!=null)
			try{
				s.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			if(c!=null)
				try{
					c.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
}
//参考关闭流 的方式，使用try-with-resource的方式自动关闭连接，因为Connection和Statement都实现了AutoClosable接口
/*
 * try (
			            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MyDB?characterEncoding=UTF-8",
			                "root", "root");
			            Statement s = c.createStatement();              
			        )
			        {
			            String sql = "insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50 + ")";
			            s.execute(sql);
			              
			        } catch (SQLException e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
			    }

 * */
				