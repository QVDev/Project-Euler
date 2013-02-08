package com.problems.pe.solutions;

public class Problem3
{
    public Problem3(long number)
    {
        for(int i = 1; i < number ; i++)
        {
            if(isPrime(i))
            {
                if(number % i == 0)
                {
                    System.out.println("Prime::" + i);
                }
            }
        }
    }

    private boolean isPrime(int n)
    {
        for(int i=2;2*i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

}
