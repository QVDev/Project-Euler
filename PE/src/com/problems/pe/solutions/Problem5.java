package com.problems.pe.solutions;

public class Problem5
{
    public Problem5()
    {

        boolean isAllDivided = false;

        int startNumber = 1;
        int endNumber = 20;
        int trueCount = 0;

        while (!isAllDivided)
        {
            for (int i = 1; i <= endNumber; i++)
            {
                if (startNumber % i == 0)
                {
                    trueCount++;
                }

                if (trueCount == endNumber)
                {
                    isAllDivided = true;
                    System.out.println("SUCCESS::" + startNumber);
                }
            }

            trueCount = 0;
            startNumber++;
        }

    }


}
