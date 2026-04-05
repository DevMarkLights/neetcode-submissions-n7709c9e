class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        answer = []

        start = 0
        end = start + 1
        finished = True
        lengthOfNums = len(nums)-1
        
        while finished:
            print(f'start{start}', f'end{end}')
            if nums[start] + nums[end] == target:
                answer.append(start)
                answer.append(end)
                finished = False
            
            if end+1 > lengthOfNums:
                start += 1
                end = start + 1
            else:
                end += 1

            
        return answer
            
