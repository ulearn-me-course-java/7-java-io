package com.example.task04;

import java.io.IOException;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException
    {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        //System.setIn(new StringBufferInputStream("a1 b2 c3"));
        SumFloat(System.in);
    }

    private static void SumFloat(InputStream stream)
    {
        double sum = 0.0;
        DecimalFormat df = new DecimalFormat("0.000000");

        try(Scanner scanner = new Scanner(stream))
        {
            while(scanner.hasNextDouble())
            {
                sum += scanner.nextDouble();
            }
        }

        System.out.print(df.format(sum));
    }
}
