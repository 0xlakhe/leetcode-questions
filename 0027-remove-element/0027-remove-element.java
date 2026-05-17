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
        // while(left<right){
        //     while(val==nums[right]){
        //         right-=1;
        //         count+=1;
        //         if(right<0){
        //             break;
        //         }
        //     }
        //     if(right<0){
        //         break;
        //     }
        //     while(val==nums[left]){
        //         nums[left]=nums[right];
        //         nums[right]=Integer.MIN_VALUE;
        //         count+=1;
        //         right-=1;
        //         left+=1;
        //     }
        //     left+=1;
        // }

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