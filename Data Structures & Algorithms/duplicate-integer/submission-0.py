class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        duplicates = set(nums)
        if len(duplicates) < len(nums):
            return True
        else:
            return False
            
        