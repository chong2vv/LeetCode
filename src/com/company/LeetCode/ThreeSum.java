package com.company.LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++){
                    if (nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> sumList = new ArrayList<>();
                        sumList.add(nums[i]);
                        sumList.add(nums[j]);
                        sumList.add(nums[k]);
                        list.add(sumList);
                    }
                }
            }
        }
        return list;
    }
}
