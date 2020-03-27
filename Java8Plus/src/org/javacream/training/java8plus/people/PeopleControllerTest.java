package org.javacream.training.java8plus.people;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
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
	
	@Test
	public void testPersonBuilder() {
		Person p = peopleController.create("Sawitzki", "Rainer", new HashMap<String, Object>());
		Assert.assertTrue(p instanceof Person);

		Map<String, Object> workerMap = Map.of("company", new Company("Integrata"));
		Person worker = peopleController.create("Schufter", "Hans", workerMap);
		Assert.assertTrue(worker.getClass().equals(Worker.class));

	
		Map<String, Object> freelancerMap = Map.of("salary", 9.99);
		Person freelancer = peopleController.create("Eg", "Al", freelancerMap);
		Assert.assertTrue(freelancer.getClass().equals(Freelancer.class));

	}	

	@Test(expected = NullPointerException.class) public void testUnknownOptions() {
		Map<String, Object> unknownOptions = Map.of("unknwon", 9.99);
		peopleController.create("Eg", "Al", unknownOptions);
		
	}
}
