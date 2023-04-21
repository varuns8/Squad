package Ch11_JDKfeatures;

interface A1{
	void m1(int a,int b);//functional interface
}

public class LambdaExpressionEx1 {

	public static void main(String[] args) {
		A1 a1=(a,b)->System.out.println("Hello "+(a+b));
		
		a1.m1(10,30);

	}

}
