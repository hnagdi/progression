package com.bdd.controller;

import com.bdd.inputtaker.CommandLineInputTaker;
import com.bdd.service.ProgressionFactory;
import com.bdd.validator.ProgressionInputValidator;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class ProgressionControllerTest {


  @Test
  public void testAP() {
    ProgressionController testObject = new ProgressionController(new ProgressionFactory(),
      new CommandLineInputTaker(new String[]{"AP", "2", "5", "5"}), new ProgressionInputValidator());
    List<Integer> series = testObject.execute();
    Assert.assertEquals(5, series.size());
  }

  @Test(expected = RuntimeException.class)
  public void testGP() {
    ProgressionController testObject = new ProgressionController(new ProgressionFactory(),
      new CommandLineInputTaker(new String[]{"GP", "2", "5", "5"}), new ProgressionInputValidator());
    testObject.execute();
  }

  @Test(expected = RuntimeException.class)
  public void testHP() {
    ProgressionController testObject = new ProgressionController(new ProgressionFactory(),
      new CommandLineInputTaker(new String[]{"HP", "2", "5", "5"}), new ProgressionInputValidator());
    testObject.execute();
  }

}
