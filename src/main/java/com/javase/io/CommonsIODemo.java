package com.javase.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.nio.file.Files;
import java.util.Collection;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class CommonsIODemo {
    public static void main(String[] args) {
        System.out.println(FileUtils.sizeOf(new File("news")));

        Collection<File> files = FileUtils.listFiles(new File("/Users/linfeng/workspace/javase/src/main/java/com/javase/io/characterstream")
                , EmptyFileFilter.NOT_EMPTY, null);

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}