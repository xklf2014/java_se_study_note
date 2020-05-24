package com.javase.io.bytestream;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/
public class DataInputOrOutputStreamDemo {
    public static void main(String[] args) {

        FileInputStream inputStream = null;
        DataInputStream dataInputStream = null;
        FileOutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;


        try {
            outputStream = new FileOutputStream("aaa.txt");
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeInt(55);
            dataOutputStream.writeShort(11);
            dataOutputStream.writeDouble(3.14);

            inputStream = new FileInputStream("aaa.txt");
            dataInputStream = new DataInputStream(inputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                dataInputStream.close();
                inputStream.close();
                dataOutputStream.close();
                outputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
