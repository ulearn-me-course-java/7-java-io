package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;

public class Task02Main
{
    public static void main(String[] args) throws IOException
    {
        int b;
        ArrayList<Integer> buffer = new ArrayList<>();
        while ((b = System.in.read()) != -1)
            buffer.add(b);
        changeToOutputBytes(buffer);
        for (int e: buffer)
            System.out.write(e);
        System.out.flush();
    }

    public static void changeToOutputBytes(ArrayList<Integer> buffer)
    {
        for(int i = 0; i < buffer.size(); i++)
            if(buffer.get(i) == 13)
                if(i + 1 < buffer.size() && buffer.get(i + 1) == 10)
                {
                    buffer.remove(i);
                    i--;
                }
    }
}
