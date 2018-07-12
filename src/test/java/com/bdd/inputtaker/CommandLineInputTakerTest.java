package com.bdd.inputtaker;

import com.bdd.common.ProgressionInput;
import com.bdd.common.ProgressionType;
import org.junit.Assert;
import org.junit.Test;

public class CommandLineInputTakerTest {

  @Test
  public void testInput() {
    String[] args = new String[] {"AP", "2", "3", "5"};
    IInputTaker testObject = new CommandLineInputTaker(args);
    ProgressionInput actual = testObject.takeProgressionInput();

    ProgressionInput expected = new ProgressionInput();
    expected.setProgressionType(ProgressionType.AP)
      .setStart(2)
      .setDifference(3)
      .setTotalElements(5);

    Assert.assertEquals(expected, actual);
  }

}
