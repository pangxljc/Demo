package com.LeetCode.primary.Array.intersect;

import java.util.Arrays;

/**
 * 给定两个数组，写一个方法来计算它们的交集。
 *
 * 例如:
 * 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 *
 * 注意：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 *
 *  跟进:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] res = new int[Math.min(len1,len2)];
        while (i < len1 && j < len2){
            if (nums1[i] == nums2[j]){
                res[k] = nums1[i];
                i++;
                j++;
                k++;
                continue;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        return Arrays.copyOf(res,k);
    }
}
