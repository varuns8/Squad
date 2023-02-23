package Ch13_MultiThreading;

class yM extends Thread{
	public void run() {
		Thread.currentThread().setName("Seeta");
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}

public class yeildMethod {

	public static void main(String[] args) {
		yM th = new yM();
		th.start();
		Thread.yield();
		
		Thread.currentThread().setName("Geeta");
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}

	}

}
