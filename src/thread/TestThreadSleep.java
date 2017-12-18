package thread;
/*
 * 波动拳 a du gen
 * */
public class TestThreadSleep {
	public static void main(String []args){
		Thread t1=new Thread(){
			public void run(){
				while(true){
					try {
					System.out.println("波动拳第1发");
					Thread.sleep(1000);
					System.out.println("波动拳第2发");
					Thread.sleep(1000);
					System.out.println("波动拳第3发");
					Thread.sleep(1000);
					System.out.println("开始为时5秒的充能");
					Thread.sleep(5000);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
	}
}
