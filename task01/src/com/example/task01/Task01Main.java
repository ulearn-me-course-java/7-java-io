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

    public static int checkSumOfStream(InputStream inputStream) throws IOException , IllegalArgumentException{
        // your implementation here
        int b;
        int crc = 0;
       if(inputStream != null)
       {
           try {
               while (((b = inputStream.read()) != -1)) {
                   crc = Integer.rotateLeft(crc, 1) ^ b;
               }
           } catch (IOException e) {
               throw new IOException();
           }
       } else{
           throw  new IllegalArgumentException();
       }

        return crc;
    }
}
