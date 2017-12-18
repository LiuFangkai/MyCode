package CompareCollection;

import java.util.HashSet;

public class randomDiffNum {
	public static void main(String []args){
		HashSet<Integer> hashset=new HashSet<>();
		while(hashset.size()<50){
			hashset.add(Random());
		}
		int i=0;
		for(Integer e:hashset){
			System.out.print(e+" ");
			if((i+1)%10==0)
				System.out.println();
			i++;
			
		}
	}
	private static int Random(){
		return (int) (Math.random()*10000);
	}
}
