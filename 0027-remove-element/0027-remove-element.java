class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        int count=0;

        if(nums.length==1){
            if(nums[0]==val){
                return 0;
            }
        }

        while(left<=right){
            while(nums[left]==val){
                nums[left]=nums[right];
                nums[right]=Integer.MIN_VALUE;
                right-=1;
                count+=1;
            }
            left+=1;
        }
        return nums.length-count;
    }
}