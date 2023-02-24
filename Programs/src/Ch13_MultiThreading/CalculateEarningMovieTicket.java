package Ch13_MultiThreading;

class TotalEarning extends Thread{
	int total=0;
	public void run() {
		synchronized(this) 
		{
			for(int i=1;i<=10;i++) 
			{
				total=total+100;
			}
			this.notify(); //here child thread send notification to main thread after completion of task.
		}
	}
}

public class CalculateEarningMovieTicket {

	public static void main(String[] args) throws InterruptedException {
		TotalEarning t = new TotalEarning();
		t.start();
		
		synchronized(t) 
		{
			t.wait(); //here main thread wait for child thread until its completes its task.
			System.out.println("Total Earning is: "+t.total);
		}

	}

}
