package com.example.task04;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        double sum = 0d;
        //Scanner scanner = new Scanner(new File("C:\\Users\\79028\\IdeaProjects\\7-java-io\\task04\\src\\com\\example\\task04\\input.test")).useLocale(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        while (scanner.hasNextLine()) {
            try {
                sum += Double.parseDouble(scanner.next());
            }
            catch (Exception e) {
            }
        }
        System.out.println(String.format(Locale.ENGLISH,"%.6f", sum));
    }
}
