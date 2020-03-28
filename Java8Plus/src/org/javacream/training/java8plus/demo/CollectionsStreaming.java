package org.javacream.training.java8plus.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class CollectionsStreaming {

	@Test
	public void testCollections() {
		List<String> names = new ArrayList<>();
		names.add("Hugo");
		names.add("Emil");
		names.add("Fritz");
		names.add("Hans");
		names.add("Zvonimir");
		names.forEach(System.out::println);
		Stream<String> streamOfStrings = names.stream();
		testStreams(streamOfStrings);
	}

	private void testStreams(Stream<String> strings) {
		//Streaming: Datenverarbeitung
		Stream<String> filtered = strings.filter(s -> s.length() == 4);
		Stream<Integer> mapped = filtered.map(s -> s.length());
		List<Integer> result = mapped.collect(Collectors.toList());
		result.forEach(System.out::println);
		
		
		strings.filter(s -> s.length() == 4).map(s -> s.length()).forEach(System.out::println);
		
		
	}
}
