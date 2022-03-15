package com.calc;

public class ParentCalculator {
    public int AdditionOperation(int x, int y)
    {
        int z= x+y;
        return z;
    }
    public int SubtractionOperation(int x, int y)
    {
        int z= x-y;
        return z;}

    public int MultiplicationOperation(int x, int y) {
        int z = x * y;
        return z;
    }

    public int DivisionOperation(int x, int y) {
        int z = x / y;
        return z;
    }
}
