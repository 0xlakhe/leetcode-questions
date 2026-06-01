class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int ans=0;
        int left=0;
        while(left<nums.length-2){
            int right=left+1;
            int diff=nums[right]-nums[left];

            while (right + 1 < nums.length && nums[right + 1] - nums[right] == diff) {
                right++;
            }
            int len=right-left+1;

            if(len>=3){
                //gauss formula
                ans+=(len-1)*(len-2)/2;
            }
            left=right;
        }
        return ans;
    }
}