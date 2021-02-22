package m2d223;
/**
 * 线程不安全的三个条件：1.多线程并发
 * 					    2.有共享数据
 * 						3.共享数据有修改行为
 * 解决方法：线程排队执行(线程同步机制)，会牺牲一些效率
 * @author yyds
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account("wusan",10000);
		//创建两个线程
		Thread t1=new AccountThread(a1);
		Thread t2=new AccountThread(a1);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

}
