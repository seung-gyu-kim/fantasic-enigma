package org.example;

class MultiplyExpression implements Calculable {
  @Override
  public int calculate(int param) {
    return param * 5;
  }
}