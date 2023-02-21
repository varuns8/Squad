package Ch13_MultiThreading;

class demo1 extends Thread{
	public void run() {
		Thread.currentThread().setPriority(3);;
		System.out.println("Child Thread: "+Thread.currentThread().getPriority());
	}
}

public class GetSetPriorityUsingThread {

	public static void main(String[] args) {
		demo1 d1 = new demo1();
		d1.start();
		
		try {
			d1.join();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// Main Thread:
		Thread.currentThread().setPriority(6);
		System.out.println("Main Thread: "+Thread.currentThread().getPriority());
		
		
		
	}

}
