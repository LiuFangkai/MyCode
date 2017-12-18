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
			/*Class.forName�ǰ��������ص�JVM�У����ص�ʱ�򣬾ͻ�ִ�����е�
			��̬��ʼ��ģ�飬��������ĳ�ʼ������*/	
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ�");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
		//����ʹ�ô�ͳ�ر����ݿ�ķ���
		try{
			String url="jdbc:mysql://127.0.0.1:3306/2nd?characterEncoding=UTF-8";
			c=DriverManager.getConnection(url,"root","root");
			System.out.println("���ӳɹ�,��ȡ���Ӷ���"+c);
			
			//Statement������ִ��SQL���ģ��������ӣ�ɾ��
			s=c.createStatement();
			System.out.println("��ȡStatement����:"+s);
			
			String 	InsertQuery="insert into telph(dorm,telephone)values(?,?)";
			
			s.execute(InsertQuery);
			System.out.println("ִ�в������ɹ�");
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			
			//���ݿ������ʱ������Դ����ز������������ɹر����ݿ�ĺ�ϰ��
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
	
