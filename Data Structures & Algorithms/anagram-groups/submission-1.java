class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('b',1);
        map.put('c',2);
        map.put('d',3);
        map.put('e',4);
        map.put('f',5);
        map.put('g',6);
        map.put('h',7);
        map.put('i',8);
        map.put('j',9);
        map.put('k',10);
        map.put('l',11);
        map.put('m',12);
        map.put('n',13);
        map.put('o',14);
        map.put('p',15);
        map.put('q',16);
        map.put('u',17);
        map.put('r',18);
        map.put('s',19);
        map.put('t',20);
        map.put('u',21);
        map.put('v',22);
        map.put('w',23);
        map.put('x',24);
        map.put('y',25);
        map.put('z',26);
        

        HashMap<String,List<String>> hash = new HashMap<>();

        for(int i = 0; i< strs.length; i++){
            int[] key = new int[27];
            String str = strs[i];
            for(int j = 0; j < str.length(); j++){
                key[map.get(str.charAt(j))] = key[map.get(str.charAt(j))] + 1;
            }
            
            if(hash.containsKey((Arrays.toString(key)))){
                List<String> temp = hash.get(Arrays.toString(key));
                temp.add(strs[i]);
                hash.put(Arrays.toString(key), temp);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                hash.put(Arrays.toString(key),temp);
            }

        }
        
        List<List<String>> answer = new ArrayList<>(hash.values());
        

        return answer;
    }
}
