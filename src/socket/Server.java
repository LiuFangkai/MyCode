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
			//服务器打开端口8888
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("端口号8888在监听");
			Socket s=ss.accept();
			
			System.out.println("有连接过来:"+s);
			//打开输入流
			InputStream is=s.getInputStream();
			DataInputStream dis=new DataInputStream(is);	
			//打开输出流
			OutputStream os=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			
			
			while(true){	
			String msg=dis.readUTF();
			System.out.println("收到客户端信息"+msg);
	
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			dos.writeUTF(str);		

			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
