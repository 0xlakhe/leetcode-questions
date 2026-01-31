class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        max_diff=float('inf')
        i=0
        res_sum=0
        nums.sort()
        while i<len(nums)-1:
            left=i+1
            right=len(nums)-1
            while left<right:
                result=nums[i]+nums[left]+nums[right]
                diff=abs(result-target)
                if diff<max_diff:
                    max_diff=diff
                    res_sum=result
                if result<target:
                    left+=1
                elif result>target:
                    right-=1
                else:
                    break
            i+=1
        return res_sum