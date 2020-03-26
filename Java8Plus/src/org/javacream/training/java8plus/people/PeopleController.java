package org.javacream.training.java8plus.people;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface PeopleController {

	default Person findById(Long id) {
		return findAllAsStream().filter(p -> p.getId() == id).collect(Collectors.toList()).get(0);
	}

	Stream<Person> findAllAsStream();
	
	
	default List<Person> findByLastnameOrderedByFirstname(String lastname) {
		return findByLastname(lastname).stream().sorted( (p1, p2) -> p1.getFirstname().compareTo(p2.getFirstname())).collect(Collectors.toList());
	}
	
	default public List<Person> findByLastname(String lastname) {
		return findAllAsStream().filter(p -> p.getLastname().equals(lastname)).collect(Collectors.toList());
	}
	default public List<Person> findAll() {
		return findAllAsStream().collect(Collectors.toList());
	}

}