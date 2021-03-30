package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException, IllegalArgumentException {
        if (inputStream == null)
            throw new IllegalArgumentException();
        int[] array = new int[inputStream.available()];
        for(int current, i = 0; (current = inputStream.read()) != -1; i++)
            array[i] = current;
        return checkSum(array.length, array);
    }

    private static int checkSum(int n, int[] array) {
        if (n <= 0)
            return 0;
        return (checkSum(n - 1, array) << 1) ^ array[n - 1];
    }
}
