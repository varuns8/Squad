package Ch13_MultiThreading;

class mythread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("wakeup");
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

public class Demo01{
	public static void main(String[] args) {
		mythread mt = new mythread();
		mt.start();
	}
}
