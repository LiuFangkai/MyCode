package aabbcc;

import java.util.Arrays;

public class TwoDimenArray {
	public static void main(String []args){
		int[][] a=new int[5][8];
		int[] b=new int[40];
		for(int i=0;i<5;i++)
			for(int j=0;j<8;j++){
				a[i][j]=(int)(Math.random()*100);
			}
		System.out.println("初始产生的二维数组为:");
		/*for(int i=0;i<5;i++){
			for(int j=0;j<8;j++){
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
		}*/
		
		for(int[] each:a)
			System.out.println(Arrays.toString(each));//使用遍历的方法
		
		for(int i=0;i<a.length;i++)
			System.arraycopy(a[i], 0, b, i*a[i].length, a[i].length);
		Arrays.toString(b);
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		System.out.println("排序之后的二维数组为:");
		for(int i=0;i<a.length;i++)
			System.arraycopy(b, i*a[i].length, a[i], 0, a[i].length);
		
		for(int i=0;i<5;i++){
			for(int j=0;j<8;j++){
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
		}
	}
}
