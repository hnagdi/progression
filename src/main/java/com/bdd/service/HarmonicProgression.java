
package com.bdd.service;

import java.util.List;

public class HarmonicProgression implements IProgression {

  @Override
  public List<Integer> generate(Integer start, Integer difference, Integer totalElements) {
    throw new RuntimeException("HP is not supported");
  }

}
