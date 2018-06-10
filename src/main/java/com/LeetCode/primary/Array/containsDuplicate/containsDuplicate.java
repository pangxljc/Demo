package com.LeetCode.primary.Array.containsDuplicate;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例：
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map map = new HashMap();
        for (int i = 0;i < nums.length;i++){
            if (map.containsKey(nums[i])){
                return true;
            } else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
