class Solution(object):
    def threeSum(self,nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        i=0
        result=[]
        while i <len(nums)-2:
            if i>0 and nums[i]==nums[i-1]:
                i+=1
                continue
            find=-nums[i]
            j=i+1
            k=len(nums)-1
            while j<k:
                sum=nums[j]+nums[k]
                if sum>find:
                    k-=1
                    
                elif sum<find:
                    j+=1
                    
                else:
                    result.append([nums[i],nums[j],nums[k]])
                    j+=1
                    k-=1
                    while nums[k]==nums[k+1] and k>=0:
                        k-=1
                    while nums[j]==nums[j-1] and j<len(nums)-1:
                        j+=1
            i+=1
        return result

        
                 
                 