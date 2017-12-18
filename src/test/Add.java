package test;

public class Add {
	public static void main(String []args){
		double i=1.5;
		for(int k=0;k<9;k++){
		//i=Math.pow(1+1.0/(i*i), 1.0/3);
		i=1.0/Math.sqrt(i-1);
		System.out.printf("%.6f",i);
		System.out.println();
		}
	}
}
