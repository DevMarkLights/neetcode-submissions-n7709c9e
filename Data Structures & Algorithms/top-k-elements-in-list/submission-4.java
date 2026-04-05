class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int[] answer = new int[k];

        for(int i = 0; i < k; i++){
            int best = 0;
            int maxKey = -1;
            for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
                if(best < entry.getValue()){
                    maxKey = entry.getKey();
                    best = entry.getValue();
                }
            }
            map.remove(maxKey);
            answer[i] = maxKey;
        }
        
        return answer;
    }
}
