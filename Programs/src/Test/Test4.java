package Test;

class MyThread1 extends Thread{
	public void run() {
		for(int i=1;i<=6;i++) {
			System.out.print("//*");
		}
		//System.out.println();
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i=1;i<=1;i++) {
			System.out.print("//");
		}
		//System.out.println();
	}
}

public class Test4 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		MyThread2 t2 = new MyThread2();
		t2.start();

	}

}
