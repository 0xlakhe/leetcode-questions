class Solution(object):
    def sortColors(self, nums):
        two=0
        one=0
        zero=0

        for i in nums:
            if i ==0:
                zero+=1
            elif i==1:
                one+=1
            else:
                two+=1

        index=0
        while index<zero:
            nums[index]=0
            index+=1
        count=0
        while count<one:
            nums[index]=1
            index+=1
            count+=1
        count=0
        while count<two:
            nums[index]=2
            index+=1
            count+=1
        return nums

