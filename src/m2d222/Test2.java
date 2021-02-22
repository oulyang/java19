package m2d222;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//获取当前线程对象
		//这个代码出现在main方法中，当前线程就是主线程
		Thread t=Thread.currentThread();
		
		//创建线程对象
		MyThread2 mt2=new MyThread2();
		
		//设置线程名字
		//当线程没有设置名字时，默认名字为Thread-0、Thread-1、、、
		mt2.setName("setset");
		
		String s=mt2.getName();
		System.out.println(s);
		
		//sleep方法是静态的，参数是毫秒，作用是当前线程放弃占用cpu时间片，进入阻塞状态
		//可以间隔特定时间执行特定的代码
		try {
			mt2.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//获取线程优先级
		System.out.println(mt2.getPriority());
		
		//线程让位当前线程回到就绪状态，让给其他线程
		mt2.yield();
		
		//合并线程
		try {
			mt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//mt2线程合并到当前线程中，当前线程受阻塞，mt2线程执行直到结束
		
		mt2.start();
		System.out.println("hello world");
	}

}

class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+" "+i);
		}
	}
}