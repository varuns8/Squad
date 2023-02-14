package Ch13_MultiThreading;

class My3 extends Thread
{
	//Scheduler Decided the Sequence
	public void run() {
		Thread.currentThread().setName("Video play");
		System.out.println(Thread.currentThread().getName());
	}
}

class My4 extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class Demo06_SequanceChange {

	public static void main(String[] args) {
		
		My3 m1 = new My3();
		m1.start();
		
		My4 m2 = new My4();
		m2.start();
		
		Thread.currentThread().setName("Watching Cricket"); //set name you want!!
		System.out.println(Thread.currentThread().getName());
		
		
		

	}

}

