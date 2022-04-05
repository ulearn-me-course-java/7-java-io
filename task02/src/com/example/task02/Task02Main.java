package com.example.task02;

import java.io.*;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException {

        System.setOut(new PrintStream(new FileOutputStream("task02\\src\\com\\example\\task02\\expected.test")));

        try{
            FileInputStream fis = new FileInputStream("task02\\src\\com\\example\\task02\\input.test");
            System.setIn(fis);
        } catch (IOException ignored) {
        }

        int previousByte = System.in.read();
        while(previousByte != -1){
            int currentByte = System.in.read();
            if(previousByte == 13 && currentByte == 10){
                previousByte = currentByte;
                continue;
            }
            else{
                System.out.write(previousByte);
            }
            previousByte = currentByte;
        }
        System.out.flush();
    }
}
