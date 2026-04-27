class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=0;
        int i=numbers.length-1;
        while (j<i){
            if(numbers[i]+numbers[j]==target){
                return new int[]{j+1,i+1};
            }else if(numbers[i]+numbers[j]<target){
                j++;
            }else if(numbers[i]+numbers[j]>target){
                i--;
            }    
        }
        return new int[]{};
    }
}