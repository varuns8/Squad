package Ch17_CollectionFramework;

public class Student {
	int sid;
	String name,address;
	int per;
	
	public int getSid() {
		return sid;
	}
	public Student(int sid, String name, String address, int per) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.per = per;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + ", per=" + per + "]";
	}
	
	
	

}
