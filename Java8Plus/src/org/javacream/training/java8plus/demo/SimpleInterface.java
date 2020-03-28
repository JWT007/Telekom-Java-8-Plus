package org.javacream.training.java8plus.demo;

@FunctionalInterface
public interface SimpleInterface {
	
	void doSomething();

	default void doIt() {
		
	}
}
