package collection;

import java.util.HashSet;

public class TestHashset {
	private static int n=1000000;
	public static void main(String []args){
		String[] ss=new String[n];
		for(int i=0;i<n;i++)
			ss[i]=randomString(5);
		
	System.out.println("------随机生成的字符串组如下--------");
	for(int i=0;i<ss.length;i++){
		System.out.print(ss[i]+" ");
		if(i%20==19)//20个一组
			System.out.println();
	}	
	
	HashSet<String> hashset=new HashSet<>();
	HashSet<String> result=new HashSet<>();//用来存储并显示重复的元素
	for(int i=0;i<ss.length;i++){
		int originHashSetSize=hashset.size();//初始时，hashset的size为0，每放进去一个元素，originHashSetSize的值跟新一次
		hashset.add(ss[i]);
		if(hashset.size()==originHashSetSize)
			result.add(ss[i]);
	}
	
	System.out.printf("重复的有%d个%n",result.size());
	for(String e:result){
		System.out.print(e.toString()+" ");
	}
	
	}
	
	
	/*随机生成两位的字符串
	 * 原理:把所需字符串放在同一字符串中，然后随机取出两个
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
