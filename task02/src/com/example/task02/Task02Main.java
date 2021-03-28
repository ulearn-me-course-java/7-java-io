package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        changeLineBreak();
    }

    private static void changeLineBreak() throws IOException {
        int preSymbolCode = System.in.read();
        int symbolCode = System.in.read();

        while (preSymbolCode != -1) {
            if (preSymbolCode == 13 && symbolCode == 10) {
                System.out.write(symbolCode);
                preSymbolCode = System.in.read();
                symbolCode = System.in.read();
                continue;
            }

            System.out.write(preSymbolCode);
            preSymbolCode = symbolCode;
            symbolCode = System.in.read();
        }
        System.out.flush();
    }
}
