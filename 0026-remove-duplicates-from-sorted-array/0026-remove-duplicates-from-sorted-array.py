class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i=0
        j=0
        unique=1
        while i<len(nums):
            if nums[j]!=nums[i]:
                nums[j+1]=nums[i]
                j+=1
                unique+=1
            i+=1
        return unique
