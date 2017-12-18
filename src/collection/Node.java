package collection;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public Node leftNode;//���ӽڵ�
	public Node rightNode;//���ӽڵ�
	public Object value;//ֵ
	public void add(Object v){
		if(null==value){
		value=v;
	}else{
		//������ֵ�ȵ�ǰֵС��������ͬ
		if((Integer)v-((Integer)value)<=0){
			if(null==leftNode)
				leftNode=new Node();
			leftNode.add(v);
		}else{
			//������ֵ���ȵ�ǰ��
			if(null==rightNode)
				rightNode=new Node();
			rightNode.add(v);			
		}
	}
		
	}

	/*����������еĽڵ�*/
	public List<Object> values(){
		List<Object> values=new ArrayList();
		//���ڵ�������
		if(null!=leftNode)
			values.addAll(leftNode.values());
		//��ǰ�ڵ�
		values.add(value);
		//�ҽڵ�������
		if(null!=rightNode)
			values.addAll(rightNode.values());
		return values;
	}
	
	public static void main(String []args){
		int randoms[]=new int[]{67,2,46,89,58,41,0,12,46,15};
		Node root=new Node();
		for(int number:randoms)
			root.add(number);
		System.out.println(root.values());
	}
}
