package org.javacream.training.java8plus.people;

public class Student extends Person {

	private University university;

	public Student(Long id, String lastname, String firstname, University university) {
		super(id, lastname, firstname);
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [university=" + university + ", toString()=" + super.toString() + "]";
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
}
