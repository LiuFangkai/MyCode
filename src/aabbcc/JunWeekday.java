package aabbcc;

import java.io.InputStream;
import java.util.Scanner;

public class JunWeekday {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		while(true){
		System.out.println("�������ܼ�:");
		int day=s.nextInt();
		String x=day<6?(day<=0?"�����������������":"������"):(day>7?"�����������������":"��ĩ");
		System.out.println("������:"+x);
		}
	}
}
