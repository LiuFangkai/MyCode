package aabbcc;

public class Armor extends Item{
	int ac;
	public Armor(){
		
	}
	public Armor(String n,int p,int c){
		this.name=n;
		this.price=p;
		this.ac=c;
	}
	public void setAc(int c){
		this.ac=c;
	}
	public int getAc(){
		return ac;
	}
	
	public static void main(String []args){
		Armor a=new Armor("����",300,15);
		Armor b=new Armor("���Ӽ�",500,40);
		System.out.println("���� �۸� ���׵ȼ�");	
		System.out.printf("%s %d %d", a.getName(),a.getPrice(),a.getAc());
		System.out.println();
		System.out.printf("%s %d %d", b.getName(),b.getPrice(),b.getAc());
	}
}
