package uk.ac.port.spring;

public class Person {
	private int id;
	private String name;
	private Address address;
	
	private int texId;
	
	public Person() {
		
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setTexId(int texId) {
		this.texId = texId;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("Hello, I'm a person!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address
				+ ", texId=" + texId + "]";
	}
}
