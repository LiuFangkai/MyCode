package aabbcc;

public class DouDimenArray {
	public static void main(String []args){
		int[][] a=new int[5][5];
	
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++){
				a[i][j]=(int)(Math.random()*100);
			}
		
		int max=a[0][0];
		int m=0,n=0;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++){
				if(a[i][j]>max){
					max=a[i][j];
					m=i;
					n=j;
				}
			}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
				if((j+1)%5==0)
					System.out.println();
			}
			//System.out.println();
		}
		System.out.println("找出的最大数为:"+max);
		System.out.printf("其坐标是[%d][%d]:",m,n);
	}
}
