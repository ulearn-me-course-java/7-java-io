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

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }

        int symbol;
        int sum = 0;
        while ((symbol = inputStream.read()) != -1) {
            sum = Integer.rotateLeft(sum, 1) ^ symbol;
        }
        return sum;
    }
}
//Контрольная сумма пустого набора данных равна нулю.
//Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле:
//C\[n+1\]=rotateLeft(C\[n\]) xor b\[n+1\]
// C\[n\] — контрольная сумма первых n байт данных
// rotateLeft — циклический сдвиг бит числа на один бит влево
// (чтобы не изобретать велосипед, используйте Integer.rotateLeft)
// b\[n\] — n-ный байт данных.
