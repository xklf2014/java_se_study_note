package com.javase.basic;

/**
 * @Author story
 * @CreateTIme 2020/5/3
 **/
public class ArraySort {



    public static void main(String[] args) {
        //bubbleSort();
        //bubbleSort1();
        selectionSort();
    }

    public static void bubbleSort(){
        int [] array = {35,13,26,77,43,56,31};
        for (int i = array.length-1;i>0;i--){
           for (int j =1;j<=i;j++){
               if (array[j-1]>array[j]){
                   int temp = array[j];
                   array[j] = array[j-1];
                   array[j-1] = temp;
               }
           }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void bubbleSort1(){
        int [] array = {35,13,26,77,43,56,31};
        for (int i =0;i<array.length;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void selectionSort(){
        int [] array = {35,13,26,77,43,56,31};
        for (int i =0;i<array.length;i++){
            for (int j =i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
