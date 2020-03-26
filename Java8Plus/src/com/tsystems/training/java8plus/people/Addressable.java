/*
 * Copyright (c) T-Systems International GmbH. All rights reserved. http://www.t-systems.com
 */
package com.tsystems.training.java8plus.people;

public interface Addressable {

  Address getAddress();

  default String getStreet() {
    return getAddress().getStreet();
  }

  default String getCity() {
    return getAddress().getCity();
  }

  default String getNormalizedCity() {
    return getCity().toUpperCase();
  }

  default String getNormalizedStreet() {
    return getStreet().toUpperCase();
  }

  default Address getNormalizedAddress() {
    return new Address(getNormalizedStreet(), getNormalizedCity());
  }

}
