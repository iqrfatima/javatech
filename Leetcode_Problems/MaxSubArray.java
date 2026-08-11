package Leetcode_Problems;
// Kadane's algorithm
//53.Maximum subarray

import java.util.Arrays;

public class MaxSubArray {
    public static int maxSubArrayMthd(int[] nums) {
        int res = nums[0];
        int total = 0;

        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }

            total += n;
            res = Math.max(res, total);
        }
        return res;        
    }
    public static void main(String[] args) {
        int arr[] = {-2,4,6,-1,4,5};
        System.out.println(maxSubArrayMthd(arr));
    }
}

