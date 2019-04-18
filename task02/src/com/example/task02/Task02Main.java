package com.example.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int symbol;
        int previousSymbol = -1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while ((symbol = reader.read()) > -1) {
        if (previousSymbol == -1) {
            previousSymbol = symbol;
            continue;
        }

        if (!(previousSymbol == 13 && symbol == 10)) {
            System.out.print((char) previousSymbol);
            System.out.flush();
        }

        previousSymbol = symbol;
    }
        if (previousSymbol != -1)System.out.print((char) previousSymbol);
    }
}
