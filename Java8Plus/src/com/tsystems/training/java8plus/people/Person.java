/*
 * Copyright (c) T-Systems International GmbH. All rights reserved. http://www.t-systems.com
 */
package com.tsystems.training.java8plus.people;

public class Person implements Addressable {

  private final String firstName;

  private final String lastName;

  private final Address address;

  public Person(String firstName, String lastName, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Address getAddress() {
    return address;
  }

}
