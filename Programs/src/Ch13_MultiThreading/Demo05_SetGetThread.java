package Ch13_MultiThreading;

class My1 extends Thread
{
	public void run() {
		Thread.currentThread().setName("Video play");
		System.out.println(Thread.currentThread().getName());
	}
}

class My2 extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class Demo05_SetGetThread {

	public static void main(String[] args) {
		
		Thread.currentThread().setName("Watching Cricket"); //set name you want!!
		System.out.println(Thread.currentThread().getName());
		
		My1 m1 = new My1();
		m1.start();
		
		My2 m2 = new My2();
		m2.start();
		

	}

}
