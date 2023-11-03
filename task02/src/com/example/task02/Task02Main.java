package com.example.task02;

import java.io.IOException;

public class Task02Main
{
    public static void main(String[] args) throws IOException
    {
        int elem = System.in.read();

        while (true)
        {
            if (elem == -1) break;

            int next = System.in.read();
            if (elem != '\r' || next != '\n')
            {
                System.out.write(elem);
            }
            elem = next;

        }
        System.out.flush();
    }

}
