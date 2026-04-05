class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = 1;
        int length = nums.length;
        int[] answer = {0,1};
        while( left < length-1){
            
            if(nums[left] + nums[right] == target){
                answer[0] = left;
                answer[1] = right;
                break;
            }

            right++;
            if (right == length){
                left++;
                right = left+1;
            }
        }
        return answer;
    }
}
