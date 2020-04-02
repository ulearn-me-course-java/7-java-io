package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main (String[] strings) throws IOException {
        windowsToUnix(System.in, System.out);
    }

    public static void windowsToUnix(InputStream in, OutputStream out) throws IOException {

        int oneByte = in.read(), twoByte;
        while(oneByte != -1) {
            twoByte = in.read();
            if (!(twoByte == 10 && oneByte == 13)) out.write(oneByte);

            oneByte = twoByte;
        }

        out.flush();
    }

}
