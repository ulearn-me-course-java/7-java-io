package com.example.task02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
            Scanner s = new Scanner(inputStreamReader).useDelimiter("\\z");
            String result = s.hasNext() ? s.next() : "";
            out.write(result.replaceAll("\r\n", "\n").getBytes());
        }
        System.out.flush();
    }
}
