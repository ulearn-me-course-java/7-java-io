package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;

public class Task02Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> lines = getLines();
        deleteAllReturnsCarriages(lines);
        outLines(lines);
    }

    private static void outLines(ArrayList<Integer> lines) {
        for (Integer integer : lines) {
            System.out.write(integer);
        }
        System.out.flush();
    }

    private static void deleteAllReturnsCarriages(ArrayList<Integer> lines) {
        int previousValue = 0;
        for (int i = 0; i < lines.size(); i++) {
            int currentValue = lines.get(i);
            if (previousValue == 13 && currentValue == 10) {
                lines.remove(i - 1);
                i--;
            }
            previousValue = currentValue;
        }
    }

    private static ArrayList<Integer> getLines() throws IOException {
        int input;
        ArrayList<Integer> lines = new ArrayList<>();
        while ((input = System.in.read()) != -1) {
            lines.add(input);
        }
        return lines;
    }

}
