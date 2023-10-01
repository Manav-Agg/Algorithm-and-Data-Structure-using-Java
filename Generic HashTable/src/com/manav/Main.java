package com.manav;
public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("Manav", 1);
        hashTable.put("Vashu", 2);
        hashTable.put("Yogi", 3);

        System.out.println(hashTable.get("Manav"));
    }
}