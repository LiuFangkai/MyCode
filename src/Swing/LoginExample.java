package Swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginExample {
	public static void main(String[] args) {
		final JFrame f=new JFrame();
		f.setBounds(400, 400, 400, 400);
		
		JPanel pNorth=new JPanel();
		pNorth.setLayout(new FlowLayout());
		JPanel pCenter=new JPanel();
		JLabel l1=new JLabel("�˺�:");
		JLabel l2=new JLabel("����:");
		final JTextField tf1=new JTextField("");
		tf1.setPreferredSize(new Dimension(80,30));
		final JTextField tf2=new JTextField("");
		tf2.setPreferredSize(new Dimension(80,30));
		pNorth.add(l1);
		pNorth.add(tf1);
		pNorth.add(l2);
		pNorth.add(tf2);
		
		JButton b=new JButton("��¼");
		pCenter.add(b);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name=tf1.getText();
				String password=new String(tf2.getText());
				if(check(name,password)){
					JOptionPane.showMessageDialog(f, "��½�ɹ�");
				}else{
					JOptionPane.showMessageDialog(f, "������Ϣ����");
				}
			}
		});
		f.setLayout(new BorderLayout());
		f.add(pNorth,BorderLayout.NORTH);
		f.add(pCenter,BorderLayout.CENTER);
		f.setVisible(true);
	}
	public static boolean check(String name,String password){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean result=false;
		try {
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/testJava?CharacterEncoding=UTF-8","root","root");
			System.out.println("���ݿ����ӳɹ�");
			Statement s=c.createStatement();
			String sql="select * from user where name='"+name+"'and password='"+password+"'";
			ResultSet rs=s.executeQuery(sql);
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
