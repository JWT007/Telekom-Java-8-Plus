package org.javacream.training.java8plus.demo;

import java.util.function.Function;

import org.junit.Test;

public class FunctionalInterfacesDemo {
	
	@Test public void testFunctionalInterfaces() {
		//Standard-Funktion: Nimm Parameter und erzeuge einen Rückgabewert
		Function<String, Integer> f1 = (String s) -> {
			return s.length();
		};
		
		int result = f1.apply("Hugo");
		
		//"Syntactic Sugar", Type Inference
		Function<String, Integer> f1_short = s -> s.length();
		
	}

}
