class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        if(nums.length < 3){
            return answer;
        }

        int left = 0;
        int mid = 1;
        int right = 2;

        while(left < nums.length-2){
            // System.out.println(nums[left] + nums[mid] + nums[right]);

            if( nums[left] + nums[mid] + nums[right] == 0){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[left]);
                temp.add(nums[mid]);
                temp.add(nums[right]);
                if(!answer.contains(temp)){
                    answer.add(temp);
                }
            }
            
            right++; // move only right
            if(right >= nums.length){ // only move mid and right
                mid++;
                right = mid+1;
            }
            if(mid > nums.length-2){ // reset points
                left++;
                mid = left + 1;
                right = mid + 1;
            }

        }

        return answer;

    }
}
