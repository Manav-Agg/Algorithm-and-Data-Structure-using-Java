package com.manav;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Manav");
        queue.add("Vashu");
        queue.add("Yogi");

        for(String s : queue){
            System.out.println(s);
        }

        System.out.println(queue.element());
        System.out.println(queue.size());
        System.out.println(queue.remove());
    }
}