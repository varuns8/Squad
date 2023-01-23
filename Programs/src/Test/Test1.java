package Test;

interface Car{
	int seat = 4;
	
	void speed();
}

class Maruti implements Car{

	@Override
	public void speed() {
		System.out.println("Maruti car speed is 80 km/h");
		
	}
	
}

class BMW implements Car{

	@Override
	public void speed() {
		System.out.println("BMW car speed is 100 km/h");
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		Maruti m1 = new Maruti();
		m1.speed();
		System.out.println("Maruti seat "+m1.seat);
		
		BMW b1 = new BMW();
		b1.speed();
		System.out.println("BMW seat "+b1.seat);

	}

}
