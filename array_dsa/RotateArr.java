 public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int R[] = new int[n];
        for(int i=0;i<n;i++){
            R[(i+k)%n] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=R[i];
        }
    }


class Solution {
    public boolean isPalindrome(String s) {
        int left = 0,right = s.length()-1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        return true;
        
    }
}