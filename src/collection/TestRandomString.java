package collection;

public class TestRandomString {
	public static void main(String []args){
		TestRandomString t=new TestRandomString();
		t.randomString(3);
	
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
