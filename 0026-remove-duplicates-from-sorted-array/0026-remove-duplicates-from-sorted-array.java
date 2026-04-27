class Solution {
    public int removeDuplicates(int[] nums) {

        int start=0;
        int unique=1;
        for(int i=1;i<nums.length;i++){
            if(nums[start]==nums[i]){
                continue;
            }else{
                start++;
                nums[start]=nums[i];
                unique++;
            }
        }
        return unique;
    }
}