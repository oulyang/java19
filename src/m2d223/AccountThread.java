package m2d223;

public class AccountThread extends Thread{
	//�����̱߳��빲���˻�����
	private Account act;
	public AccountThread(Account act) {
		this.act=act;
	}
	public void run() {
		double money=1000;
		act.withdraw(money);
		System.out.println(Thread.currentThread().getName()+"��"+act.getNo()+"��ȡ"+money+",ʣ��"+act.getBalance());
	}
}
