package com.manav;

public class Main{
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<Integer>();
        myQueue.enqueue(10);
        myQueue.enqueue(100);
        myQueue.enqueue(1000);

        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
    }
}