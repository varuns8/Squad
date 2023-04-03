package MotorsTrainningSchool;

public class Motors {
	private String Name,Fees,Slot;
	private long Contact;
	private int Validity;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFees() {
		return Fees;
	}
	public void setFees(String fees) {
		Fees = fees;
	}
	public String getSlot() {
		return Slot;
	}
	public void setSlot(String slot) {
		Slot = slot;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
	public int getValidity() {
		return Validity;
	}
	public void setValidity(int validity) {
		Validity = validity;
	}
	
	
	public Motors(String name, String fees, String slot, long contact, int validity) {
		super();
		Name = name;
		Fees = fees;
		Slot = slot;
		Contact = contact;
		Validity = validity;
	}
	
	@Override
	public String toString() {
		return "Motors [Name=" + Name + ", Fees=" + Fees + ", Slot=" + Slot + ", Contact=" + Contact + ", Validity="
				+ Validity + "]";
	}
	
	

}
