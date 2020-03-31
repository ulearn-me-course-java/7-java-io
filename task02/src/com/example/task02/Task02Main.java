package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        fromWindowsToUnix();
    }

    public static void fromWindowsToUnix() throws IOException {
       byte[] input=new byte[System.in.available()];
       System.in.read(input);
       System.out.print(new String(input).replace("\r\n","\n"));
    }
}
