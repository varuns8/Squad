package Ch12_ExceptionHandling;

import java.util.Scanner;

class Checkingacc
{
	private int accnum;
	private double bal;
	
	Checkingacc(int accnum)
	{
		this.accnum=accnum;
	}
	
	public int getAccNum() 
	{
		return accnum;
	}
	public void setAccNum(int accnum) 
	{
		this.accnum = accnum;
	}
	public double getBal() 
	{
		return bal;
	}
	public void setBal(double bal) 
	{
		this.bal = bal;
	}
	
	/*public String toString()
	{
		return "Number: "+num + "Balance: "+bal;
	}*/
	
	void deposit(double amount)
	{
		bal=bal+amount;
	}
	
	void withdwaw(double amount)
	{
		if(bal>amount)
		{
			bal=bal-amount;
		}
		else
		{
			throw new InsufficiantBalException("Low Balance");
		}
	}
	
	void transfer(double taccnum)
	{
		if(accnum==taccnum)
		{
			System.out.println("Transfer Successfully!!");
		}
		else
		{
			throw new TransferException("Account not exist!!!");
		}
	}
	
}

class InsufficiantBalException extends RuntimeException
{
	String msg;
	
	InsufficiantBalException(String msg)
	{
	
	super(msg);
	}
}

class TransferException extends RuntimeException
{
	String msg;
	
	TransferException(String msg)
	{
	
	super(msg);
	}
}

public class BankBal {

	public static void main(String[] args)
	{
		try
		{
		Checkingacc ca = new Checkingacc(101);
		System.out.println("Account number: "+ca.getAccNum());
		ca.setBal(5000);
		System.out.println("Intial Balance is: "+ca.getBal());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to Deposit: ");
		double damount = sc.nextDouble();
		ca.deposit(damount);
		System.out.println("Current Balance is: "+ca.getBal());
		System.out.println("Enter amount to withdraw: ");
		double wamount = sc.nextDouble();
		ca.withdwaw(wamount);
		System.out.println("Current Balnce is: "+ca.getBal());
		System.out.println("Enter Destination Account Number: ");
		double taccnum = sc.nextDouble();
		ca.transfer(taccnum);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Successfully Done!");
		

	}

}
