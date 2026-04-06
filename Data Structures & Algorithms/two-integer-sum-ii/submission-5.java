class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = 1;
        int[] answer = new int[2];
        while (left < numbers.length-1){
            if(numbers[left]+numbers[right] == target){
                answer[0] = left+1;
                answer[1] = right+1;
                return answer;
            }
            
            right++;
            if(right == numbers.length){
                left++;
                right = left+1;
            }
        }

        return answer;
    }
}
