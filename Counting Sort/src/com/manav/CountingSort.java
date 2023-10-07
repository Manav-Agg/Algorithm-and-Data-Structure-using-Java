package com.manav;

public class CountingSort{
    private int[] nums;

    public CountingSort(int[] nums){
        this.nums = nums;
    }

    public void countingSort(int min, int max){
        int[] countArray = new int[max - min + 1];

//        0(N)
        for(int i = 0; i < nums.length; i++){
            countArray[nums[i] - min]++;
        }

//        0(k)
        int z = 0;
        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                this.nums[z] = i;
                z++;
                countArray[i - min]--;
            }
        }
    }

    public void showArray(){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}