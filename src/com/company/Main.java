package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyCol col = new MyCol(3);
        for(Object c : col) {
            System.out.println(c);
        }
        System.out.println(col.getCount());

//        Iterator iter = col.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
        //this code, the WHILE, does not work because the count of the col object has reach the end of the queue
        // in order for it to work we must make a new object of MyCol type

        col = new MyCol(3);
        Iterator iter = col.iterator();
        if(iter.hasNext()) {
            System.out.println("There is more");
        } else {
            System.out.println("End of queue");
        }
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        Set set = new HashSet();
        set.add("John");
        set.add("Mary");
        set.add("John");
        for(Object s : set) {
            System.out.println(s);
        }
        Iterator iter1 = set.iterator();
        while(iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        // the while code here works because the count is set to 0 once the iteration finishes
    }
}