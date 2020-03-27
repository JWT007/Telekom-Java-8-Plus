package org.javacream.training.java8plus.people;

import java.util.Map;
import java.util.Random;

public class PersonCreateFunctions {
	
	private static Random random = new Random();
	public static Worker worker(String lastname, String firstname, Map<String, Object> options) {
		Company company = (Company) options.get("company");
		Worker worker = new Worker(random.nextLong(), lastname, firstname, company);
		return worker;
	}

	public static Student student(String lastname, String firstname, Map<String, Object> options) {
		University university = (University) options.get("university");
		return new Student(random.nextLong(), lastname, firstname, university);
	}

	public static Freelancer freelancer(String lastname, String firstname, Map<String, Object> options) {
		Freelancer freelancer = new Freelancer(random.nextLong(), lastname, firstname);
		freelancer.setSalary((double) options.get("salary"));
		return freelancer;

	}

	public static Person person(String lastname, String firstname, Map<String, Object> options) {
		return new Person(random.nextLong(), lastname, firstname);
	}

}
