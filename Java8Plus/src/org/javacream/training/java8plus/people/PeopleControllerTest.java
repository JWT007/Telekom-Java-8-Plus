package org.javacream.training.java8plus.people;

import org.junit.Before;
import org.junit.Test;

public class PeopleControllerTest {

	private MapPeopleController peopleController;

	@Before public void setUp() {
		peopleController = new MapPeopleController();
	}
	
	@Test public void testFindByLastname() {
		System.out.println(peopleController.findByLastname("Sawitzki"));
	}
	@Test public void testFindByLastnameOrderedByFirstname() {
		System.out.println(peopleController.findByLastnameOrderedByFirstname("Sawitzki"));
	}
	
	
}
