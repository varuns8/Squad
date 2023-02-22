package Ch13_MultiThreading;

class SeatBooking{
	int TotalSeat=10;
	synchronized void seatbook(int seat) {
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
}

public class MovieTicketAppByMethod extends Thread {

	static SeatBooking b;
	int seat;
	public void run()
	{
		b.seatbook(seat);
	}
	
	public static void main(String[] args) {
		b=new SeatBooking();
		MovieTicketAppByMethod sam=new MovieTicketAppByMethod();
		sam.seat=7;
		sam.start();
		
		MovieTicketAppByMethod ram=new MovieTicketAppByMethod();
		ram.seat=6;
		ram.start();	
	}

}
