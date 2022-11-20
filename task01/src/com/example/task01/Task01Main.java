package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01}))); //71
    }

    /*
    Метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.
    1. Контрольная сумма представляет собой число типа int. К.сумма пустого набора данных = 0
    2. Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле:
    C[n+1] = Integer.rotateLeft(C[n]) ^ b[n+1] , где
    C[n] — контрольная сумма первых n байт данных,
    rotateLeft — циклический сдвиг бит числа на один бит влево,
    b[n] — n-ный байт данных.
    Поскольку метод не открывал данный InputStream, то и закрывать его он не должен.
    Выброшенное из методов InputStream исключение должно выбрасываться из метода.
     */
    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        if (inputStream == null)  throw new IllegalArgumentException();

        int sum = 0, readStream;

        while ((readStream = inputStream.read()) != -1) {
            sum = Integer.rotateLeft(sum, 1) ^ readStream;
        }
        return sum;


    }
}
