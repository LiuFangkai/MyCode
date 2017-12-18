package aabbcc;

public class Support extends Hero{
	public void heal(Hero...heros){
		for(int i=0;i<heros.length;i++)
			System.out.println(name+"给英雄"+heros[i].name+"加血了");
	}
	
	public static void main(String []args){
		Support s=new Support();
		s.name="琴女";
		Hero h1=new Hero();
		h1.name="薇恩";
		Hero h2=new Hero();
		h2.name="李青";
		s.heal(h1,h2);
	}
}
