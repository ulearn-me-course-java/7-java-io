package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Task01Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException
    {
        ArrayList<Integer> list = GetArray(inputStream);
        if (list.size() == 0)
            return 0;
        return GetCheckSum(list, 0, 0);
    }

    public static ArrayList<Integer> GetArray(InputStream inputStream) throws IOException
    {
        if (inputStream == null)
            throw new IllegalArgumentException();
        int v;
        ArrayList<Integer> list = new ArrayList();
        while ((v = inputStream.read()) >= 0)
        {
            list.add(v);
        }
        return list;
    }

    public static int GetCheckSum(ArrayList<Integer> list, int i, int sum)
    {
        if (list.size() == i)
            return sum;
        int b = list.get(i);
        sum = Integer.rotateLeft(sum, 1) ^ b;
        return GetCheckSum(list, i + 1, sum);
    }
}