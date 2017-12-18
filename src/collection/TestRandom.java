package collection;

public class TestRandom {
	public static void main(String []args){
		int[] a=new int[5];
		int[] b=new int[5];
		for(int i=0;i<5;i++){
			a[i]=(int)(Math.random()*100);//生成100的数
			b[i]=(int)(Math.random()*90+10);//生成10-100以内的2位数
		}
		
		for(int aa:a)
			System.out.println(aa);
		for(int bb:b)
			System.out.println(bb);
	}
}
