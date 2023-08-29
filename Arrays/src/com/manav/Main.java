package com.manav;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[5];

        for(int i = 1; i < nums.length; i++){
            nums[i] = i;
        }

//        0(1) Random index
        int num = nums[2];
        System.out.println(num);

//        0(N) Linear search
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 4){
                System.out.println("Index found, " + i);
            }
        }
    }
}