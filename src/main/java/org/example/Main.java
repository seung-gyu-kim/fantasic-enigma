package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int param = sc.nextInt();

    Calculable expression = new MultiplyExpression();

    System.out.printf("my expression's result : %d \n", expression.calculate(param));
  }
}