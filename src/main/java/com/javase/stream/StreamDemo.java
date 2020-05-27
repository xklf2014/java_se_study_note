package com.javase.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author story
 * @CreateTIme 2020/5/26
 **/
public class StreamDemo {
    //通过数组来生成
    static void gen(){
        String[] strings = {"a","b","c","d","e"};
        Stream<String> stringStream = Stream.of(strings);
        stringStream.forEach(System.out::println);
    }

    //通过集合来生成
    static void gen1(){
        List<String> list = Arrays.asList("1","2","3","4","5");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

    }

    static void gen2(){
        Stream<Integer> generate = Stream.generate(() -> 1);
        generate.limit(10).forEach(System.out::println);
    }

    //使用iterator
    static void gen3(){
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(100).forEach(System.out::println);
    }

    static void gen4(){
        String str = "abcdefg";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);

    }

    static void running(){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //中间操作:如果调用的方法之后返回的结果是stream对象，就意味着是一个中间操作
        integers.stream().filter((x)->x%2==0).forEach(System.out::println);
        //求结果集中所有偶数的和
        int sum = integers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);
        //求集合中的最大值
        Optional<Integer> max = integers.stream().max((a, b) -> a - b);
        System.out.println(max.get());
        //求集合中的最小值
        Optional<Integer> min = integers.stream().min((a, b) -> a - b);
        System.out.println(min.get());
        System.out.println("======================");
        Optional<Integer> any = integers.stream().filter(x -> x % 2 == 0).findAny();
        System.out.println(any.get());

        Optional<Integer> first = integers.stream().filter(x -> x % 2 == 0).findFirst();
        System.out.println(first.get());
        /*    throw  no value present
        Optional<Integer> none = integers.stream().filter(x -> x %11 == 0).findFirst();
        System.out.println(none.get());*/

        Stream<Integer> streams = integers.stream().filter(i -> {
            System.out.println("执行逻辑代码");
            return i % 2 == 0;
        });
        streams.forEach(System.out::println);
        System.out.println("========================");
        //获取最大值和最小值,不使用min和max方法
        Optional<Integer> min1 = integers.stream().sorted().findFirst();
        System.out.println(min1.get());
        Optional<Integer> max1 = integers.stream().sorted((a, b) -> b -a).findFirst();
        System.out.println(max1.get());

        Arrays.asList("java","scala","c++","c#","python").stream().sorted().forEach(System.out::println);
        Arrays.asList("java","scala","c++","c#","python").stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
    }

    static void running1(){
        //将集合中的元素进行过滤，同时返回一个集合对象
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = integers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("================");
        //去重操作
        //Arrays.asList(1,2,3,3,3,4,4,5,2,1).stream().distinct().forEach(System.out::println);
        Arrays.asList(1,2,3,3,3,4,4,5,2,1).stream().collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("================");

        //打印20-30的集合数据
        Stream.iterate(1,x->x+=1).limit(50).skip(19).limit(11).forEach(System.out::println);

        String str = "11,22,33,44,55,66";
        int sum = Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum();
        System.out.println(sum);
        System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());
        System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());
        System.out.println(Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum());
    }

    public static void main(String[] args) {
        //生成操作
        //gen();
        //gen1();
        //gen2();
        //gen3();
        //gen4();

        //中间操作
        //running();

        //创建一组自定义对象
        String str2 = "java,scala,python";
        Stream.of(str2.split(",")).map(x->new Person(x)).forEach(System.out::println);
        Stream.of(str2.split(",")).map(Person::new).forEach(System.out::println);
        Stream.of(str2.split(",")).map(x->Person.build(x)).forEach(System.out::println);
        Stream.of(str2.split(",")).map(Person::build).forEach(System.out::println);

        //将ints中每一个数值都打印出来，同时算出最终的求和结果
        String ints = "11,22,33,44,55";
        System.out.println(Stream.of(ints.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum());
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(integers.stream().allMatch(x -> x % 2 == 0));
        System.out.println(integers.stream().allMatch(x -> x >= 0));

        integers.stream().flatMapToInt(x-> IntStream.of(Integer.valueOf(x))).forEach(System.out::println);
    }
}
