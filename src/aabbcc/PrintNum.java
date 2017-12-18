package aabbcc;

public class PrintNum {	
	    public static void main(String[] args) {         
	       flag:    //添加标签，直接从内部结束总循环
	    	for (int i = 0; i < 10; i++){
	    		
	            for (int j = 0; j < 10; j++) {
	            	System.out.println(i+":"+j);
	            	if(0==j%2)
	            
	            		break flag; //如果是双数，结束当前循环
	    		}
		
			}
	    	
	    }
}
