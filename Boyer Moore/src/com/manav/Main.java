package com.manav;
public class Main {
    public static void main(String[] args) {
        String text = "My name is Manav";
        String pattern = "name";

        BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
        boyerMoore.precomputeShifts();
        System.out.println(boyerMoore.search());
    }
}