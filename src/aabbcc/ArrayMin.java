package aabbcc;

public class ArrayMin {
	public static void main(String []args){
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=(int)(Math.random()*100);
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(min<a[i]){
				int temp=min;
				min=a[i];
				a[i]=temp;
			}
		}
		System.out.println("最小的数是:"+min);
	}
}
