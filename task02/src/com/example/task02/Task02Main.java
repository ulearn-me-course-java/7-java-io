package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        changeNewLineCharFromWindowsToUnix();
    }

    private static void changeNewLineCharFromWindowsToUnix() throws IOException {
        List<Byte> inputBytes = new ArrayList<>();
        do {
            inputBytes.add((byte) System.in.read());
        } while (inputBytes.get(inputBytes.size() - 1) >= 0);
        inputBytes.remove(inputBytes.size() - 1);
        Byte[] input = inputBytes.toArray(new Byte[0]);
        for (int i = 0; i < input.length; i++) {
            if (!(i == input.length - 1) && input[i] == 13 && input[i + 1] == 10) {
                System.out.write(10);
                i++;
                continue;
            }
            System.out.write(inputBytes.get(i));
        }
    }
}
