package com.manav;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringOperations operations = new StringOperations();
        System.out.println(operations.revertString("car"));

        List<String> suffixes = operations.getSuffixes("Hello");
        for (String s : suffixes) {
            System.out.println(s);
        }

        List<String> prefixes = operations.getPrefixes("house");
        for (String s : prefixes) {
            System.out.println(s);
        }

        System.out.println(operations.longestCommonPrefix("Helo", "HelloOk"));
        System.out.println(operations.longestRepeatedSubstring("hellohehehello"));  
    }
}