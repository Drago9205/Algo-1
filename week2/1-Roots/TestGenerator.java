package com.company;

import java.util.Random;

public class TestGenerator
{
    public static int[] GenerateArray(int size, int min, int max)
    {
        return PrivateGenerateArray(size, min, max);
        //return PrivateGenerateArray(generationSize, generationMin, generationMax);
    }

    private static int[] PrivateGenerateArray(int size, int min, int max)
    {
        Random rand = new Random();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }

        return arr;
    }
}


