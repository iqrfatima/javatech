public class JumpsMin {
    public static boolean canJump(int[] nums){
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for(int i=0;i<nums.length;i++){
            farthest = Math.max(farthest, i+nums[i]);
            if(i==currentEnd){
                jumps++;
                currentEnd = farthest;

            }
            if(currentEnd >= nums.length-1) return true;
            
        }
        return nums.length == 1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}
