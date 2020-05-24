package com.javase.basic;

/**
 * @Author story
 * @CreateTIme 2020/5/3
 **/
public class TwoDimesionArray {
    public static void main(String[] args) {
        createT2DimesionArray();

    }

    public static void createT2DimesionArray(){
        int [] array = new int [6];
        int [][] arr2 = new int [2][];
        arr2[0] = new int [4];
        arr2[1] = new int []{1,2,3};

        //赋值操作
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[0][3] = 4;

        for (int i = 0;i<arr2.length-1;i++){
            for (int j =0;j<arr2[i].length;j++){
                System.out.println(arr2[i][j]);
            }
        }

    }
}
