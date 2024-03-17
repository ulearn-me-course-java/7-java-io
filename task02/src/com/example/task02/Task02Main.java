package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        InputStream inputStream = new FileInputStream("task02/src/com/example/task02/input.test");
        //System.setIn(inputStream);
        //OutputStream outputStream = new FileOutputStream("output.test");

        //InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        windowsEndLineToUnixEndLine(inputStream,outputStream);
    }
    public static void windowsEndLineToUnixEndLine(InputStream inputStream,OutputStream outputStream) throws IOException {
        int readArrayLength = 0;
        byte[] readArray = new byte[1024];
        while ((readArrayLength = inputStream.read(readArray))>0){
            for (int i=0; i<readArrayLength-1;i++){
                if (!(readArray[i] == 13 && readArray[i+1] == 10)){
                    outputStream.write(readArray[i]);
                }
            }
            outputStream.write(readArray[readArrayLength-1]);
        }
        outputStream.flush();
    }
}
