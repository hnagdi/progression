package com.bdd.service;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class HarmonicProgressionTest {

  private HarmonicProgression testObject;

  @Before
  public void setUp() {
    testObject = new HarmonicProgression();
  }

  @Test(expected = RuntimeException.class)
  public void testAP() {
    List<Integer> series = testObject.generate(2, 5, 5);
  }

}
