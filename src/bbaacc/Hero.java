package bbaacc;

public class Hero {
	String name;
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	
	public void kill(Mortal m){
		m.die();
	}
}
