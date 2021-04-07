package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException(); // Для любого пустого потока данных срабатывает exception неправильности переданного параметра;
        }

        int res = 0, val = 0;

        while ((val = inputStream.read()) > -1) { // Значение -1 является указателем на завершение вводного потока;
            res = Integer.rotateLeft(res, 1) ^ val; // Операция смещения влево на дистанцию, равную прочитанному ранее байту и использование опреации xor (^);
        }

        return res;
    }
}
