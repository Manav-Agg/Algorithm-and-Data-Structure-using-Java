package com.manav;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 2, 2, 1, 4, 5};
        CountingSort countingSort = new CountingSort(nums);
        countingSort.countingSort(1, 5);
        countingSort.showArray();
    }
}