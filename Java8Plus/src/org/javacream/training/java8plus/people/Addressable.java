package org.javacream.training.java8plus.people;

public interface Addressable {

	Address getAddress();
	default String getShortAddress() {
		return "city=" + getAddress().getCity() + ", street=" + getAddress().getStreet();
	}
	
	default String getCity() {
		return getAddress().getCity();
	}

	default String getStreet() {
		return getAddress().getStreet();
	}
	
	default Address getNormalizedAddress() {
		return new Address(getNormalizedCity(getCity()), getNormalizedStreet(getStreet()));
	}
	default String getNormalizedCity(String city) {
		return city.toUpperCase();
	}
	default String getNormalizedStreet(String street) {
		return street.toLowerCase();
	}

}