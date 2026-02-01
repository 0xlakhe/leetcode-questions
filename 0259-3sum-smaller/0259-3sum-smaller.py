class Solution:
    def countTriplets(self, n, sum, arr):
        arr.sort()
        i=0
        result=0
        
        for i in range(len(arr)-2):
            left=i+1
            right=len(arr)-1
            while left<right:
                find=arr[i]+arr[left]+arr[right]
                if find<sum:
                    result+=right-left
                    left+=1
                else:
                    right-=1
            
        return result