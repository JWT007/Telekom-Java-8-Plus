/*
 * Copyright (c) T-Systems International GmbH. All rights reserved. http://www.t-systems.com
 */
package com.tsystems.training.java8plus.people;

public class Worker {

  private Person person;

  private Company company;

  public Worker(Person person, Company company) {
    this.person = person;
    this.company = company;
  }

  public Company getCompany() {
    return company;
  }

  public Person getPerson() {
    return person;
  }

}
