package basic;

public class GreaterBet3 {

	public static void main(String[] args) {
		int num1=10,num2=35,num3=17;
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+" is Greater");
			} else {
				System.out.println(num3+" is Greater");
			}
		} else if (num2>num3) {
			System.out.println(num2+" is Greater");
		} else {
			System.out.println(num3+" is Greater");
		}

	}

}
