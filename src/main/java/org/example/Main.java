package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int param = sc.nextInt();

<<<<<<< HEAD
        Calculable expression = new AddExpression();
=======
        Calculable expression = new MultiplyExpression();
>>>>>>> feature/multiplication-operation

        System.out.printf("my expression's result : %d \n", expression.calculate(param));
    }
}

interface Calculable {
    int calculate(int param);
}

<<<<<<< HEAD
//본인이 작성한 코드를 붙여넣어주세요!
class AddExpression implements Calculable {
    @Override
    public int calculate(int param) {
        return param + 10;
=======
class MultiplyExpression implements Calculable{
    @Override
    public int calculate(int param) {
        return param * 5;
>>>>>>> feature/multiplication-operation
    }
}