package Ch13_MultiThreading;

class MyThread extends Thread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("task");
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

public class Demo02 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		// Thread t = new Thread(mt);
		mt.start();

	}

}
