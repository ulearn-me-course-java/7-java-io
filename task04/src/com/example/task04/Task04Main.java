package com.example.task04;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        InputStream in = System.in;
        OutputStream out = System.out;

        String input = readAsString(in);

        double sum = 0;
        String[] str = input.split("\n");
        for (int i = 0; i < str.length; i ++){

            String[] value = str[i].split(" ");
            for (int j = 0; j < value.length; j++){

                if(tryParse(value[j])){
                    sum += Double.parseDouble(value[j]);
                }
            }
        }
        System.out.println(String.format("%.6f", sum).replace(',', '.'));
    }

    public static String readAsString(InputStream inputStream) throws IOException {
        if(inputStream == null){
            throw new IllegalArgumentException();
        }

        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static boolean tryParse(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
