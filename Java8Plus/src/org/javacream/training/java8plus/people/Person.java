package org.javacream.training.java8plus.people;

import java.util.Optional;

import org.javacream.training.java8plus.people.Address;
import org.javacream.training.java8plus.people.Addressable;

public class Person implements Addressable {
	private static final Address DEFAULT_FOR_PERSON = new Address("Irgend", "Wo");
	private static final String PREFIX = "F";
	private String lastname;
	private String firstname;
	private Optional<Address> address;
	
	@Override
	public Address getAddress() {
		//return address.get();//TOTAL FALSCH!
		return address.orElse(DEFAULT_FOR_PERSON);
	}
	public void setAddress(Address address) {
		this.address = Optional.of(address);
	}
	public Person(String lastname, String firstname) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
	}
	@Override
	public String toString() {
		return "Person [lastname=" + lastname + ", firstname=" + firstname + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public static boolean checkNameBeginsWith(String name) {
		return name.startsWith(PREFIX);
	}
}
