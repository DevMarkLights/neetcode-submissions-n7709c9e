class Solution:
    def isPalindrome(self, s: str) -> bool:

        # s = re.sub('[A-Za-z0-9]', '', s)
        s = "".join(filter(str.isalnum, s))
        print(s)
        start = 0
        end = len(s)-1
        finished = False
        pal = True

        if s == "":
            return pal

        while not finished:
            if start-end == 0 or start-end > 0:
                finished = True
            if s[start].lower() != s[end].lower():
                print(s[start],s[end])
                pal = False
                finished = True
            start += 1
            end -= 1

        return pal