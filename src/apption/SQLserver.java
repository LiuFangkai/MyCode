package apption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/*�����ݿ���صĲ���������װ����*/
public class SQLserver {
	Connection ct;
	PreparedStatement ps;
	ResultSet rs;
	String user,pwd;
	
	public void ConnectSQL(){
		ct=null;
		try{
			/*Class.forName�ǰ��������ص�JVM�У����ص�ʱ�򣬾ͻ�ִ�����е�
			��̬��ʼ��ģ�飬��������ĳ�ʼ������*/	
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			String url="jdbc:mysql://127.0.0.1:3306/MyDB?characterEncoding=UTF-8";
			ct=DriverManager.getConnection(url,"root","root");
			System.out.println("���ӳɹ�,��ȡ���Ӷ���"+ct);			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	/*�û�ע�᷽��*/
	public void UserRegis(String a,String b,String c,String d){
		try {
		ps=ct.prepareStatement("insert into users values(?,?,?,?)"); 
		ps.setString(1, a);
		ps.setString(2, b);
		ps.setString(3, c);
		ps.setString(4, d);
		
		//ִ��
		int i=ps.executeUpdate();
		if(i==1){
			JOptionPane.showMessageDialog(null, "ע��ɹ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "ע��ʧ��","��ʾ��Ϣ",JOptionPane.ERROR_MESSAGE);
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*��¼��֤����*/
	public void SQLverify(String a,String b){
		try {
			ps=ct.prepareStatement("select * from users where username= ? and password= ?");
			ps.setString(1,a);
			ps.setString(2,b);
			rs=ps.executeQuery();	//ResultSet���������һ�ű��еĽ����
			if(rs.next()){
				user=rs.getString(1);
				pwd=rs.getString(2);
				JOptionPane.showMessageDialog(null, "��½�ɹ�!!!","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
				System.out.println("�ɹ���ȡ��������û���from���ݿ�");
				System.out.println(user+"\t"+pwd+"\t");
			}else{
				JOptionPane.showMessageDialog(null, "�û������������������������","��ʾ��Ϣ",JOptionPane.ERROR_MESSAGE);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*ע����֤�������ж��û����Ƿ��Ѿ�����*/
	public void ResisVerify(String a){
		try {
			ps=ct.prepareStatement("select * from users where username=?");
			ps.setString(1, a);
			rs=ps.executeQuery();
			if(rs.next()){
				JOptionPane.showMessageDialog(null, "���û����Ѿ�����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
			}else{
				//����ע��
				UI ui=new UI();
				this.UserRegis(ui.jtf1.getText(), ui.jtf2.getText(), ui.jtf3.getText(), ui.jtf4.getText());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
