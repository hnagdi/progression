
package com.bdd.common;

import java.util.Objects;

public class ProgressionInput extends CalculatorInput{

  private ProgressionType progressionType;
  private Integer start;
  private Integer difference;
  private Integer totalElements;

  public ProgressionType getProgressionType() {
    return progressionType;
  }

  public ProgressionInput setProgressionType(ProgressionType progressionType) {
    this.progressionType = progressionType;
    return this;
  }

  public Integer getStart() {
    return start;
  }

  public ProgressionInput setStart(Integer start) {
    this.start = start;
    return this;
  }

  public Integer getDifference() {
    return difference;
  }

  public ProgressionInput setDifference(Integer difference) {
    this.difference = difference;
    return this;
  }

  public Integer getTotalElements() {
    return totalElements;
  }

  public ProgressionInput setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgressionInput input = (ProgressionInput) o;
    return progressionType == input.progressionType &&
      Objects.equals(start, input.start) &&
      Objects.equals(difference, input.difference) &&
      Objects.equals(totalElements, input.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progressionType, start, difference, totalElements);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ProgressionInput{");
    sb.append("seriesType=").append(progressionType);
    sb.append(", start=").append(start);
    sb.append(", difference=").append(difference);
    sb.append(", totalElements=").append(totalElements);
    sb.append('}');
    return sb.toString();
  }
}
