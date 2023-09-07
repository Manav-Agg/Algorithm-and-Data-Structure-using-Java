package com.manav;

public class Main {
    public static void main(String[] args) {
        Tree avl = new AVLTree();
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.insert(60);

        avl.traverse();

        System.out.println("Hello world!");
    }
}