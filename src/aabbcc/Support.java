package aabbcc;

public class Support extends Hero{
	public void heal(Hero...heros){
		for(int i=0;i<heros.length;i++)
			System.out.println(name+"��Ӣ��"+heros[i].name+"��Ѫ��");
	}
	
	public static void main(String []args){
		Support s=new Support();
		s.name="��Ů";
		Hero h1=new Hero();
		h1.name="ޱ��";
		Hero h2=new Hero();
		h2.name="����";
		s.heal(h1,h2);
	}
}
