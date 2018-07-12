package com.bdd.service;

import com.bdd.common.ProgressionType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import javax.naming.OperationNotSupportedException;

public class ProgressionFactoryTest {

  private IProgressionFactory testObject;

  @Before
  public void setUp() {
    testObject = new ProgressionFactory();
  }

  @Test
  public void testCreateAP() throws OperationNotSupportedException {
    IProgression progression = testObject.create(ProgressionType.AP);
    Assert.assertTrue(progression instanceof ArithmeticProgression);
  }

  @Test
  public void testCreateGP() throws OperationNotSupportedException {
    IProgression progression = testObject.create(ProgressionType.GP);
    Assert.assertTrue(progression instanceof GeometricProgression);
  }

  @Test
  public void testCreateHP() throws OperationNotSupportedException {
    IProgression progression = testObject.create(ProgressionType.HP);
    Assert.assertTrue(progression instanceof HarmonicProgression);
  }

}
