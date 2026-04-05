class Solution:

    def encode(self, strs: List[str]) -> str:
        string = '' 
        if len(strs) == 0:
            return ''
        
        if len(strs) == 1 and strs[0] == '':
            return ';;'

        i=0
        for s in strs:
            if s == '': #preserve space
                s = '&empty'
            if i == 0:
                string = s
            else:
                string = string + ';;' + s
            i+=1
        print(f'encode {string}')
        return string

    def decode(self, s: str) -> List[str]:
        print(f'decode {s}')

        print(s, len(s) == 0, s == '')

        if len(s) == 0 and s == '':
            return []
        if s == ';;' or s == "":
            return ['']
        l = s.split(';;')
        for i in range(len(l)):
            if l[i] == '&empty':
                l[i] =  ''
        return l
