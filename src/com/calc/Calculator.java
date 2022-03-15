package com.calc;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator extends ParentCalculator {

    public static void main(String[] args) {

        Calculator ob = new Calculator();
        Scanner input = new Scanner(System.in);
        int n1,n2,Total1,Total2,Total3,Total4;
        System.out.println("Enter n1");
        n1 = input.nextInt();
        System.out.println("Enter n2");
        n2 = input.nextInt();
        Total1 = ob.AdditionOperation(n1,n2);
        Total2 = ob.SubtractionOperation(n1,n2);
        System.out.println(Total1);
        System.out.println(Total2);


    }

}
