package m2d221;
//线程的生命周期：新建状态---就绪状态--运行状态---死亡状态
//                              ^      |
//                              |  	   v
//                              阻塞状态
public class Test1 {
	/*// 线程实现：
 * 		//方式1：编写一个类，继承java.lang.Thread,重写run方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//主线程
		//创建分支线程
		MyThread mt=new MyThread();
		
		//启动线程
		//作用是在jvm中开辟一个新的栈空间，在任务完成后瞬间结束
		//启动成功的线程自动调用run方法，并且run在栈底部
		mt.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("主线程"+i);
		}
	}

}

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
*/
	//方式2：编写一个类实现java.lang.Runnable接口
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(mr);
		
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("主线程"+i);
		}
	}
}

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}