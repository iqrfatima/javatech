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