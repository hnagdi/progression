package com.bdd.controller;

import com.bdd.common.ProgressionInput;
import com.bdd.common.ProgressionType;
import com.bdd.inputtaker.IInputTaker;
import com.bdd.service.IProgression;
import com.bdd.service.IProgressionFactory;
import com.bdd.validator.IInputValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProgressionControllerTest {

  @Mock
  private IInputTaker mockInputTaker;

  @Mock
  private IInputValidator mockInputValidator;

  @Mock
  private IProgressionFactory mockProgressionFactory;

  @Mock
  private IProgression mockProgression;

  private ProgressionController testObject;


  @Before
  public void setUp() {
    testObject = new ProgressionController(mockProgressionFactory, mockInputTaker, mockInputValidator);
  }

  @Test
  public void testAP() {
    List<Integer> expected = Arrays.asList(5, 7, 9);
    ProgressionInput input = new ProgressionInput().setProgressionType(ProgressionType.AP).setDifference(2).setStart(5).setTotalElements(3);
    when(mockInputTaker.takeProgressionInput()).thenReturn(input);
    when(mockInputValidator.validate(input)).thenReturn(true);
    when(mockProgressionFactory.create(ProgressionType.AP)).thenReturn(mockProgression);
    when(mockProgression.generate(5, 2, 3)).thenReturn(expected);

    List<Integer> series = testObject.execute();
    Assert.assertEquals(expected, series);

    verify(mockInputTaker).takeProgressionInput();
    verify(mockProgressionFactory).create(ProgressionType.AP);
    verify(mockProgression).generate(5, 2, 3);
    verify(mockInputValidator).validate(input);

    verifyNoMoreInteractions(mockInputTaker);
    verifyNoMoreInteractions(mockProgressionFactory);
    verifyNoMoreInteractions(mockProgression);
    verifyNoMoreInteractions(mockInputValidator);
  }
}
