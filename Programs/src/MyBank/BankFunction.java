package MyBank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class BankFunction {
	
	String Name, EmailId, AccType,atype;
	long MobNo, AccNo, sacc, racc;
	int count=0;
	float Bal, sbal, rbal;
	
	Bank bank[] = new Bank[20];
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("1.Add Account: ");
		System.out.println("2.Show Account: ");
		System.out.println("3.Show All Account: ");
		System.out.println("4.Delete Account: ");
		System.out.println("5.Deposit Money: ");
		System.out.println("6.Withdraw Money: ");
		System.out.println("7.Transfer Money: ");
		System.out.println("8.Exit");
		
	}
	
		// Email Validation
		public String ValidEmail(String EmailId) {
			if (EmailId==null && EmailId.isEmpty()) {
				System.out.println("Please Enter Email: ");
				return EmailId;
			}
			
			String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
			Pattern pat = Pattern.compile(emailRegex);
			if(pat.matcher(EmailId).matches()) {
				System.out.println(" ");
			}
			else {
				System.out.println("Invalid Email Id: ");
				EmailId = ValidEmail(sc.next());
			}
			return EmailId;
		}
	
		// Account Type Validation
		public String accountType() {
			System.out.println("1. Saving");
			System.out.println("2. Current");
			System.out.println("Enter Account Type: ");
			int at=sc.nextInt();
			
			if(at == 1) {
				atype="Saving";
			}
			else if(at == 2) {
				atype="Current";
			}
			else {
				System.out.println("Enter Account Type: ");
				atype=accountType();
			}
			return atype;
		}
	
		// Mobile No Validation
		public long Mobn() {
			System.out.println("Enter the Mobile No: ");
			String Mob =sc.next();
			if (Mob.length() == 10) {
				MobNo = Long.parseLong(Mob);
				
			}
			else {
				System.out.println("Please Enter 10 Digit Mobile No..!!");
				MobNo = Mobn();
			}
			return MobNo;
		}
	
		// Add Account
		public void add() {
			// Name
			System.out.println("Enter the Name: ");
			Name=sc.next();
			
			// Email
			System.out.println("Enter the Email Id: ");
			EmailId=ValidEmail(sc.next());
			
			// Mobile Number
			MobNo=Mobn();
			
			// Account Number Generator
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
			LocalDateTime now = LocalDateTime.now();
			String str=dtf.format(now);
			AccNo = Long.parseLong(str); // String to long covert
			
			
			// Account Type
			AccType=accountType();
			
			// Balance
			System.out.println("Enter the Account Bal: ");
			Bal=sc.nextFloat();
			
			if(Bal>=500) {
			bank[count]= new Bank(Name,EmailId,AccType,MobNo,AccNo,Bal);
			count++;
			System.out.println("Add Account Successfully");
			System.out.println("****************************");
			System.out.println(" ");
			}
			else {
				System.out.println("Minimum 500 Balance is Required to Open Account...!!!");
				Bal=sc.nextFloat();
				System.out.println(" ");
			}
		}
		
		// Search Account
		public void search(){
			boolean found = false;

			System.out.println("Enter Account Number for Search: ");
			long ser =sc.nextLong();
			for(int i=0;i<count;i++){
				if(bank[i] != null && bank[i].getAccNo()==ser){
					bank[i].display();
					found = true;
				}
			}
			if(found == true){
				System.out.println("Search Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			else {
				System.out.println("Enter Correct: ");
				search();
			}
		}
		
		// Show All Account
		public void showall(){
			for (int i=0; i<count; i++){
				if (bank[i] != null) {
					bank[i].display();
					System.out.println("****************************");
					System.out.println(" ");
				}
			}
		}
		
		// Delete Account
		public void dlt() {
			boolean found=false;
			
			System.out.println("Enter Account Number for Delete: ");
			long dlt = sc.nextLong();
			for(int i=0; i<count; i++) {
				if (bank[i] != null && bank[i].getAccNo()==dlt) {
					bank[i] = null;
					found=true;
				}
			}
			if(found == true){
				System.out.println("Delete Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			else {
				System.out.println("Enter Correct: ");
				dlt();
			}
		}
		
		
		// Add Money
		public void addm() {
			boolean found=false;
			
			System.out.println("Enter User Account Number to Deposit Money: ");
			long addn = sc.nextLong();
			for(int i=0; i<count; i++) {
				if (bank[i] != null && bank[i].getAccNo()==addn) {
					Bal = bank[i].getBal();
					System.out.println("Enter Amount to Add: ");
					float tBal = sc.nextFloat();
					Bal += tBal;
					bank[i].setBal(Bal);
					found = true;
				}
			}
			if(found == true){
				System.out.println("Balance Deposit Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			else {
				System.out.println("Enter Correct: ");
				addm();
			}
			
		}
		
		// Remove Money
		public void rmv() {
			boolean found=false;
					
			System.out.println("Enter User Account Number to Withdraw Money: ");
			long rmvn = sc.nextLong();
			for(int i=0; i<count; i++) {
				if (bank[i] != null && bank[i].getAccNo()==rmvn) {
					Bal = bank[i].getBal();
					System.out.println("Enter Amount to Remove: ");
					float trBal = sc.nextFloat();
					Bal -= trBal;
					if(Bal>=500) {
					bank[i].setBal(Bal);
					found = true;
					}
					else {
						System.out.println("Insufficient Fund...!!!");
					}
				}
			}
			if(found == true){
				System.out.println("Balance Withdraw Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
					
		}
		
		// Transfer Money
		public void trans() {
			boolean found=false;
			
			System.out.println("Enter Sender Account No: ");
			sacc = sc.nextLong();
			for(int i=0; i<count; i++) {
				if (bank[i] != null && bank[i].getAccNo()==sacc) {
					Bal = bank[i].getBal();
					System.out.println("Enter Amount to Send: ");
					sbal = sc.nextFloat();
					Bal -= sbal;
					if(Bal>=500) {
					bank[i].setBal(Bal);
					}
					else {
						System.out.println("Insufficient Fund to Transfer Money...!!!");
					}
				}
			}
			if(Bal<=499) {
				System.out.println(" ");
			}
			else {
			System.out.println("Enter Receiver Account No: ");
			racc = sc.nextLong();
			if (sacc == racc) {
				System.out.println("Account Number Same as Sender Account No...!!!");
				System.out.println("Enter Correct Receiver Account Number: ");
				racc = sc.nextLong();
			}
			for(int i=0; i<count; i++) {
				if (bank[i] != null && bank[i].getAccNo()==racc) {
					Bal = bank[i].getBal();
					rbal = sbal;
					Bal += rbal;
					bank[i].setBal(Bal);
					found=true;
				}
			}
			}
			if(found == true){
				System.out.println("Transfer Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			else {
				System.out.println("Transfer Fail...!!!");
			}
			
		}
		
		
}