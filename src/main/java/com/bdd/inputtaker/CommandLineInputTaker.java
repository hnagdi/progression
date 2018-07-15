
package com.bdd.inputtaker;

import com.bdd.common.ProgressionInput;
import com.bdd.common.ProgressionType;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CommandLineInputTaker implements IInputTaker {

  @Override
  public ProgressionInput takeProgressionInput() {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter an progression type (AP, GP, HP):");
      String progressionType = scanner.nextLine();
      System.out.println("Enter an starting number:");
      Integer start = scanner.nextInt();
      System.out.println("Enter progression difference (numeric):");
      Integer difference = scanner.nextInt();
      System.out.println("Enter total number of elements (numeric):");
      Integer totalElements = scanner.nextInt();
      return new ProgressionInput().setProgressionType(ProgressionType.valueOf(progressionType))
        .setStart(start)
        .setDifference(difference)
        .setTotalElements(totalElements);
    } catch (Exception ex) {
      throw new RuntimeException("Input is invalid.");
    }

  }
}
