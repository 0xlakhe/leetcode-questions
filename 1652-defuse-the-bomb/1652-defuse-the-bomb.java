class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans= new int[n];

        if(k==0){
            return ans;
        }

        if(k>0){
            int left=1;
            int sum=0;
            while(left<=k){
                sum+=code[left%n];
                left++;
            }
            ans[0]=sum;

            int index=1;
            while(index<n){
                sum-=code[index%n];
                sum+=code[left%n];
                ans[index]=sum;
                left++;
                index++;

            }
        }else{
            int left = n + k; 
            int right = n - 1;
            int sum = 0;

            for (int i = left; i <= right; i++) {
                sum += code[i];
            }
            ans[0] = sum;

            int ind = 1;
            while (ind < n) {
                sum -= code[left % n];
                left++;
                right++;
                sum += code[right % n];
                
                ans[ind] = sum;
                ind++;
            }
        }
        return ans;
    }
}