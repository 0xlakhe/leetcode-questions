class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        k=k%nums.length;
        int[] ans= new int[nums.length];

        int rotate=nums.length-k;
        int i=0;
        while(rotate<nums.length){
            ans[i]=nums[rotate];
            i++;
            rotate++;
        }
        rotate=nums.length-k;
        int j=0;
        while(j<rotate){
            ans[i]=nums[j];
            j++;
            i++;
        }
        for(int x=0;x<ans.length;x++){
            nums[x]=ans[x];
        }
    }
}