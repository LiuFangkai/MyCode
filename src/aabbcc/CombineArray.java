package aabbcc;

public class CombineArray {
	public static void main(String []args){
		int i=(int)(Math.random()*5+5);
		int j=(int)(Math.random()*5+5);
		int[] a=new int[i];
		int[] b=new int[j];
		int[] c=new int[i+j];
		
		for(int k=0;k<i;k++)
			a[k]=(int)(Math.random()*100);	
		for(int k=0;k<j;k++)
			b[k]=(int)(Math.random()*100);
	   System.out.println("生成的a数组为:");
		for(int k=0;k<i;k++)
			System.out.print(a[k]+" ");
		System.out.println();
		System.out.println("生成的b数组为:");
		for(int k=0;k<j;k++)
			System.out.print(b[k]+" ");
		System.out.println();
		System.arraycopy(a, 0, c, 0, i);
		System.arraycopy(b, 0,c, i, j);
		
		System.out.println("生成的c数组为:");
		for(int k=0;k<c.length;k++)
			System.out.print(c[k]+" ");
	}
}
