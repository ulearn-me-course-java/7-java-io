package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.ByteArrayInputStream;

public class Task01Main {
    static void check(byte[] x, int output) throws IOException {
        try (ByteArrayInputStream in = new ByteArrayInputStream(x)) {
            checkSumOfStream(in);
        }
    }

    public static void main(String[] args) throws IOException {
        checkSumOfStream(null);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int bufferSize;
        int[] c;
        ArrayList<Integer> buffer = new ArrayList<Integer>();

        buffer.add(0);

        try {
            while (buffer.get(buffer.size() - 1) != -1) {
                buffer.add(inputStream.read());
            }
        }
        catch(NullPointerException ex) {throw new IllegalArgumentException();}

        bufferSize = buffer.size();

        if (bufferSize == 2) { return 0; }

        Integer[] b = new Integer[buffer.size() - 2];
        for (int i = 0; i < bufferSize - 2; i++) {
            b[i] = buffer.get(i + 1);
        }

        c = new int[bufferSize - 2];
        c[0] = b[0];
        for (int i = 0; i < c.length - 1; i++) {
            c[i + 1] = Integer.rotateLeft(c[i], 1) ^ b[i + 1].byteValue();
        }

        return c[c.length - 1];
    }
}
