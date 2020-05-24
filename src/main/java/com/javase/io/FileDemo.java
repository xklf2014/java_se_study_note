package com.javase.io;

import sun.java2d.pipe.SpanShapeRenderer;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author story
 * @CreateTIme 2020/5/20
 **/
public class FileDemo {
    public static void main(String[] args) {


        File file = new File("src/abc.txt");
        //创建文件
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //判断执行、可读、可写权限
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        //打印文件路径
        System.out.println(file.getPath());
        //获取文件名称
        System.out.println(file.getName());
        //获取磁盘空间
        System.out.println(file.getFreeSpace() / 1024 /1024 /1024);
        //判断文件是否存在
        System.out.println(file.exists());

        //是否为路径
        System.out.println(file.isDirectory());
        //是否为文件
        System.out.println(file.isFile());
        //是否隐藏
        System.out.println(file.isHidden());

        Date date = new Date(file.lastModified());
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        System.out.println(format.format(date));
        //获取父级路径
        System.out.println(file.getParent());
        //返回系统文件分隔符
        System.out.println(file.separator);
        System.out.println("================");
        File[] files = File.listRoots();
        for (int i = 0;i<files.length;i++){
            System.out.println(files[i]);
        }

        //mkdir创建单级目录
        //File file1 = new File("/Users/linfeng/workspace/javase/src/main/resources/newpath");
        //file1.mkdir();
        //mkdirs创建多级目录
        //File file2 = new File("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c");
        //file2.mkdirs();
        File file2 = new File("/Users/linfeng/workspace/javase/src/main/java/com/javase");
        printFile(file2);
    }

    //打印指定盘符所有文件
    public static void printFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for(File f : files){
                printFile(f);
            }

        }else{
            System.out.println(file.getAbsolutePath());
        }
    }
}
