package com.example.task04;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double result = 0;
        while(sc.hasNext()) {
            if(sc.hasNextDouble()){
                result += Double.parseDouble(sc.next());
            }
            else{
                sc.next();
            }
        }
        System.out.println(String.format(Locale.US, "%,6f", result));
    }
}
