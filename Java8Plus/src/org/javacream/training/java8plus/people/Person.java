package org.javacream.training.java8plus.people;

public class Person implements Addressable {

	public Person(String lastname, String fristname) {
		super();
		this.lastname = lastname;
		this.firstname = fristname;
	}
	private String lastname;
	private String firstname;
	private Long id;
	private Address address;
	public Person(String lastname, String fristname, Long id, Address address) {
		super();
		this.lastname = lastname;
		this.firstname = fristname;
		this.id = id;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [lastname=" + lastname + ", firstname=" + firstname + ", id=" + id + ", address=" + address
				+ "]";
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public Long getId() {
		return id;
	}
}
