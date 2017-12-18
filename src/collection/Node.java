package collection;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public Node leftNode;//左子节点
	public Node rightNode;//右子节点
	public Object value;//值
	public void add(Object v){
		if(null==value){
		value=v;
	}else{
		//新增的值比当前值小，或者相同
		if((Integer)v-((Integer)value)<=0){
			if(null==leftNode)
				leftNode=new Node();
			leftNode.add(v);
		}else{
			//新增的值，比当前大
			if(null==rightNode)
				rightNode=new Node();
			rightNode.add(v);			
		}
	}
		
	}

	/*中序遍历所有的节点*/
	public List<Object> values(){
		List<Object> values=new ArrayList();
		//做节点遍历结果
		if(null!=leftNode)
			values.addAll(leftNode.values());
		//当前节点
		values.add(value);
		//右节点遍历结果
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
