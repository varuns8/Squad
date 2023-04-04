package OTT;

import java.util.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.regex.*;

public class Function 
{
	String Name,AppName,Pack;
	long Contact,AccNo;
	float Prize;
	float Total;
	
	LinkedList<Customer> c = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
	
	// Menu
	public void menu() 
	{
		System.out.println("=======================================");
		System.out.println("Welcome to Our OTT Collections Services");
		System.out.println("=======================================");
		System.out.println(" ");
		System.out.println("---------------------------------------");
		System.out.println("|            1.Add Customer           |");
		System.out.println("---------------------------------------");
		System.out.println("|            2.Show Customer          |");
		System.out.println("---------------------------------------");
		System.out.println("|            3.Delete Customer        |");
		System.out.println("---------------------------------------");
		System.out.println("|            4.Update Customer        |");
		System.out.println("---------------------------------------");
		System.out.println("|            5.Exit                   |");
		System.out.println("---------------------------------------");
		
	}
	
	// Choice
	public void choice() 
	{
		System.out.println(" ");
		System.out.print("Enter Your Choice : ");
	}
	
	// Validation of Name
	public String ValName()
	{
		String name = sc.next();
		String regex = "[A-Z][a-z]*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		if (m.matches()==true && name.length()>1) 
		{
			Name=name;
		}
		else
		{
			System.out.println("---------------------------------------------------");
			System.out.print("Please Enter Valid Name : ");
			Name = ValName();
		}
		return Name;
	}
	
	// Validation of Mobile Number
	public long ValMob() 
	{
		String Mob =sc.next();
		if (Mob.length() == 10) 
		{
			Contact = Long.parseLong(Mob);
		}
		else 
		{
			System.out.println("---------------------------------------------------");
			System.out.print("Please Enter Valid Mobile Number : ");
			Contact = ValMob();
		}
		return Contact;
	}
	
	// View Plan
	public void plan() 
	{
		LinkedList<Plan> li =new LinkedList<>();
		Plan p1 = new Plan(101,"Hotstar",900);
		Plan p2 = new Plan(102,"Zee5   ",500);
		Plan p3 = new Plan(103,"Prime  ",1500);
		Plan p4 = new Plan(104,"SonyLiv",1000);
		Plan p5 = new Plan(105,"Voot   ",500);
		
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		li.add(p5);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("                        Our Plan");	
		System.out.println("------------------------------------------------------------");
		for(Plan p:li) 
		{
			System.out.println(p);
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("                   Our Packs and Offers");	
		System.out.println("------------------------------------------------------------");
		System.out.println("| 1.Select any 1 Plan in Bronze Pack and Get 2% Discount   |");
		System.out.println("| 2.Select any 2 Plan in Silver Pack and Get 4% Discount   |");
		System.out.println("| 3.Select any 3 Plan in Gold Pack and Get 6% Discount     |");
		System.out.println("| 4.Select any 4 Plan in Platinum Pack and Get 8% Discount |");
		System.out.println("| 5.Select any 5 Plan in Diamond Pack and Get 10% Discount |");
		System.out.println("------------------------------------------------------------");
		System.out.print("Select Your Favourite Pack Number : ");
		int Count = sc.nextInt();
		if(Count>5 && Count<100)
		{
			System.out.println("---------------------------------------------------");
			System.out.println("You Select Wrong Pack ! Try Again.");
			System.exit(0);
		}
		
		int i=1;
		float cost=0;
		System.out.println("---------------------------------------------------");
		while(i<=Count) 
		{
			System.out.print("Enter Your Favourite Plan Number Choice : ");
			int Select = sc.nextInt();
			i++;
			
			switch(Select) 
			{
			case 101:
				cost = cost + p1.getPrize();
				break;
				
			case 102:
				cost = cost + p2.getPrize();
				break;
				
			case 103:
				cost = cost + p3.getPrize();
				break;
				
			case 104:
				cost = cost + p4.getPrize();
				break;
				
			case 105:
				cost = cost + p5.getPrize();
				break;
					
			default:
				System.out.println("---------------------------------------------------");
				System.out.println("You Enter Wrong Plan Number ! Try Again.");
				System.exit(0);
			}
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("Before Discount Plan Cost is : "+cost);
			
		switch(Count) 
		{
		case 1:
			Pack="Bronze";
			cost=((cost*98/100));
			Total=cost;
			break;
			
		case 2:
			Pack="Silver";
			cost=((cost*96/100));
			Total=cost;
			break;
			
		case 3:
			Pack="Gold";
			cost=((cost*94/100));
			Total=cost;
			break;
			
		case 4:
			Pack="Platinum";
			cost=((cost*92/100));
			Total=cost;
			break;
		
		case 5:
			Pack="Diamond";
			cost=((cost*90/100));
			Total=cost;
			break;
				
		}
			
		System.out.println("---------------------------------------------------");
		System.out.println("After Discount Plan Cost is : "+cost);
		System.out.println("---------------------------------------------------");
			
	}
	
	// Add Customer
	public void add() 
	{
		// Customer Account Number
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");  
		LocalDateTime now = LocalDateTime.now();
		String str=dtf.format(now);
		AccNo = Long.parseLong(str); // String to long covert
		
		// Customer Name
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.print("Enter Customer Name : ");
		Name = ValName();
		
		// Customer Contact
		System.out.println("---------------------------------------------------");
		System.out.print("Enter Customer Mobile No : ");
		Contact = ValMob();
		
		// Select Plan
		plan();
		c.add(new Customer(AccNo,Name,Contact,Pack,Total)); // c is object of LinkedList which stored the customers details.
		System.out.println("---------------------------------------------------");
		System.out.println("New Customer Added Successfully ! ");
		System.out.println("---------------------------------------------------");
			
	} // add method closed
	
	// Show Customer
	public void show() 
	{
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
		Iterator<Customer> i = c.iterator();
		while(i.hasNext()) 
		{
			Customer customer = i.next();
			System.out.println(customer);
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
	} // Show Closed
	
	// Delete Customer
	public void dlt() 
	{
		boolean found=false;
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.print("Enter Account Number to Delete : ");
		long taccNo = sc.nextLong();
		
		Iterator<Customer> i = c.iterator();
		while(i.hasNext()) 
		{
			Customer customer = i.next();
			if(customer.getAccNo() == taccNo) 
			{
				i.remove();
				found=true;
			}
		}
		
		if(!found) 
		{
			System.out.println("---------------------------------------------------");
			System.out.println("Record Not Found ! ");
			System.out.println("---------------------------------------------------");
		} 
		else 
		{
			System.out.println("---------------------------------------------------");
			System.out.println("Record is Deleted Successfully ! ");
			System.out.println("---------------------------------------------------");
		}
	} // Delete Closed
	
	// Update Customer
	public void update() 
	{
		boolean found=false;
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.print("Enter Account Number to Update : ");
		long taccNo = sc.nextLong();
			
		ListIterator<Customer> li = c.listIterator();
		while(li.hasNext()) 
		{
			Customer customer = li.next();
			if(customer.getAccNo() == taccNo) 
			{
				AccNo = customer.getAccNo();
				
				// Name Update
				System.out.println("---------------------------------------------------");
				System.out.print("Enter New Name : ");
				Name = ValName();
				
				// Contact Update
				System.out.println("---------------------------------------------------");
				System.out.print("Enter New Contact : ");
				Contact = ValMob();
				
				// Pack Update
				System.out.println("---------------------------------------------------");
				System.out.println("Choose Your New Pack ");
				plan();
				li.set(new Customer(AccNo,Name,Contact,Pack,Total)); // li is object of ListIterater which used to stored updated Records.
				found=true;
			}
		}
			
		if(!found) 
		{
			System.out.println("---------------------------------------------------");
			System.out.println("Record Not Found ! ");
			System.out.println("---------------------------------------------------");
		} 
		else 
		{
			System.out.println("---------------------------------------------------");
			System.out.println("Record is Updated Successfully ! ");
			System.out.println("---------------------------------------------------");
		}
	} // Update Closed
	
	// Exit
	public void exit() 
	{
		System.out.println("---------------------------------------------------");
		System.out.println("                 Thank You ! ");
		System.out.println("---------------------------------------------------");
		System.exit(0);
	}
	
}
