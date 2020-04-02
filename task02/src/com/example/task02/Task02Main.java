package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        fromWindowsToUnix(System.in,System.out);
    }

    public static void fromWindowsToUnix(InputStream in,OutputStream out) throws IOException {
        int firstByte = in.read();
        int secondByte;

        while(firstByte != -1){
            secondByte = in.read();
            if (!(secondByte == 10 && firstByte == 13)){
                out.write(firstByte);
            }
            firstByte = secondByte;
        }
        out.flush();
    }

}
