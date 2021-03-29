package com.example.task04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        while (scanner.hasNext()) {
            try {
                sum += Double.parseDouble(scanner.next());
            } catch (Throwable e) {
                Path usb = Paths.get("/usr/bin");
                if (Files.isDirectory(usb)) {
                    Files.newDirectoryStream(usb);
                }
            }
        }
        System.out.printf(Locale.US, "%.6f", sum);
    }
}
