package apption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/*与数据库相关的操作单独封装成类*/
public class SQLserver {
	Connection ct;
	PreparedStatement ps;
	ResultSet rs;
	String user,pwd;
	
	public void ConnectSQL(){
		ct=null;
		try{
			/*Class.forName是把这个类加载到JVM中，加载的时候，就会执行其中的
			静态初始化模块，完成驱动的初始化工作*/	
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			String url="jdbc:mysql://127.0.0.1:3306/MyDB?characterEncoding=UTF-8";
			ct=DriverManager.getConnection(url,"root","root");
			System.out.println("连接成功,获取连接对象"+ct);			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	/*用户注册方法*/
	public void UserRegis(String a,String b,String c,String d){
		try {
		ps=ct.prepareStatement("insert into users values(?,?,?,?)"); 
		ps.setString(1, a);
		ps.setString(2, b);
		ps.setString(3, c);
		ps.setString(4, d);
		
		//执行
		int i=ps.executeUpdate();
		if(i==1){
			JOptionPane.showMessageDialog(null, "注册成功","提示消息",JOptionPane.WARNING_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "注册失败","提示信息",JOptionPane.ERROR_MESSAGE);
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*登录验证方法*/
	public void SQLverify(String a,String b){
		try {
			ps=ct.prepareStatement("select * from users where username= ? and password= ?");
			ps.setString(1,a);
			ps.setString(2,b);
			rs=ps.executeQuery();	//ResultSet结果集，即一张表行的结果集
			if(rs.next()){
				user=rs.getString(1);
				pwd=rs.getString(2);
				JOptionPane.showMessageDialog(null, "登陆成功!!!","提示信息",JOptionPane.WARNING_MESSAGE);
				System.out.println("成功获取到密码和用户名from数据库");
				System.out.println(user+"\t"+pwd+"\t");
			}else{
				JOptionPane.showMessageDialog(null, "用户名或者密码错误，请重新输入","提示信息",JOptionPane.ERROR_MESSAGE);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*注册验证方法，判断用户名是否已经存在*/
	public void ResisVerify(String a){
		try {
			ps=ct.prepareStatement("select * from users where username=?");
			ps.setString(1, a);
			rs=ps.executeQuery();
			if(rs.next()){
				JOptionPane.showMessageDialog(null, "该用户名已经存在","提示信息",JOptionPane.WARNING_MESSAGE);
			}else{
				//进行注册
				UI ui=new UI();
				this.UserRegis(ui.jtf1.getText(), ui.jtf2.getText(), ui.jtf3.getText(), ui.jtf4.getText());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
