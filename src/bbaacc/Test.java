package bbaacc;

public class Test {
	public static void main(String []args){
		Hero h=new Hero();
		h.name="¸ÇÂ×";
		ADHero ad=new ADHero();
		APHero ap=new APHero();
		ADAPHero adap=new ADAPHero();
		
		h.kill(ad);
		h.kill(ap);
		h.kill(adap);
	}
}
