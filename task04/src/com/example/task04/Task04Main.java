package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {


            Scanner scanner = new Scanner(System.in);//skaner-обертка с ин поток входа класс который помогает рабоать с этим потокм
        //может работать с числами

            double sum = 0;

        scanner.useLocale(Locale.UK);//локализация с
            while (scanner.hasNext()) {//hasnext если есть след число
                if (scanner.hasNextDouble())
                    sum += scanner.nextDouble();
                else
                    scanner.next();
            }

            System.out.format(Locale.UK, "%.6f", sum);

        }

    }

