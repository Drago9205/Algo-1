package com.company;

/**
 * Created by NewUser on 15.6.2015 ã..
 */
public class SquareRootUsingBinary
{
    public double SquareRoot(int number)
    {
        int border = number;
        for (int i = 0; i <= number/2; i++)
        {
            if(i*i > number)
            {
                border = i;
                break;
            }
        }

        double upper = border;
        double low = border-1;

        return CalculateSquareRootBinary(number, low, upper);
    }

    private double CalculateSquareRootBinary(int number, double low, double up)
    {
        double mid = (low + up ) / 2;

        double num = number;
        String doubleAsString = String.format("%.5f", mid*mid);
        String numberAsString = String.format("%.5f", num);

        if(doubleAsString.equals(numberAsString))
        {
            String midAsString = String.format("%.5f", mid);
            midAsString = midAsString.replace(',', '.');
            return Double.parseDouble(midAsString);
        }

        if((mid * mid) > number)
        {
            return CalculateSquareRootBinary(number, low, mid);
        }
        if((mid * mid) < number)
        {
            return CalculateSquareRootBinary(number, mid, up);
        }

        return -1;
    }
}


// 5 200 200
