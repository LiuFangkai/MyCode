package aabbcc;

public class Item{
	String name;
	int price;
	public Item(){	
	}
	public Item(String n,int p){
		this.name=n;
		this.price=p;
	}
	public void setName(String n){
		this.name=n;
	}
	public void setPrice(int p){
		this.price=p;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
}