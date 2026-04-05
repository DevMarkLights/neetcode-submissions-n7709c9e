class MinStack:

    def __init__(self):
        self.stack = []
        self.min_v = 0

    def push(self, val: int) -> None:
        if len(self.stack) == 0:
            self.min_v = val
        else:
            if self.min_v > val:
                self.min_v = val
        
        self.stack.append(val)

    def pop(self) -> None:
        # if self.top == self.min_v:

        return self.stack.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return min(self.stack)
        
