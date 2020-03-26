/*
 * Copyright (c) T-Systems International GmbH. All rights reserved. http://www.t-systems.com
 */
package com.tsystems.training.java8plus.people;

public class Address {

  private final String city;

  private final String street;

  public Address(String street, String city) {
    this.city = city;
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  @Override
  public String toString() {
    return "Address{" +
           "city='" + city + '\'' +
           ", street='" + street + '\'' +
           '}';
  }
}
