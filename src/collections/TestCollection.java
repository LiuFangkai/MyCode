package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
	public static void main(String []args){
		List<Integer> numbers=new ArrayList();
		System.out.println("�ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List");
		List<Integer> synchronizedNumbers=(List<Integer>)Collections.synchronizedList(numbers);
		for(int i=0;i<10;i++)
			numbers.add(i);
		System.out.println("��ʼ����Ϊ:"+numbers);
		
		Collections.reverse(numbers);//��ת
		System.out.println("��ת�������:"+numbers);
		Collections.shuffle(numbers);//�Ѽ����е����ݴ���
		System.out.println("���Һ������:"+numbers);
		Collections.sort(numbers);//����
		System.out.println("����������:"+numbers);
		Collections.swap(numbers, 0, 9);//�Ѽ���numbers�е�0��Ԫ�غ͵�9��Ԫ�ؽ���
		System.out.println("�����������:"+numbers);
		Collections.rotate(numbers, 2);//�Ѽ�����Ԫ�����ҹ���2��λ��
		System.out.println("�����������:"+numbers);
	}
}
