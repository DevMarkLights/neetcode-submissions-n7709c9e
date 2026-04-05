class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        if len(nums) == 1:
            if target == nums[0]:
                return 0
            return -1
        elif len(nums) == 2:
            if target == nums[0]:
                return 0
            if target == nums[1]:
                return 1
            return -1

        mid_point = int(len(nums)/2)
        l = 0
        r = 0
        if nums[mid_point] < target:
            l = mid_point
            r = len(nums)-1
        else:
            l = 0
            r = mid_point

        while True:
            print(f'{l} {r}')
            if  l > r:
                return -1

            if nums[l] == target:
                return l
            if nums[r] == target:
                return r
            
            diff = r - l
            midpoint = int(diff/2)
            print(f'midoint {midpoint}')

            if nums[midpoint] < target:
                l += 1
                r = r - midpoint
            else:
                l = l + midpoint
                r -= 1
