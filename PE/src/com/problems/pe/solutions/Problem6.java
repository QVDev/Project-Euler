package com.problems.pe.solutions;

public class Problem6
{
    public Problem6()
    {

        int sumSquares = 0;
        int squareSum = 0;

        for(int i = 0 ; i <= 100; i++)
        {
            sumSquares+= Math.pow(i,2);
            squareSum += i;
        }

        squareSum = (int) Math.pow(squareSum, 2);

        System.out.println("Sum Square::" + sumSquares);
        System.out.println("Square Sum::" + squareSum);

        System.out.println("Difference::" + (squareSum - sumSquares));
    }
}
