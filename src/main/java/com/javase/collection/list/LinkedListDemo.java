package com.javase.collection.list;

import java.util.LinkedList;

/**
 * @Author story
 * @CreateTIme 2020/5/17
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(123);
        linkedList.add(false);
        linkedList.add("abc");
        linkedList.add(3.14);
        System.out.println(linkedList);

        linkedList.add(0,"java");
        linkedList.add(5,60);
        System.out.println(linkedList);

        linkedList.addFirst("first");
        linkedList.addLast("last");
        System.out.println(linkedList);

        System.out.println(linkedList.element());

        linkedList.offer("offer");
        System.out.println(linkedList);

        System.out.println(linkedList.peek());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.pop());


    }
}
