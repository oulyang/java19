package m2d221;
//�̵߳��������ڣ��½�״̬---����״̬--����״̬---����״̬
//                              ^      |
//                              |  	   v
//                              ����״̬
public class Test1 {
	/*// �߳�ʵ�֣�
 * 		//��ʽ1����дһ���࣬�̳�java.lang.Thread,��дrun����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���߳�
		//������֧�߳�
		MyThread mt=new MyThread();
		
		//�����߳�
		//��������jvm�п���һ���µ�ջ�ռ䣬��������ɺ�˲�����
		//�����ɹ����߳��Զ�����run����������run��ջ�ײ�
		mt.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("���߳�"+i);
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
	//��ʽ2����дһ����ʵ��java.lang.Runnable�ӿ�
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(mr);
		
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("���߳�"+i);
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