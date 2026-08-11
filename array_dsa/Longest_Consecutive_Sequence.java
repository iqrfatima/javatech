package array_dsa;

import java.util.TreeSet;

public class Longest_Consecutive_Sequence {
       public static int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len==0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        int prev = nums[0];
        for(int num : nums){
           set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,6,9,8};
        System.err.println(longestConsecutive(arr));

    }
}

