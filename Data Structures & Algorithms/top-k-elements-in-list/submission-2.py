class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count_pos = [0] * 1000
        count_neg = [0] * 1000
        for n in nums:
            if n >= 0:
                count_pos[n] += 1
            else:
                s = int(str(n).replace('-',''))
                count_neg[s] += 1
        

        print(count)
        answer = []
        
        for i in range(k):
            max_val_pos = max(count_pos)
            max_val_neg = max(count_neg)

            if max_val_pos > max_val_neg:
                print(max_val_pos)
                index_of_Max_Val = count_pos.index(max_val_pos)
                count_pos[index_of_Max_Val] = 0
                answer.append(index_of_Max_Val)
            else:
                print(max_val_neg)
                index_of_Max_Val = count_neg.index(max_val_neg)
                count_neg[index_of_Max_Val] = 0
                answer.append(-index_of_Max_Val)

        return answer
        
