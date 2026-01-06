class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        negative_array = []
        positive_array = []
        final_array = []

        for item in nums:
            if item < 0:
                negative_array.append(item)
            else:
                positive_array.append(item)

        if len(negative_array) == 0:
            for i in positive_array:
                final_array.append(i**2)
        elif len(positive_array) == 0:
            i = len(negative_array) - 1
            while i >=0:
                final_array.append(negative_array[i] ** 2)
                i -= 1
        else:
            i = 0
            j = 0
            negative_array = negative_array[::-1]
            while i < len(negative_array) and j < len(positive_array):
                if negative_array[i] ** 2 < positive_array[j] ** 2:
                    final_array.append(negative_array[i] ** 2)
                    i += 1
                else:
                    final_array.append(positive_array[j] ** 2)
                    j += 1

            while i < len(negative_array):
                final_array.append(negative_array[i] ** 2)
                i += 1
            while j < len(positive_array):
                final_array.append(positive_array[j] ** 2)
                j += 1
        return final_array
