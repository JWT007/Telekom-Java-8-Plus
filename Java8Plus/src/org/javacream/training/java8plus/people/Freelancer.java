package org.javacream.training.java8plus.people;

public class Freelancer extends Person {

	public Freelancer(Long id, String lastname, String firstname) {
		super(id, lastname, firstname);
	}

	private Double salary;

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
