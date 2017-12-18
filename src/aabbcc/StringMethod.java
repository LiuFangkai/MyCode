package aabbcc;

import java.util.Arrays;

public class StringMethod {
	public static void main(String []args){
		int[] a=new int[]{1,9,5,7,6,8};
		int[] b=Arrays.copyOfRange(a, 0, 3);
		System.out.println("排序之前:");
		System.out.print(Arrays.toString(a)+"\n");
		
		Arrays.sort(a);
		System.out.println("排序之后:");
		System.out.println(Arrays.toString(a));
		
		System.out.println("数字5出现的位置:"+Arrays.binarySearch(a, 5));
		
		System.out.println(Arrays.equals(a, b));
	}
}
