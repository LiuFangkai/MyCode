package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
	public static void main(String []args){
		List<Integer> numbers=new ArrayList();
		System.out.println("把非线程安全的List转换为线程安全的List");
		List<Integer> synchronizedNumbers=(List<Integer>)Collections.synchronizedList(numbers);
		for(int i=0;i<10;i++)
			numbers.add(i);
		System.out.println("初始数据为:"+numbers);
		
		Collections.reverse(numbers);//反转
		System.out.println("反转后的数据:"+numbers);
		Collections.shuffle(numbers);//把集合中的数据打乱
		System.out.println("打乱后的数据:"+numbers);
		Collections.sort(numbers);//排序
		System.out.println("排序后的数据:"+numbers);
		Collections.swap(numbers, 0, 9);//把集合numbers中第0个元素和第9个元素交换
		System.out.println("交换后的数据:"+numbers);
		Collections.rotate(numbers, 2);//把集合中元素向右滚动2个位置
		System.out.println("滚动后的数据:"+numbers);
	}
}
