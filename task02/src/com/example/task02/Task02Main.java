package com.example.task02;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
public class Task02Main {
    public static void main(String[] args) throws IOException
    {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        //byte[] input = new byte[] {65, 13, 10, 10, 13};
        //System.setIn(new ByteArrayInputStream(input));
        Replace();
    }

    private static void Replace(){
        byte[] buf = new byte[] {-1, -1};
        int bytesRead;

        try {
            while ((bytesRead = System.in.read(buf, 1, 1)) != -1) {
                if(buf[0] != -1 && !(buf[0] == 13 && buf[1] == 10))
                    System.out.write(buf[0]);

                buf[0] = buf[1];
            }

            if(buf[0] != -1)
                System.out.write(buf[0]);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
