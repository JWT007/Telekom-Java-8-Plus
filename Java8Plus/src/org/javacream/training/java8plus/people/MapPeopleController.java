package org.javacream.training.java8plus.people;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class MapPeopleController implements PeopleController {
	
	private PersonBuilder builder;
	
	
	private HashMap<Long, Person> people;
	{
		people = new HashMap<>();

		String fileName = "./people.txt";

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.map(this::assemble).forEach(p -> people.put(p.getId(), p));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		builder = new PersonBuilder();
		Set<String> personSet = Set.of();
		Set<String> workerSet = Set.of("company");
		Set<String> studentSet = Set.of("university");
		Set<String> freelancerSet = Set.of("salary");
		builder.add(personSet, PersonCreateFunctions::person);
		builder.add(workerSet, PersonCreateFunctions::worker);
		builder.add(studentSet, PersonCreateFunctions::student);
		builder.add(freelancerSet, PersonCreateFunctions::freelancer);

	}
	
	public Person assemble(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s, ",");
		Long id = Long.parseLong(tokenizer.nextToken());
		String lastname = tokenizer.nextToken();
		String firstname = tokenizer.nextToken();
		String street = tokenizer.nextToken();
		String city = tokenizer.nextToken();
		return new Person(id, lastname, firstname, new Address(city, street)); 
	}
	

	@Override
	public Stream<Person> findAllAsStream() {
		return people.values().stream();
	}


	@Override
	public Person create(String lastname, String firstname, Map<String, Object> options) {
		Person person = builder.build(lastname, firstname, options);
		Long id = person.getId();
		people.put(id, person);
		return person;
	}

}
