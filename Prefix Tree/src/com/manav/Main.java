package com.manav;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert("adam");
        tree.insert("ada");
        tree.insert("adaa");
        tree.insert("adada");
        tree.insert("adazzz");

        List<String> list = tree.allWordsWithPrefix("ada");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println(tree.searchAsMap("adam"));
        System.out.println(tree.longestCommonPrefix());
    }
}