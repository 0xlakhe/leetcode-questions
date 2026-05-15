class Solution {

    public int fn(int index,int[] nums,int[] map){
        if(index==0){
            return nums[index];
        }
        if(index<0){
            return 0;
        }
        if(map[index]!=-1){
            return map[index];
        }

        int pick=nums[index]+fn(index-2,nums,map);
        int notPick=fn(index-1,nums,map);
        return map[index]=Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int[] map=new int[nums.length];
        Arrays.fill(map,-1);
        int x=fn(nums.length-1,nums,map);
        return x;
    }
}