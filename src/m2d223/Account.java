package m2d223;

public class Account {
	private String no;
	private double balance;
	public Account() {
		super();
	}
	public Account(String no, double balance) {
		super();
		this.no = no;
		this.balance = balance;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double money) {
		//线程同步
		synchronized (this) {//()内的数据必须是共享的，这样才能达到多线程排队
			double before=this.getBalance();
			double after=before-money;
			try {
				Thread.sleep(1000*2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setBalance(after);
		}

	}
	
}
