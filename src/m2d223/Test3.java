package m2d223;
/**
 * �̲߳���ȫ������������1.���̲߳���
 * 					    2.�й�������
 * 						3.�����������޸���Ϊ
 * ����������߳��Ŷ�ִ��(�߳�ͬ������)��������һЩЧ��
 * @author yyds
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account("wusan",10000);
		//���������߳�
		Thread t1=new AccountThread(a1);
		Thread t2=new AccountThread(a1);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

}
