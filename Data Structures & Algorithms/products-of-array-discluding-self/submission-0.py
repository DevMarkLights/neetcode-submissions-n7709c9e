class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = [1] * len(nums)
        suffix = [1] * len(nums)
        
        startprefix = 0
        endprefix = 1

        startsuffix = len(nums)-1
        endsuffix = startsuffix-1


        
        finished = False
        prefix_cum = 1
        suffix_cum = 1
        while startprefix != len(nums)-1:
            # print(f'startprefix {startprefix}, endprefix {endprefix}')
            # print(f'startsuffix {startsuffix}, endsuffix {endsuffix}')
            # print('')
            if endprefix == len(nums):
                # print(f'prefix_cum {prefix_cum}')
                # print(f'suffix_cum {suffix_cum}')

                prefix[startprefix] = prefix_cum
                suffix[startsuffix] = suffix_cum
                prefix_cum = 1
                suffix_cum = 1

                startprefix += 1
                endprefix = startprefix + 1
                startsuffix -= 1
                endsuffix = startsuffix -1

            else:
                # print(f'prefix  {prefix_cum}  * {nums[endprefix]} ')
                # print(f'suffix  {suffix_cum}  * {nums[endsuffix]} ')
                prefix_cum *= nums[endprefix]
                suffix_cum *= nums[endsuffix]
                endprefix += 1
                endsuffix -= 1
        
       

        for i in range(len(prefix)):
            suffix[i] = suffix[i] * prefix[i]
        
        return suffix
            