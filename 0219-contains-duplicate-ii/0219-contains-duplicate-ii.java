class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> dups= new HashSet<Integer>();
        int i=0;
        while(i<nums.length){
            if(dups.contains(nums[i])){
                return true;
            }
            dups.add(nums[i]);
            if(dups.size()>k){
                dups.remove(nums[i-k]);
            }
            i++;
        }
        return false;
    }
}