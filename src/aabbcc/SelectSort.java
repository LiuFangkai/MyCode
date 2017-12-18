package aabbcc;

public class SelectSort {
	public static void main(String []args){
		int[] a={10,2,4,6,8};
		System.out.print("要排序的数为:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		for(int i=0;i<a.length;i++)
			for(int j=i;j<a.length-i-1;j++){
				if(a[j+1]<a[j]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		
		System.out.print("排序后的数为:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		
	}
}
