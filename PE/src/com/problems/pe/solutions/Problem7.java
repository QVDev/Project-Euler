package com.problems.pe.solutions;

public class Problem7
{
    public Problem7()
    {
        int currentCount = 0;
        int i = 1;

        while(currentCount < 10001)
        {
            if(isPrime(i))
            {
                currentCount++;
                System.out.println("Prime" + i + "Count::" + currentCount);
            }
            i++;
        }
    }


    //checks whether an int is prime or not.
    boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
