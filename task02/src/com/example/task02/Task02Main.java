package com.example.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task02Main {
    public static void main(String[] args) throws IOException
    {

        int previous = System.in.read();
        while (previous != -1) {
            int current = System.in.read();
            if (previous != '\r' || current != '\n')
                System.out.write(previous);
            previous = current;
        }

        System.out.flush();
    }
}
