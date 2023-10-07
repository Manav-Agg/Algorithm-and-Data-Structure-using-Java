package com.manav;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[30];

        for(int j = 0; j < nums.length; j++){
            nums[j] = random.nextInt(1000) - 500;
        }

        MergeSort mergeSort = new MergeSort(nums);
        mergeSort.mergeSort(0, nums.length - 1);
        mergeSort.showResult();
    }
}