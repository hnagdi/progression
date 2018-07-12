
package com.bdd.service;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticProgression implements IProgression {

  @Override
  public List<Integer> generate(Integer start, Integer difference, Integer totalElements) {
    List<Integer> series = new ArrayList<>();
    Integer currentValue = start;
    for(Integer i=0; i<totalElements; i++) {
      series.add(currentValue);
      currentValue = currentValue + difference;
    }
    return series;
  }

}
