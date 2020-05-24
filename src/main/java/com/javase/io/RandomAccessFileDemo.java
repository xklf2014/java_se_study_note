package com.javase.io;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Author story
 * @CreateTIme 2020/5/22
 **/
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        File file = new File("news");
        long length = file.length();//获取文件大小
        int blockSize = 1024; //规定块的大小

        int size = (int)(Math.ceil(length * 1.0 /blockSize));
        System.out.printf("切割成<%d>个块",size);

        int beginPos = 0;
        int actualSize = (int)(blockSize > length ?length : blockSize);
        for (int i = 0;i<size;i++){
            beginPos = i * blockSize;//每次读取块的时候的起始偏移量
            if (i == size -1){
                actualSize = (int) length;
            }else{
                length -= actualSize;
            }
            System.out.println(i+"-->起始位置是:"+beginPos+"--->读取的大小是"+actualSize);
            readSplit(i,beginPos,actualSize);
        }
    }

    public static void readSplit(int i,int beginPos,int actualSize){
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(new File("news"),"r");
            randomAccessFile.seek(beginPos);//表示从哪个偏移量开始读取数据
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len=randomAccessFile.read(bytes))!=-1){
                if (actualSize > len){
                    System.out.println(new String(bytes,0,len));
                    actualSize-=len;
                }else {
                    System.out.println(new String(bytes,0,actualSize));
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
