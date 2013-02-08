package com.problems.pe.solutions;

public class Problem10
{
    public Problem10(long number)
    {
        int sum = 0;

        for(int i = 0; i <= number ; i++)
        {
            if(isPrime(i))
            {
                System.out.print("prime:" + i);
                sum += i;
            }
        }

        System.out.println("==Sum of Primes::" + sum + " below::" + number);
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
