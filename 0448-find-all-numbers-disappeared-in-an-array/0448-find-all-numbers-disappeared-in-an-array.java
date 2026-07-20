class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashSet<Integer> number=new HashSet<>();
        for(int num:nums){
            number.add(num);
        }

        for(int i=1;i<=nums.length;i++){
            if(!number.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}