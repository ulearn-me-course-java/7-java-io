package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        int prev = is.read(), cur;
        while (prev > 0){
            cur = is.read();
            if(prev != 13 || cur != 10)
                System.out.write(prev);
            prev = cur;
        }
        System.out.flush();
    }
}
