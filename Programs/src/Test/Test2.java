package Test;

import java.util.Scanner;

//given real time example of user define exception

class Account{

	private int accno;
	private int bal;
	
	Account(int accno){
		this.accno=accno;
	}
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
	
	void deposit(int damount) {
		bal+=damount;
	}
	
	void withdraw(int wamount) {
		if(bal>wamount) {
			bal-=wamount;
		}
		else
		{
			throw new InsufficientbalException("Low Balance");
		}
	}
	
	void transfer(int taccno) {
		if(accno==taccno) {
			System.out.println("Valid Account Number");
		}
		else
		{
			throw new InvaliAccNoException("Invalid Account Number");
		}
	}
	
	
	
}

class InsufficientbalException extends RuntimeException{
	String msg;
	
	InsufficientbalException(String msg){
		super(msg);
	}
	
}

class InvaliAccNoException extends RuntimeException{
	String msg;
	
	InvaliAccNoException(String msg){
		super(msg);
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		Account a1 = new Account(101);
		System.out.println("Account Number: "+a1.getAccno());
		a1.setBal(1000);
		System.out.println("Initial Balance: "+a1.getBal());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deposit Amount");
		int damount = sc.nextInt();
		a1.deposit(damount);
		System.out.println("After Deposit Balance: "+a1.getBal());
		System.out.println("Enter Withdraw Balance: ");
		int wamount = sc.nextInt();
		a1.withdraw(wamount);
		System.out.println("After Withdraw Balance: "+a1.getBal());
		System.out.println("Enter Account Number: ");
		int taccno = sc.nextInt();
		a1.transfer(taccno);
		

	}

}
