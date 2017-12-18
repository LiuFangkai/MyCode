package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection{
	public static void main(String []args){
		List<Hero> heros=new ArrayList<>();
		//初始化5个对象
		for(int i=0;i<5;i++){
			heros.add(new Hero("hero"+i));
			}
		
		System.out.println("-----增强型for循环-------");
		for(Hero hero:heros){
			System.out.println(hero);
		}
		System.out.println("------for循环遍历--------");
		for(int i=0;i<heros.size();i++){
			Hero h=heros.get(i);
			System.out.println(h);
		}
		
		System.out.println("------使用while的iterator——----");
		Iterator<Hero> it=heros.iterator();
		while(it.hasNext()){
			Hero h=it.next();
			System.out.println(h);
		}
		
		System.out.println("-------使用for的iterator-------");
		for(Iterator<Hero> iterator=heros.iterator();iterator.hasNext();){
			Hero hero=(Hero)iterator.next();
			System.out.println(hero);
		}
		Hero specialHero=new Hero("special hero");
		heros.add(specialHero);	
		System.out.println(heros);
		System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));
		System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero("hero 1")));
		
		/*ArrayList实现了接口List
		 * 接口引用指向子类对象（多态）
		 * */
		List hero=new ArrayList();
		List<Hero> gen=new ArrayList<>();	//泛型
		hero.add(new Hero("盖伦"));
		System.out.println(hero.size());
	}
}