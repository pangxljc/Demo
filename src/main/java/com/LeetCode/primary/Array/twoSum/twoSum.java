package com.LeetCode.primary.Array.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        for (int j = 0; j < nums.length; j++){
            int value = target - nums[j];
            if (map.containsKey(value) && map.get(value) != j){
                int index = map.get(value);
                if (index > j){
                    return new int[]{j,index};
                }
            }
        }
        return new int[0];
    }
}
