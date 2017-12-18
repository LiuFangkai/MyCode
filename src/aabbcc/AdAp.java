package aabbcc;

public class AdAp extends Hero implements AD,Ap{
	public void adTack(){
		System.out.print(name+"使用物理攻击");
	}
	
	public void apTack(){
		System.out.print(name+"使用魔法攻击");
	}
	
	public static void main(String []args){
		AdAp a=new AdAp();
		a.name="武器大师";
		a.adTack();
		System.out.println();
		a.apTack();
	
	}
}
