package com.dummy.springboot.dummyspring;

public class Math {

    public int calculateSum(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}
