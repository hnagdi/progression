
package com.bdd.inputtaker;

import com.bdd.common.ProgressionInput;
import com.bdd.common.ProgressionType;
import java.util.Properties;

public class PropertiesInputTaker implements IInputTaker {

  private String fileName;

  PropertiesInputTaker(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public ProgressionInput takeProgressionInput()  {

    ProgressionInput input = new ProgressionInput();
    Properties prop = new Properties();

    try {
      prop.load(this.getClass().getClassLoader().getResourceAsStream(fileName));

      return input.setProgressionType(ProgressionType.valueOf(prop.getProperty("seriesType")))
        .setDifference(Integer.valueOf(prop.getProperty("difference")))
        .setStart(Integer.valueOf(prop.getProperty("start")))
        .setTotalElements(Integer.valueOf(prop.getProperty("totalElements")));
    } catch (Exception e) {
      throw new RuntimeException("Input is invalid. Should enter seriesType (AP, GP, HP), "
        + "start, difference and totalElements in sequence");
    }
  }
}
