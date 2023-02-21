package Ch13_MultiThreading;

class demo1 extends Thread{
	public void run() {
		Thread.currentThread().setPriority(MAX_PRIORITY);;
		System.out.println("Child Thread: "+Thread.currentThread().getPriority());
	}
}

public class GetSetPriorityUsingThread {

	public static void main(String[] args) {
		demo1 d1 = new demo1();
		Thread.currentThread().setPriority(3);
		System.out.println("Main Thread: "+Thread.currentThread().getPriority());
		d1.start();

	}

}
