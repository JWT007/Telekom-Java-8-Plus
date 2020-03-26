package org.javacream.training.java8plus.people;

public class Company implements Addressable{

	private String companyName;
	public String getName() {
		return companyName;
	}
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}
}
