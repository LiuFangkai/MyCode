package thread;
/*
 * ����ȭ a du gen
 * */
public class TestThreadSleep {
	public static void main(String []args){
		Thread t1=new Thread(){
			public void run(){
				while(true){
					try {
					System.out.println("����ȭ��1��");
					Thread.sleep(1000);
					System.out.println("����ȭ��2��");
					Thread.sleep(1000);
					System.out.println("����ȭ��3��");
					Thread.sleep(1000);
					System.out.println("��ʼΪʱ5��ĳ���");
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
