package Swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TestJTest {
	public static void main(String[] args) {
		final JFrame f=new JFrame();
		f.setBounds(400,400,400,400);
		f.setTitle("Hello");
		f.setLayout(new FlowLayout());
		final JTextField tf=new JTextField();
		tf.setPreferredSize(new Dimension(80,30));
		JButton b=new JButton("�z�y");
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String text=tf.getText();
				if(0==text.length()){
					JOptionPane.showMessageDialog(f, "�ı����ݞ��");
					tf.grabFocus();
				}
				try{
					Integer.parseInt(text);
				}catch(NumberFormatException e1){
					JOptionPane.showMessageDialog(f, "ݔ�����ݲ�������");
					tf.grabFocus();
				}
				
			}
		});
		f.add(tf);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
