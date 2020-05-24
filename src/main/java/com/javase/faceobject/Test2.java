package com.javase.faceobject;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/6
 **/
public class Test2 {
    public static void main(String[] args) {
            //searchWordByList();
            //random50AndGetMaxMinAndHigher60(100);
        //reverseArrays(20);
        //deleteZeroInArrays();
        //print2DemetionSum();
        //printSortArray();
        //printTodayIsCurrYearWhichDay();
        //mergeTwoArraySortArray();
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //System.out.println(searchLoop(array, 7));

        System.out.println(searchRecursive(array, 0, array.length - 1, 7));
    }

    /*
    * 1.数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
    *   程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。
    * */
    public static void searchWordByList(){
        String[] strs = new String[]{"hello","word","java","php","jsp","linux","bash","js","es","jenkins"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个单词");
        String input = sc.nextLine().toUpperCase();
        boolean flag = false;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].toUpperCase().equals(input)){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    /*
    * 获取数组最大值和最小值操作：利用Java的Math类的random()方法，
    * 编写函数得到0到n之间的随机数，n是参数。
    * 并找出产生50个这样的随机数中最大的、最小的数，并统计其中>=60的有多少个。
    * 提示：使用 int num=(int)(n*Math.random());获取随机数
    *
    * */
    public static void random50AndGetMaxMinAndHigher60(int n){
        //初始化数组
        int[] arrays = new int[50];
        for (int i =0;i<50;i++){
            int num=(int)(n*Math.random());
            arrays[i] = num;
        }

        //排序
        for (int i = 0; i < arrays.length; i++) {
                for (int j = 1; j < arrays.length - i; j++) {
                    if (arrays[j - 1] > arrays[j]) {
                        arrays[j - 1] = arrays[j - 1] ^ arrays[j];
                        arrays[j] = arrays[j - 1] ^ arrays[j];
                        arrays[j - 1] = arrays[j - 1] ^ arrays[j];
                    }
                }
        }

        //取大于60的个数
        int gt60counts = 0;
        for (int i = arrays.length - 1; i >= 0; i--) {
            if (arrays[i] < 60){
                break;
            }
            gt60counts++;
        }
//测试用
//        for (int i = 0; i <arrays.length ; i++) {
//            System.out.println(arrays[i]);
//        }

        System.out.println("最大值为"+arrays[arrays.length-1]);
        System.out.println("最小值为"+arrays[0]);
        System.out.println("大于60的个数为"+gt60counts);
    }

    /*
    *
    * 3.数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
    *   思路：把0索引和arr.length-1的元素交换，把1索引和arr.length-2的元素交换…..
	*   只要交换到arr.length/2的时候即可。
    * */
    public static void reverseArrays(int n){
        int[] arrays = new int[10];
        for (int i =0;i<10;i++){
            int num=(int)(n*Math.random());
            arrays[i] = num;
        }

        System.out.println("原序数组如下");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+"\t");
        }

        for (int i = 0; i < arrays.length/2; i++) {
            arrays[i]= arrays[i]^arrays[arrays.length-i-1];
            arrays[arrays.length-i-1]=arrays[i]^arrays[arrays.length-i-1];
            arrays[i]=arrays[i]^arrays[arrays.length-i-1];
        }
        System.out.println("\n逆序数组如下");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+"\t");
        }
    }

    /*
    * 4.合并数组操作：现有如下一个数组：   int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}   
    * 要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，
    * 生成的新数组为： int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}  
    * 思路： 确定出不为0的个数，这样可以开辟新数组；从旧的数组之中，取出内容，并将其赋给新开辟的数组。
    * */
    public static void deleteZeroInArrays(){
        int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int zeros = 0;
        //求0的个数用于计算新数组长度
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i]==0){
                zeros++;
            }
        }
        //初始化新数组
        int[] newArr = new int[oldArr.length-zeros];
        int newCount= 0;
        //将不为0的数添加到新数组
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i]==0){
                continue;
            }
            newArr[newCount++] = oldArr[i];
        }
        System.out.println("新数组如下");
        for (int j =0;j<newArr.length;j++){
            System.out.print(newArr[j]+"\t");
        }
    }

    /*
    *
    * 5.二分法查找操作：使用二分法查找有序数组中元素。找到返回索引，不存在输出-1。
    * 分析：二分法查找的前提是数组有序。
    * 假如有一组数为3，12，24，36，55，68，75，88要查给定的值24.
    * 可设三个变量front，mid，end分别指向数据的上界，中间和下界，mid=（front+end）/2.　　
    * 1)开始令front=0（指向3），end=7（指向88），则mid=3（指向36）。因为mid>x，故应在前半段中查找。
    * 2)令新的end=mid-1=2，而front=0不变，则新的mid=1。此时x>mid，故确定应在后半段中查找。
    * 3)令新的front=mid+1=2，而end=2不变，则新mid=2，此时a[mid]=x，查找成功。
    * 如要查找的数不是数列中的数，例如x=25，当第三次判断时，x>a[mid]，按以上规律，
    * 令front=mid+1，即front=3，出现front>end的情况，表示查找不成功。
    * */
    public static int searchLoop(int[] array,int findValue) {
        // 如果数组为空，直接返回-1，即查找失败
        if (array == null) {
            return -1;
        }
        // 起始位置
        int start = 0;
        // 结束位置
        int end = array.length - 1;
        while (start <= end) {
            // 中间位置
            int middle =(start + end) >> 1;
            // 中值end
            int middleValue = array[middle];
            if (findValue == middleValue) {
                // 等于中值直接返回
                return middle;
            } else if (findValue < middleValue) {
                // 小于中值时在中值前面找
                end = middle - 1;
            } else {
                // 大于中值在中值后面找
                start = middle + 1;
            }
        }
        // 返回-1，即查找失败
        return -1;
    }



    //6.二维数组遍历求和操作：用二重循环求出二维数组b所有元素的和：
    // int[][] b={{11},{21,22},{31,32,33}}
    public static void print2DemetionSum(){
        int[][] b={{11},{21,22},{31,32,33}};
        int sum = 0;

        for (int i = 0;i<b.length;i++){
            for (int j =0;j<b[i].length;j++){
                System.out.print(i+"数组"+b[i][j]+"\t");
                sum+=b[i][j];
            }
            System.out.println();
        }

        System.out.println("所有元素和为"+sum);
    }



    //1.生成一百个随机数，放入数组，然后排序输出。
    public static void printSortArray(){
        //初始化数组
        int[] arrays = new int[100];
        for (int i = 0; i < 100; i++) {
            arrays[i]=(int)(100*Math.random());
        }

        //排序
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 1;j <arrays.length-i;j++){
                if (arrays[j - 1] > arrays[j]) {
                    arrays[j - 1] = arrays[j - 1] ^ arrays[j];
                    arrays[j] = arrays[j - 1] ^ arrays[j];
                    arrays[j - 1] = arrays[j - 1] ^ arrays[j];
                }
            }
        }

        //打印
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

    }
    //2.题目：输入某年某月某日，判断这一天是这一年的第几天？
    //分析：以3月5日为例，先把前两个月的加起来，然后再加上5天即本年第几天，特殊情况，闰年且输入月份大于3需考虑多加一天。可定义数组存储1-12月各月天数。
    public static void printTodayIsCurrYearWhichDay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年");
        int year = sc.nextInt();
        System.out.println("请输入月");
        int month = sc.nextInt();
        System.out.println("请输入日");
        int day = sc.nextInt();
        //将整月天数加和
        int days=0;
        boolean runYear =bissextile(year);
        for (int i =1;i<=month-1;i++){
            if (i==2){
                if (runYear){
                    days+=29;
                }else {
                    days+=28;
                }
                continue;
            }
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days+=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days+=30;
                    break;
            }
        }
        //将不足一个月第天数加到总和
        days+=day;
        System.out.println(day+"天是"+year+"年的第"+days+"天");

    }

    static boolean bissextile(int year){  //创建boolean类型的方法
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){  //平闰年判断算法
            return true;
        }
        else{
            return false;
        }
    }

    //3.使用二分法查找有序数组中元素。找到返回索引，不存在输出-1。使用递归实现
    public static int searchRecursive(int[] array,int start,int end,int findValue){
        if (array == null){
            return  -1;
        }

        if (start <= end){
            int mid = (start + end) >> 1;
            int midValue = array[mid];

            if (findValue == midValue){
                return mid;
            }else if (findValue > midValue){
                return searchRecursive(array,mid+1,end,findValue);
            }else{
                return searchRecursive(array,start,mid -1,findValue);
            }
        }
        return -1;
    }



    //4. 数组A：1，7，9，11，13，15，17，19；数组b：2，4，6，8，10   
    // 两个数组合并为数组c，按升序排列。 要求：使用Arrays类的方法快速实现。
    public static void mergeTwoArraySortArray(){
        int [] A = {1,7,9,11,13,15,17,19};
        int [] B = {2,4,6,8,10};
        int [] C = new int[A.length+B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        for (int i = 0;i<B.length;i++){
            C[i+A.length] = B[i];
        }

        Arrays.sort(C);

        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }
    }


}
