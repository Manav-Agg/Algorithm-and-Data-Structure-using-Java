package com.manav;

public class Main {
    public static void main(String[] args){
        Tree<String> bst = new BinarySearchTree<>();
        bst.insert("Manav");
        bst.insert("Vashu");
        bst.insert("Yogi");
        bst.insert("Avnish");
        bst.insert("Harry");
        bst.insert("Aman");

        bst.traversal();

        System.out.println("\n");
        System.out.println(bst.getMaxValue());
        System.out.println(bst.getMinValue());

        System.out.println("----------------------------------------------");

        Tree<Integer> bt = new BinarySearchTree<>();
        bt.insert(10);
        bt.insert(5);
        bt.insert(15);
        bt.insert(3);
        bt.insert(7);

        bt.delete(10);
        bt.traversal();

        System.out.println("\n-----------------------------------------------------");

//        0(N) or 0(logN)
        Tree<Person> bs = new BinarySearchTree<>();
        bs.insert(new Person("Manav", 22));
        bs.insert(new Person("Vashu", 20));
        bs.insert(new Person("Harry", 25));
        bs.insert(new Person("Yogi", 22));
        bs.insert(new Person("Aman", 23));

        bs.traversal();
    }
}