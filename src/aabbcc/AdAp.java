package aabbcc;

public class AdAp extends Hero implements AD,Ap{
	public void adTack(){
		System.out.print(name+"ʹ��������");
	}
	
	public void apTack(){
		System.out.print(name+"ʹ��ħ������");
	}
	
	public static void main(String []args){
		AdAp a=new AdAp();
		a.name="������ʦ";
		a.adTack();
		System.out.println();
		a.apTack();
	
	}
}
