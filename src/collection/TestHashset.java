package collection;

import java.util.HashSet;

public class TestHashset {
	private static int n=1000000;
	public static void main(String []args){
		String[] ss=new String[n];
		for(int i=0;i<n;i++)
			ss[i]=randomString(5);
		
	System.out.println("------������ɵ��ַ���������--------");
	for(int i=0;i<ss.length;i++){
		System.out.print(ss[i]+" ");
		if(i%20==19)//20��һ��
			System.out.println();
	}	
	
	HashSet<String> hashset=new HashSet<>();
	HashSet<String> result=new HashSet<>();//�����洢����ʾ�ظ���Ԫ��
	for(int i=0;i<ss.length;i++){
		int originHashSetSize=hashset.size();//��ʼʱ��hashset��sizeΪ0��ÿ�Ž�ȥһ��Ԫ�أ�originHashSetSize��ֵ����һ��
		hashset.add(ss[i]);
		if(hashset.size()==originHashSetSize)
			result.add(ss[i]);
	}
	
	System.out.printf("�ظ�����%d��%n",result.size());
	for(String e:result){
		System.out.print(e.toString()+" ");
	}
	
	}
	
	
	/*���������λ���ַ���
	 * ԭ��:�������ַ�������ͬһ�ַ����У�Ȼ�����ȡ������
	 * */
	private static String randomString(int length){
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
		return result;
	}
}
