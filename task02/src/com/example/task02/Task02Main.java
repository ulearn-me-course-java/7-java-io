package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        Convert(System.in, System.out);
    }

    public static OutputStream Convert(InputStream inputStream, OutputStream outputStream) throws IOException {
        int bufCur = inputStream.read();
        int bufNext;
        while (bufCur > -1){
            bufNext = inputStream.read();
            if (!(bufCur == 13 && bufNext == 10)){
                outputStream.write(bufCur);
            }
            bufCur = bufNext;
        }
        outputStream.flush();
        return outputStream;
    }
}
