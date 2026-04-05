class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operands = ['+','-','*','/']
        stack = []

        for tok in tokens:
            if tok in operands:
                y = stack.pop()
                x = stack.pop()
                # if tok == '/':
                #     tok = '/'
                print(f'{x} {tok} {y}')
                answer = int(eval(f'{x} {tok} {y}'))
                stack.append(answer)
                print(stack)
            else:
                stack.append(tok)
        
        return int(stack.pop())

            