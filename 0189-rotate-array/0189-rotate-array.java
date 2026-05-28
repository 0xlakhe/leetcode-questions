class Solution {
    public void rotate(int[] nums, int k) {
        // if(nums.length==1){
        //     return;
        // }
        // k=k%nums.length;
        // int[] ans= new int[nums.length];

        // int rotate=nums.length-k;
        // int i=0;
        // while(rotate<nums.length){
        //     ans[i]=nums[rotate];
        //     i++;
        //     rotate++;
        // }
        // rotate=nums.length-k;
        // int j=0;
        // while(j<rotate){
        //     ans[i]=nums[j];
        //     j++;
        //     i++;
        // }
        // for(int x=0;x<ans.length;x++){
        //     nums[x]=ans[x];
        // }

        // k=k%nums.length;
        // int rotate=nums.length-k;
        // while(rotate<nums.length){
        //     int i=0;
        //     int temp= nums[i];
        //     nums[i]=nums[nums.length-1];
        //     while(i+1<nums.length){
        //         int rtemp=nums[i+1];
        //         nums[i+1]=temp;
        //         temp=rtemp;
        //         i++;
        //     }
        //     rotate++;
        // }
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }

    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}