package com.bdd.service;

import java.util.List;

public interface IProgression {

  List<Integer> generate(Integer start, Integer difference, Integer totalElements);

}
