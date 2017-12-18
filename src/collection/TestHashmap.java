package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestHashmap {
	public static void main(String []args){
		//ArrayList初始化
		List<Hero> lheros=new ArrayList<>();
		for(int i=0;i<30000000;i++)
			lheros.add(new Hero("hero-"+random()));
			
		//HashMap存储元素初始化
		//名字作为key，名字相同的hero，放在一个List中，作为value
		HashMap<String,List<Hero>> mheros=new HashMap();
		for(Hero h:lheros){
			List<Hero> list=mheros.get(h.name);
			if(list==null){
				list=new ArrayList<>();
				mheros.put(h.name, list);
			}
			list.add(h);
		}
		System.out.println("初始化结束");
		System.out.println("开始查找");
		findByIteration(lheros);
		findByMap(mheros);
	}
	
	/*使用ArrayList遍历所花费的时间*/
	private static List<Hero> findByIteration(List<Hero> lheros){
		long start=System.currentTimeMillis();
		List<Hero> result=new ArrayList();
		for(Hero h:lheros){
			if(h.name.equals("hero-5555")){
				result.add(h);
			}
		}
		long end=System.currentTimeMillis();
		System.out.printf("通过for查找,一共找到%d个英雄,耗时%d 毫秒%n",result.size(),end-start);
		return result;
	}
	
	/*使用HashMap查找所用的时间*/
	private static List<Hero> findByMap(HashMap<String,List<Hero>> m){
		long start=System.currentTimeMillis();
		List<Hero> result=m.get("hero-5555");
		long end=System.currentTimeMillis();
		System.out.printf("通过map查找，一共找到%d个英雄，耗时%d 毫秒%n",result.size(),end-start);
		return result;
	}
	/*生成四位随机数*/
	public static int random(){
		return ((int)(Math.random()*9000)+1000);
	}
}
