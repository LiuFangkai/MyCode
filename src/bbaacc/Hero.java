package bbaacc;

public class Hero {
	String name;
	float hp;//Ѫ��
	float armor;//����
	int moveSpeed;//�ƶ��ٶ�
	
	public void kill(Mortal m){
		m.die();
	}
}
