class Solution {

    private void fn(List<List<Integer>> list, List<Integer> ds, int[] nums,int index){
        if(index>=nums.length){
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        fn(list,ds,nums,index+1);
        ds.remove(ds.size()-1);
        fn(list,ds,nums,index+1);
    }   
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        fn(ans,ds,nums,0);
        return ans;
    }
}