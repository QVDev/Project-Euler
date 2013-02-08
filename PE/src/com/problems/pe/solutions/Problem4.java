package com.problems.pe.solutions;

public class Problem4
{
    public Problem4()
    {
        String numberToCheck = "";
        String originalNumber = "";

        int highest = 0;

        for(int i = 0 ; i <= 999 ; i++)
        {

            for(int ii = 0; ii <= 999 ; ii++)
            {
                int pali = i * ii;

                originalNumber = "" + pali;

                for(int charPos = originalNumber.length() -1 ; charPos >= 0 ; charPos--)
                    numberToCheck += originalNumber.charAt(charPos);

                if(numberToCheck.contentEquals(originalNumber))
                    if(pali > highest)
                        highest = pali;

                numberToCheck = "";

            }
        }

        System.out.println("Highest::" + highest);
    }


}
