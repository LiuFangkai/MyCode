package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String []args){
		try{
			//�������򿪶˿�8888
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("�˿ں�8888�ڼ���");
			Socket s=ss.accept();
			
			System.out.println("�����ӹ���:"+s);
			//��������
			InputStream is=s.getInputStream();
			DataInputStream dis=new DataInputStream(is);	
			//�������
			OutputStream os=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			
			
			while(true){	
			String msg=dis.readUTF();
			System.out.println("�յ��ͻ�����Ϣ"+msg);
	
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			dos.writeUTF(str);		

			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
