package Ch17_CollectionFramework;

public class Person implements Comparable<Person> {
	
	Integer id;
	String name;
	long phone;
	String add;
	
	Person(Integer id,String name,long phone,String add){
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.add=add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	public String toString()
	{
		return "Person Id\t: "+id+"\nPerson Name\t: "+name+"\nPerson Mobile\t: "+phone+"\nPerson Location\t: "+add+"\n";
	}

	@Override
	public int compareTo(Person o) {
		return this.id.compareTo(o.id);
	}

}
