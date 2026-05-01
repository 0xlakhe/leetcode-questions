class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int min=Integer.MAX_VALUE;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(nums[left]>nums[mid]){
                if(nums[mid]<min){
                    min=nums[mid];
                }
                right=mid-1;
            }else if(nums[left]<=nums[mid]){
                if(nums[left]<min){
                    min=nums[left];
                }
                left=mid+1;
            }
        }
        return min;
    }
}