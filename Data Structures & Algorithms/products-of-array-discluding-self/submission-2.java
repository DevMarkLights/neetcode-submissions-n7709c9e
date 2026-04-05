class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        // [1,1,2,8]
        // [48,24,6,1]

        for(int i = 0; i < nums.length; i++){
            if(i != 0){
                prefix[i] = prefix[i-1] * nums[i-1];
            }else{
                prefix[i] = 1;
            }
        }
        System.out.println(Arrays.toString(prefix));

        for(int i = nums.length-1; i > -1; i--){
            if(i == nums.length-1){
                suffix[i] = 1;
            }else{
                suffix[i] = suffix[i+1] * nums[i+1];
            }
        }
        System.out.println(Arrays.toString(suffix));


        for(int i = 0; i < nums.length; i++){
            nums[i] = prefix[i]*suffix[i];
        }
        
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}  
