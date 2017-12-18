package aabbcc;

public class RandomSort {
	public static void main(String []args){
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=(int)(Math.random()*100);
		
		System.out.print("要排序的数为:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length-i-1;j++){
				if(a[j+1]<a[j]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		
		System.out.print("排序后的数为:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		int max=a[0];
		for(int each:a){
			if(each>a[0])
				max=each;
		}
		System.out.println("最大的数为:"+max);
	}
}
