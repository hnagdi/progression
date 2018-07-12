
package com.bdd.inputtaker;

import com.bdd.common.ProgressionInput;
import com.bdd.common.ProgressionType;

public class CommandLineInputTaker implements IInputTaker {

  private String[] arguments;

  public CommandLineInputTaker(String[] arguments) {
    this.arguments = arguments;
  }

  @Override
  public ProgressionInput takeProgressionInput()  {
    ProgressionInput input = new ProgressionInput();
    try {
      return input.setProgressionType(ProgressionType.valueOf(arguments[0]))
        .setStart(Integer.valueOf(arguments[1]))
        .setDifference(Integer.valueOf(arguments[2]))
        .setTotalElements(Integer.valueOf(arguments[3]));
    } catch (Exception ex) {
      throw new RuntimeException("Input is invalid. Should enter seriesType (AP, GP, HP), "
        + "start, difference and totalElements in sequence");
    }

  }
}
