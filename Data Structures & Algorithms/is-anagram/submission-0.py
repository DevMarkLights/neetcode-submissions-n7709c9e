class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False

        end = len(s)-1
        l = []
        for char in s:
            l.append(char)
        
        for char in t:
            try:
                l.remove(char)
            except:
                return False
        
        # if len(l) != 0:
        #     return False
        
        return True