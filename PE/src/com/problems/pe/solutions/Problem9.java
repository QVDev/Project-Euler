package com.problems.pe.solutions;

public class Problem9
{
    public Problem9()
    {
        int product = 0;
        int goal = 1000;

        while(product <= goal)
        {
            for(int a = 1 ; a < goal ; a++)
            {
                for(int b = a+1 ; b < goal ; b++)
                {
                    for(int c = b+1 ; c < goal ; c++)
                    {
                        if(((a*a) + (b*b)) == (c*c))
                        {
                            if((a)+(b)+(c) == goal)
                            {
                                product = (a)*(b)*(c);
                                System.out.println("a:" + (a) + " b:" + (b) + " c:" + (c) + " product:" + product);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
