package Ch13_MultiThreading;

class SeatBooking1{
	int TotalSeat=10;
	void seatbook(int seat) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		synchronized(this) {
		
		if(TotalSeat>=seat) 
		{
			System.out.println(seat+" Seat Book Successfully");
			TotalSeat-=seat;
			System.out.println(seat+" Seat left");
		}
		else 
		{
			System.out.println("Seats are not available");
			System.out.println(seat+" Seats left");
		}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}

public class MovieTicketAppByBlock extends Thread {
	
	static SeatBooking1 b1;
	int seat;
	public void run()
	{
		b1.seatbook(seat);
	}

	public static void main(String[] args) {
		b1=new SeatBooking1();
		MovieTicketAppByBlock sam=new MovieTicketAppByBlock();
		sam.seat=7;
		sam.start();
		
		MovieTicketAppByBlock ram=new MovieTicketAppByBlock();
		ram.seat=6;
		ram.start();	
	}

}
