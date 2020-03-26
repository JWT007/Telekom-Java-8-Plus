package org.javacream.training.java8plus.demo;

public class TopLevel implements SimpleInterface {

	private int counter = 0;
	@Override
	public void doSomething() {
		String name = "Hugo";
		class InnerMethodClass implements SimpleInterface{

			@Override
			public void doSomething() {
				System.out.println(name);
				//name = "Emil";
			}
			
		}
		SimpleInterface si = new InnerMethodClass();
		
		SimpleInterface anonimous = new SimpleInterface() {
			
			@Override
			public void doSomething() {
				System.out.println(name);
			}

		};
		// TODO Auto-generated method stub
		//Lambda-Ausdruck
		
		//myName= Referenz , "..." String-Literal	
		String myName = "Sawitzki";	
		//Integer-Literal
		Integer number = 42;
		//verySimple eine Referenz, () -> {} Funktions-Literal
		SimpleInterface verySimple = () -> {
			System.out.println(name);
		};
		
	}

	class Inner implements SimpleInterface{

		@Override
		public void doSomething() {
			System.out.println(counter);
			// TODO Auto-generated method stub
			
		}
		
	}
	static class StaticInner implements SimpleInterface{

		@Override
		public void doSomething() {
			//System.out.println(counter);
			// TODO Auto-generated method stub
			
		}
		
	}

}

class Another implements SimpleInterface{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}
	
}
