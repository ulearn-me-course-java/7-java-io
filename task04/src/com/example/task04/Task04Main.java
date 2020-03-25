package com.example.task04;

import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        Sum();
    }

    public static void Sum(){
        Scanner scanner=new Scanner(System.in);
        double sum=0.0;
        while (scanner.hasNext()){
            String str=scanner.next();
            if(isNumber(str)){
                sum+=Double.parseDouble(str);
            }
        }
        System.out.printf(Locale.US,"%.6f",sum);
        scanner.close();
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
