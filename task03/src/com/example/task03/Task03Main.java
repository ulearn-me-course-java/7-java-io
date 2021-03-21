package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Task03Main {

    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream==null) throw new IllegalArgumentException();
        int value;
        ArrayList<Byte> bytes = new ArrayList<>();
        while ((value=inputStream.read())!=-1){
            bytes.add((byte)value);
        }
        if(bytes.size()==0) return null;
        byte[] arr = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
            arr[i]=bytes.get(i);
        }
        return new String(arr,charset);
    }

}
