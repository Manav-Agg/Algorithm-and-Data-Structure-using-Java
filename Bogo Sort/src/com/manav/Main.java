package com.manav;

public class Main {
    public static void showArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static boolean isSorted(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                return false;
            }
        }

        return true;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /*  Fisher - Yates Algorithm in order to shuffle an array
        The algorithm produces an unbiased permutation: every permutation is equally likely
        0(N) running time ~ proportional to the number of items we want to shuffle + in - place algorithm
    */
    public static void shuffle(int[] nums){
        for(int i = nums.length - 1; i >= 0; i--){
            int j = (int)(Math.random() * i);
            swap(nums, i, j);
        }
    }

    public static void main(String[] args) {
        int[] nums = {12, -4, 56, 0, 3, 8, 2, 1};
        int loopCounter = 0;

        while(!isSorted(nums)){
            ++loopCounter;
            shuffle(nums);
        }

        System.out.println("Steps required to sort array: " + loopCounter);
        showArray(nums);
    }
}