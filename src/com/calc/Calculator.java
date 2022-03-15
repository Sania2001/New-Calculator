package com.calc;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {

    public int AdditionOperation(int x, int y)
    {
        int z= x+y;
        return z;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator(); //Object creation

        Scanner input = new Scanner(System.in);
        int n1,n2,Total;
        System.out.println("Enter n1");
        n1 = input.nextInt();
        System.out.println("Enter n2");
        n2 = input.nextInt();
        Total = calc.AdditionOperation(n1,n2);
        System.out.println(Total);

    }
}
