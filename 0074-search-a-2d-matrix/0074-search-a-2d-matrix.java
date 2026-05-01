class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int matrixIndex=0;

        while(low<=high){
            int mid=low+(high-low)/2;
            int length=matrix[mid].length-1;

            if(matrix[mid][0]<=target && matrix[mid][length]>=target){
                matrixIndex=mid;
                break;
            }else if(matrix[mid][length]<target){
                low=mid+1;
            }else if(matrix[mid][0]>target){
                high=mid-1;
            }
        }

        int [] toSearch=matrix[matrixIndex];
        int lw=0;
        int hw= toSearch.length-1;
        while (lw<=hw) {
            int md=lw+(hw-lw)/2;
            if(toSearch[md]==target){
                return true;
            }else if(toSearch[md]<target){
                lw=md+1;
            }else if(toSearch[md]>target){
                hw=md-1;
            }
        }
        return false;
    }
}