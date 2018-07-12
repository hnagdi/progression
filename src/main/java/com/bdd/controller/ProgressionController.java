

package com.bdd.controller;

import com.bdd.common.ProgressionInput;
import com.bdd.inputtaker.IInputTaker;
import com.bdd.service.IProgression;
import com.bdd.service.IProgressionFactory;
import com.bdd.validator.IInputValidator;
import java.util.List;

public class ProgressionController {

  private IProgressionFactory progressionFactory;
  private IInputTaker inputTaker;
  private IInputValidator inputValidator;

  public ProgressionController(IProgressionFactory factory, IInputTaker inputTaker, IInputValidator validator) {
    this.progressionFactory = factory;
    this.inputTaker = inputTaker;
    this.inputValidator = validator;
  }

  public List<Integer> execute() {

    ProgressionInput input = inputTaker.takeProgressionInput();
    IProgression progression = this.progressionFactory.create(input.getProgressionType());

    if (inputValidator.validate(input)) {
      List<Integer> series = progression.generate(input.getStart(), input.getDifference(), input.getTotalElements());
      series.forEach(System.out::println);
      return series;
    } else {
      throw new RuntimeException("Input is invalid");
    }
  }

}
