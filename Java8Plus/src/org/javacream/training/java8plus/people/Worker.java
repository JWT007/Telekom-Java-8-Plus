package org.javacream.training.java8plus.people;

import org.javacream.training.java8plus.people.Company;

public class Worker extends Person {

	private Company company;

	public Worker(String lastname, String firstname, Company company) {
		super(lastname, firstname);
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
