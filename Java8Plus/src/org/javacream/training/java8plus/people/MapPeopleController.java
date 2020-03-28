package org.javacream.training.java8plus.people;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class MapPeopleController implements PeopleController {
	private HashMap<Long, Person> people;
	{
		people = new HashMap<>();

		String fileName = "./people.txt";

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.map(this::assemble).forEach(p -> people.put(p.getId(), p));

		} catch (IOException e) {
			e.printStackTrace();
		}
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

}
