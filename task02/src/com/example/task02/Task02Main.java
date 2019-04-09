package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int firstByte = 1;
        int secondByte;

        while (firstByte != -1) {
            if (firstByte != 13) {
                firstByte = System.in.read();
            }

            if (firstByte != 13 && firstByte != -1) {
                System.out.write(firstByte);
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
