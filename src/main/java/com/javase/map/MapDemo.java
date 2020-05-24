package com.javase.map;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @Author story
 * @CreateTIme 2020/5/19
 **/

/*
* map存储的是k-v键值对映射的数据
*       实现类：
*           HashMap：数据+链表（1.7),数组+链表+红黑树（1.8）
*           LinkedHashMap：链表
*           TreeMap：红黑树
*
*       基本api操作：
*           增加：
*                put(k-v)       添加元素
*           查询
*               isEmpty         判断是否为空
*                size           返回map大小
*               containsKey     判断map是否包含key
*               containsValue   判断map是否包含value
*               get             通过key获取value
*           删除
*               clear           清空map
*               remove          删除指定元素
*
*           map.entry：表示的是K-V组合的一组映射关系，key和value成组出现
*
*           HashMap和HashTable的区别：
*               1、hashmap线程不安全，效率比较高，hashtable线程安全，效率比较低
*               2、hashmap中key和value都允许为null，hashtable不允许为空
*
*           hashmap初始值为2的N次幂
*               1、方便进行与操作，提高效率， 与运算要比取模运算效率高
*               2、hash & （initCapacity-1）
*                   如果是0，表示新数组和旧数组的下标位置不会变。如果是1，只需要将索引加上旧的数组的长度
*                   的值即为新数组的下标
*
*           1.7源码知识点：
*               1、默认初始容量
*               2、加载因子0.75
*               3、put操作
*                   （1） 设置值，计算hash
*                   （2） 扩容操作
*                   （3） 数据迁移的过程
*
*           1.8源码知识点：
*
*
* */
public class MapDemo {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        map.put(null,null);
        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        //map.clear();
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(1));
        System.out.println(map.get("a"));
        System.out.println(map.remove("a"));

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key+"="+map.get(key));
        }

        System.out.println("=================");
        //只能通过对应key获取value，不能通过value获取key
        Collection<Integer> values = map.values();
        for(Integer i : values){
            System.out.println(i);
        }

        System.out.println("=================");

        Set<String> keys2 = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println("key:"+key+"\tvalue:"+map.get(key));
        }

        System.out.println("=================");

        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> it1 = entries.iterator();
        while (it1.hasNext()){
            Map.Entry<String, Integer> next = it1.next();
            System.out.println(next.getKey()+"==>"+next.getValue());
        }


        System.out.println("=================");
        map.entrySet().forEach(m->{
            System.out.println("key:"+m.getKey()+"\tvalue:"+m.getValue());
        });
    }
}
