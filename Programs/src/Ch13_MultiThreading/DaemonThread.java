package Ch13_MultiThreading;

class Demo extends Thread{
	public void run() {
		//System.out.println("Run Thread");
		//Thread.currentThread().setDaemon(true); //make current thread as a daemon thread
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Yes Daemon Thread");
		}
		else {
			System.out.println("Child Thread");
		}
		
	}
}

public class DaemonThread {

	public static void main(String[] args) {
		System.out.println("Main Thread"); //cannot make main thread as a daemon thread
		Demo d = new Demo();
		d.setDaemon(true);//make daemon thread
		d.start();
		

	}

}
