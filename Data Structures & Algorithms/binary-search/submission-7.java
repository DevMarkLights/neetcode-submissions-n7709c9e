class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        int mid = (int) (right / 2);

        if(nums.length == 0){
            return -1;
        }else if(nums.length < 2){
            if (nums[left] == target){
                return left;
            }else if( nums[right] == target){
                return right;
            }
        }

        while (left < right){
            // System.out.println(nums[left]+" "+nums[mid]+" "+nums[right]);

            if(nums[left] == target){
                return left;
            }else if( nums[mid] == target){
                return mid;
            }else if( nums[right] == target){
                return right;
            }

            if(nums[mid] < target){
                left = mid+1;
                mid = right - ((int) (right-left) / 2);
            }else{
                right = mid-1;
                mid = right - ((int) (right-left)/2);
            }
        }
        return -1;
    }
}
