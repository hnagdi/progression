package com.bdd.service;

import com.bdd.common.ProgressionType;

public class ProgressionFactory implements IProgressionFactory {

  @Override
  public IProgression create(ProgressionType progressionType) {
    IProgression progressionGenerator = null;
    switch (progressionType) {
      case AP:
        progressionGenerator = new ArithmeticProgression();
        break;
      case GP:
        progressionGenerator = new GeometricProgression();
        break;
      case HP:
        progressionGenerator = new HarmonicProgression();
        break;
    }
    return progressionGenerator;
  }
}
