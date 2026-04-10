package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solveTwoSum(int[] nums, int target){
        Map<Integer, Integer> memory = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[1];

            if (memory.containsKey(complement)) {
                return new int[] {memory.get(complement), i};
            }
            memory.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.solveTwoSum(nums, target);
        System.out.println("Indexes found: " + Arrays.toString(result));
    }
}
