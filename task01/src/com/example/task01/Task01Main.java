package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));


    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null){
            throw new IllegalArgumentException("array doesnt exist"); //избежать передачи некорректных значений аргументов
        }

        int sum = 0;
        int num = inputStream.read();

        while(num != -1){ //Метод java.io.InputStream.read() считывает следующий байт данных из входного потока и
            // возвращает значение int в диапазоне от 0 до 255.
            // Если байт недоступен, т.к. достигнут конец, то вызвращается -1
            sum = Integer.rotateLeft(sum, 1) ^ num; //здесь не понял почему так и зачем здесь rotateLeft
            num = inputStream.read();
        }
        return sum;

    }
}
