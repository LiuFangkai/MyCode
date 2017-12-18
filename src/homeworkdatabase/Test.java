package homeworkdatabase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test{
	public static void main(String []args){
		Connection c=null;
		Statement s=null;
		FileInputStream fis=null;
		BufferedReader reader=null;
		
		try {
			fis=new FileInputStream("D:\\Workspaces\\MyEclipse 10\\MyCode\\data\\1");
			try {
				reader=new BufferedReader(new InputStreamReader(fis,"UTF-8"));
				try {
					String line=reader.readLine();
					int countlines=0;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int countlines=0;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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
			String url="jdbc:mysql://127.0.0.1:3306/2nd?characterEncoding=UTF-8";
			c=DriverManager.getConnection(url,"root","root");
			System.out.println("连接成功,获取连接对象"+c);
			
			//Statement是用于执行SQL语句的，比如增加，删除
			s=c.createStatement();
			System.out.println("获取Statement对象:"+s);
			
			String 	InsertQuery="insert into telph(dorm,telephone)values(?,?)";
			
			s.execute(InsertQuery);
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
	
