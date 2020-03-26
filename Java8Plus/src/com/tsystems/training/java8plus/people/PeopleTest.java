/*
 * Copyright (c) T-Systems International GmbH. All rights reserved. http://www.t-systems.com
 */
package com.tsystems.training.java8plus.people;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

  @Test public void testAddressable() {

    Person p1 = new Person("Jeff",
                           "Thomas",
                           new Address("Hechinger Str.", "Stuttgart"));

    Company c1 = new Company("T-Systems International GmbH",
                             new Address("Fasanenweg 5", "Leinfelden-Echterdingen"));

    Worker w1 = new Worker(p1, c1);

    Assert.assertEquals(p1.getAddress().getCity(), p1.getCity());
    Assert.assertEquals(p1.getAddress().getStreet(), p1.getStreet());

    Assert.assertEquals(c1.getAddress().getCity(), c1.getCity());
    Assert.assertEquals(c1.getAddress().getStreet(), c1.getStreet());

    System.out.println("p1 Normalized Address: " + p1.getNormalizedAddress());
    System.out.println("c1 Normalized Address: " + c1.getNormalizedAddress());

  }

}
