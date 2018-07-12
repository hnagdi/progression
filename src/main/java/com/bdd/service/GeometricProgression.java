
package com.bdd.service;

import java.util.List;

public class GeometricProgression implements IProgression {

  @Override
  public List<Integer> generate(Integer start, Integer difference, Integer totalElements) {
    throw new RuntimeException("GP is not supported");
  }

}
