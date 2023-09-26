package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        windowsEndLineToUnixEndLine(inputStream,outputStream);
    }
    public static void windowsEndLineToUnixEndLine(InputStream inputStream,OutputStream outputStream) throws IOException {
        int readLength = 0;
        byte[] read = new byte[1024];
        while ((readLength = inputStream.read(read))>0){
            for (int i=0; i<readLength-1;i++){
                if (!(read[i] == 13 && read[i+1] == 10)){
                    outputStream.write(read[i]);
                }
            }
            outputStream.write(read[readLength-1]);
        }
        System.out.flush();
    }
}
