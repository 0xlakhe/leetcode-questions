class Solution {
    public void nextPermutation(int[] nums) {
        // int right=nums.length-1;
        // int left=right-1;
        // if(nums.length==1){
        //     return;
        // }
        // if(nums[right]>nums[left]){
        //     int temp=nums[left];
        //     nums[left]=nums[right];
        //     nums[right]=temp;
        //     return;
        // }
        // if(nums[0]>=nums[left] && nums[0]>=nums[right]){
        //     Arrays.sort(nums);
        //     return;
        // }

        // int temp=nums[0];
        // if(nums[0]>=nums[right] && nums[left]>nums[right]){
        //     nums[0]=nums[left];
        //     nums[left]=nums[right];
        //     nums[right]=temp;
        // }else{
        //     nums[0]=nums[right];
        //     nums[right]=nums[left];
        //     nums[left]=temp;
        // }   
        // boolean check=true;
        // for(int i=1; i<nums.length;i++){
        //     if(nums[i]>nums[i-1]){
        //         check=false;
        //     }
        // }
        // if (check){
        //     int i=nums.length-1;
        //     int j=0;
        //     while(i>j){
        //         int temp = nums[j];
        //         nums[j] = nums[i];
        //         nums[i] = temp;
        //         i--;
        //         j++;
        //     }
        //     return;
        // }
        
        int i=nums.length-1;
        while(i>0 && nums[i-1]>=nums[i]){
            i--;
        }
        int j=0;
        if(i>0){
            j=i-1;
            i=nums.length-1;
            while(i>j){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    break;
                }
                i--;
            }
            j+=1;
        }
        i=nums.length-1;
        while(i>j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i--;
            j++;
        }
    }
}