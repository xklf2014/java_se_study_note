package com.javase.io.characterstream;

import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * @Author story
 * @CreateTIme 2020/5/22
 **/
public class CharArrayWriteDemo {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        try {
            charArrayWriter.write("hello charArrayWrite");
            charArrayWriter.write(99);
            charArrayWriter.write(98);
            System.out.println(charArrayWriter);

            charArrayWriter.append("===========");
            charArrayWriter.append('a');
            System.out.println(charArrayWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayWriter.close();
        }
    }
}
