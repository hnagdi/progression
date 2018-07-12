package com.bdd.service;

import com.bdd.common.ProgressionType;

public interface IProgressionFactory {

  IProgression create(ProgressionType progressionType);

}
