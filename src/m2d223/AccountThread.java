package m2d223;

public class AccountThread extends Thread{
	//两个线程必须共享账户对象
	private Account act;
	public AccountThread(Account act) {
		this.act=act;
	}
	public void run() {
		double money=1000;
		act.withdraw(money);
		System.out.println(Thread.currentThread().getName()+"对"+act.getNo()+"已取"+money+",剩余"+act.getBalance());
	}
}
