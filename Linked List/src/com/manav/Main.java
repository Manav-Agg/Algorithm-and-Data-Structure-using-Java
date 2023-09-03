package com.manav;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<Person>();

        Person person = new Person(24, "Harry");
        list.insert(new Person(22, "Manav"));
        list.insert(new Person(20, "Vashu"));
        list.insert(new Person(21, "Yogi"));
        list.insert(person);

        System.out.println(list.size());
        list.remove(person);
        list.traverseList();
    }
}