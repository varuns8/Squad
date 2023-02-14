package Ch13_MultiThreading;

class SingleThread extends Thread implements Runnable{
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

public class Demo04_SingleTaskMultipleThread {

	public static void main(String[] args) {
		SingleThread mt1 = new SingleThread();
		mt1.start();
		SingleThread mt2 = new SingleThread();
		mt2.start();

	}

}
