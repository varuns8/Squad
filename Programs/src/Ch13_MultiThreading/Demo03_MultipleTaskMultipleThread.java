package Ch13_MultiThreading;

class MyThread1 extends Thread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("task01");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("task02");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo03_MultipleTaskMultipleThread {

	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		MyThread2 mt2 = new MyThread2();
		mt2.start();

	}

}
