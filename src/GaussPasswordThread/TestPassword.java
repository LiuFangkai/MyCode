package GaussPasswordThread;

import java.util.ArrayList;
import java.util.List;

public class TestPassword {
	public static void main(String []args){
		String password=randomString(3);
		System.out.println("生成的密码是:"+password);
		List<String> passwords=new ArrayList<>();
		new PasswordThread(passwords,password).start();
		new LogThread(passwords).start();
	}
	private static String randomString(int length){
		/*先把所有的字符都存储在一个字符串中，然后用随机函数挑选出来位置，用相应位置的字符串组成随机数列*/
		String pool="";
		for(short i='0';i<='9';i++){
			pool+=(char)i;
		}
		for(short i='a';i<='z';i++){
			pool+=(char)i;
		}
		for(short i='A';i<='Z';i++){
			pool+=(char)i;
		}
		char cs[]=new char[length];
		for(int i=0;i<cs.length;i++){
			int index=(int)(Math.random()*pool.length());
			cs[i]=pool.charAt(index);
		}
		String result=new String(cs);
		System.out.println(result);
		return result;
	}
}
