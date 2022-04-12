package com.example.task04;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main
{
    public static void main(String[] args) throws IOException
    {
        double result = 0;
        double currentNum = GetDigit(System.in);
        while (currentNum != Double.NEGATIVE_INFINITY)
        {
            if (!Double.isNaN(currentNum)) result += currentNum;
            currentNum = GetDigit(System.in);
        }
        StringBuilder resultStr = new StringBuilder(Double.toString(result));
        while (resultStr.toString().split("\\.")[1].length() < 6)
        {
            resultStr.append("0");
        }
        System.out.print(resultStr);
    }

    private static double GetDigit(InputStream inputStream) throws IOException
    {
        int num;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        boolean isFinish = false;
        while (true)
        {
            num = inputStream.read();
            if (num == -1)
            {
                isFinish = true;
                break;
            }
            if (num == ' ' || num == '\n') break;
            outputStream.write(num);
        }
        outputStream.flush();
        String resultString = outputStream.toString();
        try
        {
            return Double.parseDouble(resultString);
        }
        catch (NumberFormatException ex)
        {
            return isFinish ? Double.NEGATIVE_INFINITY : Double.NaN;
        }
    }
}
