package m2d222;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ȡ��ǰ�̶߳���
		//������������main�����У���ǰ�߳̾������߳�
		Thread t=Thread.currentThread();
		
		//�����̶߳���
		MyThread2 mt2=new MyThread2();
		
		//�����߳�����
		//���߳�û����������ʱ��Ĭ������ΪThread-0��Thread-1������
		mt2.setName("setset");
		
		String s=mt2.getName();
		System.out.println(s);
		
		//sleep�����Ǿ�̬�ģ������Ǻ��룬�����ǵ�ǰ�̷߳���ռ��cpuʱ��Ƭ����������״̬
		//���Լ���ض�ʱ��ִ���ض��Ĵ���
		try {
			mt2.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//��ȡ�߳����ȼ�
		System.out.println(mt2.getPriority());
		
		//�߳���λ��ǰ�̻߳ص�����״̬���ø������߳�
		mt2.yield();
		
		//�ϲ��߳�
		try {
			mt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//mt2�̺߳ϲ�����ǰ�߳��У���ǰ�߳���������mt2�߳�ִ��ֱ������
		
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