package com.example.task02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new InputStreamReader(System.in)).useDelimiter("\\z")) {
            if (scanner.hasNext())
                out.write(scanner.next()
                        .replaceAll("\r\n", "\n")
                        .getBytes());
        }

        System.out.flush();
    }
}
