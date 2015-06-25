package com.company;

/**
 * Created by NewUser on 15.6.2015 ã..
 */
public class Search
{
    public int FindItemLinear(int[] sequence, int value)
    {
        for(int i = 0; i < sequence.length; i++)
        {
            if(sequence[i] == value)
                return i;
        }

        return -1;
    }

    public int FindItemBinary(int[] sequence, int value, int min, int max)
    {
        if(min == max)
            if(value == sequence[min])
                return min;
            else
                return -1;

        if(max < min)
            return -1;
        else
        {
            int pivot = (max + min) / 2;

            if (value <= sequence[pivot])
            {
                return FindItemBinary(sequence, value, min, pivot);
            } else if (value > sequence[pivot])
            {
                return FindItemBinary(sequence, value, pivot + 1, max);
            }
        }

        return -1;
    }
}
