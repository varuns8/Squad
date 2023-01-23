package Polymorphism;

class demo1 
{
	double Area(double r)
	{
		double A = 3.14*r*r;
		return A;
	}
	
	void Area(int l, int b)
	{
		int A=l*b;
		System.out.println("Area of Rectangle is: "+A);
	}
	
	void Area(int side)
	{
		int A= side*side;
		System.out.println("Area of Square is: "+A);
	}

}

public class Shape
{
	public static void main(String[] args) 
	{
		demo1 s = new demo1();
		double A=s.Area(5.0);
		System.out.println("Area of Circle is: "+A);
		s.Area(10, 5);
		s.Area(5);
	}
}


