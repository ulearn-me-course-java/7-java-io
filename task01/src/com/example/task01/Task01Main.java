package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }
        List<Byte> bytes = new ArrayList<>();
        do {
            bytes.add((byte) inputStream.read());
        } while (bytes.get(bytes.size() - 1) >= 0);
        bytes.remove(bytes.size() - 1);
        return getSumOfStream(bytes.toArray(new Byte[0]), bytes.size() - 1);
    }

    private static int getSumOfStream(Byte[] bytes, int index) {
        if (bytes.length == 0) {
            return 0;
        }
        if (index == 0) {
            return bytes[0];
        }
        return Integer.rotateLeft(getSumOfStream(bytes, index - 1), 1) ^ bytes[index];
    }
}
