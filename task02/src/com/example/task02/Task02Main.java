package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task02Main {
    public static void main(String[] args) throws IOException {

            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;

//        try (InputStream inputStream = new FileInputStream("task02/src/com/example/task02/input.test");
//             OutputStream outputStream = new FileOutputStream("task02/src/com/example/task02/output.test")) {

            int prev = inputStream.read();

            while (prev != -1) {
                int current = inputStream.read();
                if (prev != '\r' || current != '\n') outputStream.write(prev);

                prev = current;
            }
            outputStream.flush();
//        }

//        BufferedReader reader = Files.newBufferedReader(Paths.get("task02/src/com/example/task02/output.test"));
//        int x;
//        while ((x = reader.read()) != -1) {
//            System.out.print(x + " ");
//        }
    }
}
