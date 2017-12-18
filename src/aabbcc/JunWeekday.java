package aabbcc;

import java.io.InputStream;
import java.util.Scanner;

public class JunWeekday {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		while(true){
		System.out.println("今天是周几:");
		int day=s.nextInt();
		String x=day<6?(day<=0?"输入错误，请重新输入":"工作日"):(day>7?"输入错误，请重新输入":"周末");
		System.out.println("今天是:"+x);
		}
	}
}
