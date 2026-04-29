class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // double average=Double.NEGATIVE_INFINITY;
        // for(int i=0;i<=nums.length-k;i++){
        //     double sum=0;
        //     for(int j=i;j<i+k;j++){
        //         sum+=nums[j];
        //     }
            
        //     double avg=sum/k;
        //     if(avg>average){
        //         average=avg;
        //     }
        // }

        // return average;
        double sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double average=sum/k;

        for(int i=0;i<nums.length-k;i++){
            sum=sum-nums[i]+nums[i+k];
            double avg=sum/k;
            if(avg>average){
                average=avg;
            }
        }
        return average;
    }
}