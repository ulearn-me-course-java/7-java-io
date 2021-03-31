package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        getSequenceSum();
    }

    public static void getSequenceSum() {
        Scanner scan = new Scanner(System.in);
        String current;
        double sum = 0;
        while(scan.hasNext()){
            if(isNumeric(current = scan.next())) {
                double d = Double.parseDouble(current);
                sum += d;
            }
        }
        System.out.print(BigDecimal.valueOf(sum).setScale(6, BigDecimal.ROUND_HALF_UP));
    }

    public static boolean isNumeric(String str)
    {
        try {
            Double.parseDouble(str);
        }
        catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
