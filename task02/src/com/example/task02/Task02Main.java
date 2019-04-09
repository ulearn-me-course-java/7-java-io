package com.example.task02;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int firstByte = 1;
        int secondByte;

        while (firstByte != -1) {
            if (firstByte != 13) {
                firstByte = System.in.read();
            }

            if (firstByte != 13 && firstByte != -1) {
                System.out.write(firstByte);
                firstByte = 0;
                continue;
            }

            if(firstByte == 13){
                if((secondByte = System.in.read()) == 10){
                    System.out.write(secondByte);
                    firstByte = 0;
                    continue;
                }
                if(secondByte == 13){
                    System.out.write(firstByte);
                    firstByte = secondByte;
                    secondByte = 0;
                    continue;
                }
                else if(secondByte != -1){
                    System.out.write(firstByte);
                    System.out.write(secondByte);
                    firstByte = 0;
                    continue;
                }
                else{
                    System.out.write(firstByte);
                    break;
                }
            }
        }
    }
}
