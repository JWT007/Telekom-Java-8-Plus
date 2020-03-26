package org.javacream.training.java8plus.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class MethodReferences {
	
	@Test public void testCollections() {
		List<String> names = new ArrayList<>();
		names.add("Hugo");
		names.add("Emil");
		names.add("Fritz");
		names.add("Hans");
		names.add("Zvonimir");
		Consumer<String> printer = (s) -> System.out.println(s);
		//Consumer<String> = Eine Funktionssignatur (String) -> void
		Consumer<String> printer2 = System.out::println;
		Demo demo = System.out::println;

		DemoClass demoClass = new DemoClass();
		
		Consumer<String> printer3 = demoClass::doDemoInClass;
		Function<Integer, Boolean> printer4 = demoClass::doDemoInClass2;
		Predicate<Integer> printer5 = demoClass::doDemoInClass2;
		
		names.forEach(System.out::println);


		
	}
	
	class DemoClass{
		public void doDemoInClass(String s) {
			
		}
		public boolean doDemoInClass2(Integer i) {
			return false;
		}
	}
	interface Demo{
		void doDemo(String s);
	}

}
