class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        
        int right=k-1;
        int left=0;
        int minimum=Integer.MAX_VALUE;
        while(right<n){
            int diff = nums[right]-nums[left];
            if(diff<minimum){
                minimum=diff;
            }
            left++;
            right++;
        }
        return minimum;
    }
}