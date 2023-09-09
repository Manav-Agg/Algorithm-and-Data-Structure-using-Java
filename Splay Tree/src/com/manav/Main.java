package com.manav;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> splayTree = new SplayTree<>();
        splayTree.insert(10);
        splayTree.insert(-5);
        splayTree.insert(0);
        splayTree.insert(20);
        splayTree.insert(30);

        splayTree.find(0);
        ((SplayTree) splayTree).printRoot(); // O(1)
        System.out.println(splayTree.getMax());
        System.out.println(splayTree.getMin());

        splayTree.inOrderTraversal();
    }
}