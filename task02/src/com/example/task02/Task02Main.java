package com.example.task02;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {


    }

    public static void switchToUnix(InputStream inputStream) throws IOException{
        String line = "";
        int bytes;
        while ((bytes = inputStream.read()) != -1){
            line += (char)bytes;
        }
        System.out.println(line.replaceAll("\r\n", "\n"));
    }
}
