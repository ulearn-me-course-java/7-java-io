package com.example.task04;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double sum = 0.;
        while (scanner.hasNextDouble()){
            sum += scanner.nextDouble();
        }
        System.out.printf(Locale.US,"%.6f%n", sum);

//        String[] temp = readAsString(System.in ,Charset.defaultCharset()).split(" ");
//        BigDecimal sum = new BigDecimal(0);
//        for (int i = 0; i < temp.length; i++) {
//            sum = sum.add(BigDecimal.valueOf(Double.parseDouble(temp[i])));
//        }
//        System.out.printf("%.6f%n", sum);
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null){
            throw new IllegalArgumentException();
        }

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result.toString(charset.toString());

        //return new BufferedReader(new InputStreamReader(inputStream, charset)).readLine();
    }
}
