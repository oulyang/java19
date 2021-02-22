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
		//�߳�ͬ��
		synchronized (this) {//()�ڵ����ݱ����ǹ���ģ��������ܴﵽ���߳��Ŷ�
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
