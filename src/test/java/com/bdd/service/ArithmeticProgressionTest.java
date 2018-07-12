package com.bdd.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import javax.naming.OperationNotSupportedException;

public class ArithmeticProgressionTest {

  private ArithmeticProgression testObject;

  @Before
  public void setUp() {
    testObject = new ArithmeticProgression();
  }

  @Test
  public void testAP() throws OperationNotSupportedException {
    List<Integer> series = testObject.generate(2, 5, 5);
    Assert.assertEquals(5, series.size());
    Assert.assertEquals(Integer.valueOf(2), series.get(0));
    Assert.assertEquals(Integer.valueOf(7), series.get(1));
    Assert.assertEquals(Integer.valueOf(12), series.get(2));
    Assert.assertEquals(Integer.valueOf(17), series.get(3));
    Assert.assertEquals(Integer.valueOf(22), series.get(4));
  }

}
