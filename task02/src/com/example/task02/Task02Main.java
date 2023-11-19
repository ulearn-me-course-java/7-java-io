package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        //write to list
        int nextByte;
        ArrayList<Integer> nextBytes = new ArrayList<>();
        while ((nextByte = System.in.read()) != -1)
        {
            nextBytes.add(nextByte);
        }

        //replace 13 10 with 10
        int i = 0;
        while(i < nextBytes.size()-1)
        {
            if (nextBytes.get(i) == 13 && nextBytes.get(i+1) == 10)
            {
                nextBytes.remove(i);
            }
            else
            {
                i++;
            }
        }

        //print list
        for (int elem : nextBytes)
        {
            System.out.write(elem);
        }
        System.out.flush();
    }
}
