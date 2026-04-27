class Solution {
    public int maxArea(int[] height) {
        //brute force approach

        // int area=-1;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int min=nums[i];
        //         if(nums[j]<nums[i]){
        //             min=nums[j];
        //         }
                
        //         int marea=(j-i)* min;
        //         if(marea>area){
        //             area=marea;
        //         }
        //     }
        // }
        // return area;

        int water=-1;
        int i=0;
        int j= height.length-1;
        while(i<j){
            int w=j-i;
            int h= Math.min(height[i],height[j]);
            int area=w*h;
            water=Math.max(water, area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return water;
    }
}