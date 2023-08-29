package com.manav;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Manav");
        list.add("Vashu");
        list.add("Yogi");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(0) + "\n");
        list.remove(0);

        for(String s : list){
            System.out.println(s);
        }
    }
}