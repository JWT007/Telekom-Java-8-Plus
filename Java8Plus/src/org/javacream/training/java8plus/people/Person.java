package org.javacream.training.java8plus.people;

import java.util.Optional;

public class Person implements Addressable {
	public static final Address DEFAULT_ADDRESS = new Address("UNKNOWN CITY", "UNKNOWN STREET");
	private String lastname;
	private String firstname;
	private Long id;
	private Optional<Address> address = Optional.empty();
	
	public Person(Long id, String lastname, String fristname) {
		super();
		this.lastname = lastname;
		this.firstname = fristname;
		this.id= id;
	}
	
	public Person(Long id, String lastname, String fristname, Address address) {
		super();
		this.lastname = lastname;
		this.firstname = fristname;
		this.id = id;
		this.address = Optional.of(address);
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
		return address.orElse(DEFAULT_ADDRESS);
	}
	public void setAddress(Address address) {
		this.address = Optional.of(address);
	}
	public String getFirstname() {
		return firstname;
	}
	public Long getId() {
		return id;
	}
}
