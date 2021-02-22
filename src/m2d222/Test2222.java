package m2d222;

public class Test2222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable3 mr3=new MyRunnable3();
		Thread t=new Thread(mr3);
		t.setName("tt");
		t.start();
		
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mr3.run=false;
	}

}


class MyRunnable3 implements Runnable{
	boolean run=true;
	public void run(){
		
		for(int i=0;i<10;i++) {
			if(run) {
				System.out.println(Thread.currentThread().getName()+"begin");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				System.out.println(Thread.currentThread().getName()+"end");
				return;
			}
		}

		
		

	}


}