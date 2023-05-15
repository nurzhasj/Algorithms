class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        res = [-1 for _ in range(len(arr))]
        
        max_num = -1
        for i in range(len(arr) - 1, -1, -1):
            res[i] = max_num
            if arr[i] > max_num:
                max_num = arr[i]
        return res
