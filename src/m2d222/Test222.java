package m2d222;

public class Test222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new MyRunnable2());
		t.setName("tt");
		t.start();
		
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//t.stop();//ǿ����ֹ���ߣ��ѹ�ʱ��  ���׶�����
		t.interrupt();//��ֹ˯�ߣ������쳣������ƣ�
	}

}
class MyRunnable2 implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"begin");
		
		try {
			Thread.sleep(1000*60*60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"end");

	}


}
