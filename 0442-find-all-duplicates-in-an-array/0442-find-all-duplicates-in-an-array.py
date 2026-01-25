class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        store={}
        result=[]
        for items in nums:
            if items in store:
                result.append(items)
                store[items]+=1
            store[items]=1
        return result
        