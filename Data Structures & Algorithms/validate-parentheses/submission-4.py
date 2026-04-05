class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        closing = [')','}',']']
        opening = ['(','{','[']
        if len(s) < 2:
            return False

        for p in s:
            if p in closing:
                if len(stack) == 0: # if nothing in the stack and see a closing
                    return False
                # get top of stack
                top = stack[-1]
                if closing.index(p) == opening.index(top):
                    stack.pop()
                else:
                    return False
            else:
                stack.append(p)
        if len(stack) > 0:
            return False
        return True
        