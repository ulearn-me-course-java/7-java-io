package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previousSymbol;
        int currentSymbol = System.in.read();

        while (currentSymbol > -1) {
            previousSymbol = currentSymbol;
            currentSymbol = System.in.read();

            if (!((previousSymbol == 13) && (currentSymbol == 10)))
                System.out.write(previousSymbol);
        }

        System.out.flush();
    }
}