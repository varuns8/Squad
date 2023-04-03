package OTT;

public class Customer 
{
	private String Name,Pack;
	private long Contact,AccNo;
	private float Total;
	
	public Customer(long accNo, String name, long contact, String pack, float total) 
	{
		AccNo = accNo;
		Name = name;
		Contact = contact;
		Pack = pack;
		Total = total;
	}

	public long getAccNo() 
	{
		return AccNo;
	}

	public void setAccNo(long accNo) 
	{
		AccNo = accNo;
	}
	
	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		Name = name;
	}

	public long getContact() 
	{
		return Contact;
	}

	public void setContact(long contact) 
	{
		Contact = contact;
	}
	
	public String getPack() 
	{
		return Pack;
	}

	public void setPack(String pack) 
	{
		Pack = pack;
	}

	public float getTotal() 
	{
		return Total;
	}

	public void setTotal(float total) 
	{
		Total = total;
	}

	@Override
	public String toString() 
	{
		return "Customer Account Number : " + AccNo + " | Customer Name : " + Name + " | Contact : " + Contact + " | Pack Name : " + Pack + " | Plan Cost is : " + Total + " |";
	}

}
