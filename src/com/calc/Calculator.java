package com.calc;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Addition adCalc = new Addition();
        Subtraction subCalc = new Subtraction();
        Multiplication multiCalc = new Multiplication();
        Scanner input = new Scanner(System.in);
        int n1,n2,Total1,Total2,Total3;
        System.out.println("Enter n1");
        n1 = input.nextInt();
        System.out.println("Enter n2");
        n2 = input.nextInt();
        Total1 = adCalc.AdditionOperation(n1,n2);
        System.out.println(Total1);
        Total2 = subCalc.SubtractionOperation(n1,n2);
        System.out.println(Total2);
        Total3 = multiCalc.MultiplicationOperation(n1,n2);
        System.out.println(Total3);

    }
}
