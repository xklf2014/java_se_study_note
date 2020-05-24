package com.javase.io.characterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Author story
 * @CreateTIme 2020/5/22
 **/
public class PrintStreamDemo {
    public static void main(String[] args) {
        //PrintStream printStream = new PrintStream(System.out);
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("printStream.txt"));
            printStream.write("hello printStream".getBytes());
            printStream.write('a');
            printStream.write(127);
            printStream.write("中文".getBytes());

            printStream.println(100);
            printStream.print(true);
            printStream.print(123L);
            printStream.print(3.14);
            printStream.printf("%s--%d---%.2f","abc",123,111.02);

            System.err.print("error message");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printStream.close();
        }
    }
}
