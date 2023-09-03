package com.manav;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new java.util.LinkedList<>();
        list.add(3);
        list.add(6);
        list.add(9);

        list.remove(0);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        for(Integer i : list){
            System.out.println(i);
        }
    }
}