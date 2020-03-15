package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[System.in.available()];
        System.in.read(bytes);
        System.out.append(new String(bytes).replaceAll("\r\n","\n"));
    }
}
