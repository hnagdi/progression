package com.bdd.inputtaker;

import com.bdd.common.ProgressionInput;
import com.bdd.common.ProgressionType;
import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;

public class CommandLineInputTakerTest {

  @Test
  public void testInput() {
    //Arrange
    IInputTaker testObject = new CommandLineInputTaker();
    System.setIn(new ByteArrayInputStream("AP\n2\n3\n5".getBytes()));

    //Act
    ProgressionInput actual = testObject.takeProgressionInput();

    //Assert
    ProgressionInput expected = new ProgressionInput();
    expected.setProgressionType(ProgressionType.AP)
      .setStart(2)
      .setDifference(3)
      .setTotalElements(5);
    Assert.assertEquals(expected, actual);

  }

}
