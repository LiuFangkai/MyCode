package collection;

public class TestRandomString {
	public static void main(String []args){
		TestRandomString t=new TestRandomString();
		t.randomString(3);
	
	}
	private static String randomString(int length){
		/*�Ȱ����е��ַ����洢��һ���ַ����У�Ȼ�������������ѡ����λ�ã�����Ӧλ�õ��ַ�������������*/
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
