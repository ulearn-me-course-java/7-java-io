package com.example.task04;

import java.io.IOException;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        Scanner scan = new Scanner(System.in);
        double sum = 0;

        while (scan.hasNext()){
            String s = scan.next();
            if(isDouble(s))
                sum += Double.parseDouble(s);
        }
        String str = String.format("%.6f", sum).replace(',', '.');
        System.out.print(str);
    }

    public static boolean isDouble(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
