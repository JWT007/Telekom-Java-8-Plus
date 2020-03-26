package org.javacream.training.java8plus.people;

import org.javacream.training.java8plus.people.Address;
import org.javacream.training.java8plus.people.Addressable;

public class University implements Addressable{

	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public University(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getCity() {
		//return "overriding is ok";
		return Addressable.super.getCity();
	}


}
