package com.example.task02;

import java.io.IOException;

public class Task02Main
{
    public static void main(String[] args) throws IOException
    {
        int prevNum = System.in.read();

        while (prevNum != -1)
        {
            int currentNum = System.in.read();
            if (prevNum != '\r' || currentNum != '\n')
            {
                System.out.write(prevNum);
            }
            prevNum = currentNum;
        }
        System.out.flush();
    }
}
