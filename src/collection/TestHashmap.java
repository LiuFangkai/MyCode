package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestHashmap {
	public static void main(String []args){
		//ArrayList��ʼ��
		List<Hero> lheros=new ArrayList<>();
		for(int i=0;i<30000000;i++)
			lheros.add(new Hero("hero-"+random()));
			
		//HashMap�洢Ԫ�س�ʼ��
		//������Ϊkey��������ͬ��hero������һ��List�У���Ϊvalue
		HashMap<String,List<Hero>> mheros=new HashMap();
		for(Hero h:lheros){
			List<Hero> list=mheros.get(h.name);
			if(list==null){
				list=new ArrayList<>();
				mheros.put(h.name, list);
			}
			list.add(h);
		}
		System.out.println("��ʼ������");
		System.out.println("��ʼ����");
		findByIteration(lheros);
		findByMap(mheros);
	}
	
	/*ʹ��ArrayList���������ѵ�ʱ��*/
	private static List<Hero> findByIteration(List<Hero> lheros){
		long start=System.currentTimeMillis();
		List<Hero> result=new ArrayList();
		for(Hero h:lheros){
			if(h.name.equals("hero-5555")){
				result.add(h);
			}
		}
		long end=System.currentTimeMillis();
		System.out.printf("ͨ��for����,һ���ҵ�%d��Ӣ��,��ʱ%d ����%n",result.size(),end-start);
		return result;
	}
	
	/*ʹ��HashMap�������õ�ʱ��*/
	private static List<Hero> findByMap(HashMap<String,List<Hero>> m){
		long start=System.currentTimeMillis();
		List<Hero> result=m.get("hero-5555");
		long end=System.currentTimeMillis();
		System.out.printf("ͨ��map���ң�һ���ҵ�%d��Ӣ�ۣ���ʱ%d ����%n",result.size(),end-start);
		return result;
	}
	/*������λ�����*/
	public static int random(){
		return ((int)(Math.random()*9000)+1000);
	}
}
