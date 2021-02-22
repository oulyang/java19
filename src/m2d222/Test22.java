package m2d222;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mt3=new MyThread3();
		mt3.setName("mt");
		mt3.start();
		
		try {
			mt3.sleep(1000);  			//执行这段代码不会让线程mt3进入休眠状态
										//执行的时候会转化成 Thread.sleep(),作用是让main线程进入休眠
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}
class MyThread3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+" "+i);
		}
	}
}