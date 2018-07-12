package com.bdd.inputtaker;

import com.bdd.common.ProgressionInput;
import com.bdd.common.ProgressionType;
import org.junit.Assert;
import org.junit.Test;

public class PropertiesInputTakerTest {

  @Test
  public void testInput() {
    IInputTaker testObject = new PropertiesInputTaker("test-input.properties");
    ProgressionInput actual = testObject.takeProgressionInput();

    ProgressionInput expected = new ProgressionInput();
    expected.setProgressionType(ProgressionType.AP)
      .setStart(2)
      .setDifference(2)
      .setTotalElements(10);

    Assert.assertEquals(expected, actual);
  }

}
