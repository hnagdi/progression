package com.bdd.service;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class GeometricProgressionTest {

  private GeometricProgression testObject;

  @Before
  public void setUp() {
    testObject = new GeometricProgression();
  }

  @Test(expected = RuntimeException.class)
  public void testAP() {
    List<Integer> series = testObject.generate(2, 5, 5);
  }

}
