package com.manav;

public class Main {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        for(Integer i : stack){
            System.out.println(i);
        }

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}