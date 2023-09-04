package com.manav;

public class Main {
    public static void main(String[] args){
        Stack<String> myStack = new Stack<>();
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
    }
}