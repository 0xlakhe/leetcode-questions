class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int high=matrix[i].length-1;
            int low=0;
                while(matrix[i][0]<=target && matrix[i][matrix[i].length-1]>=target && low<=high){
                int mid=(high+low)/2;
                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]<target){
                    low=mid+1;
                }else if(matrix[i][mid]>target){
                    high=mid-1;
                }
            }
        }
        return false;
    }
}