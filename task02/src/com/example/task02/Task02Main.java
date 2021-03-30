package com.example.task02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("C:\\Users\\admin\\IdeaProjects\\7-java-io\\task02\\src\\com\\example\\task02\\input.test"));
        //System.setOut(new PrintStream("C:\\Users\\admin\\IdeaProjects\\7-java-io\\task02\\src\\com\\example\\task02\\output.test"));

        int previous = System.in.read();
        while(previous > 0){
            int current = System.in.read();
            if(!(previous == 13 && current == 10)){
                System.out.write(previous);
            }
            previous = current;
        }
        System.out.flush();
    }
}
