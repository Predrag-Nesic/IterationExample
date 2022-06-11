package com.company;

import java.util.Iterator;
import java.util.Scanner;

public class MyCol implements Iterable<Object> {
    private String[] cars;
    private int count = 0;

    public MyCol(int br) {
        this.cars = new String[br];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < cars.length; i++) {
            System.out.println("Enter " + (i + 1) + ". car");
            cars[i] = scan.nextLine();
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            public boolean hasNext() {
                return count < cars.length;
            }

            public Object next() {
                return cars[count++];
            }
        };
    }
}
