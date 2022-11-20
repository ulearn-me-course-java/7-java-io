package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main
{
    public static void main(String[] args) throws IOException
    {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException
    {
        int controlSum = 0;
        int elem;

        if (inputStream == null) throw new IllegalArgumentException();
        while (true)
        {
            elem = inputStream.read();
            if(elem == -1) break;
            controlSum = Integer.rotateLeft(controlSum, 1) ^ elem;
        }
        return controlSum;
    }
}
