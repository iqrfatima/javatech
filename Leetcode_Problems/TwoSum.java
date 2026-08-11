package Leetcode_Problems;
//1. TwoSum
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSumMthd(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,4,5};
        int target = 7;
        System.out.println(Arrays.toString(twoSumMthd(arr,target)));
    }
    
}
