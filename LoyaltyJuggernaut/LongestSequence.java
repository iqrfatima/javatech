import java.util.HashSet;

public class LongestSequence {
    public static int longestSeq(int nums[]){
        int longest = 1;
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int streak = 0;
                while (set.contains(currentNum)) {
                    currentNum++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,1,2,3};
        System.out.println(longestSeq(arr));
    }
}
