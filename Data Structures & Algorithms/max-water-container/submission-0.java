class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while(left < right){
            int smaller = 0;
            int smallIndex = 0;
            if(heights[left] < heights[right]){
                smaller = heights[left];
                int minimum = smaller * (right-left);
                if (max < minimum){
                    max = minimum;
                }
                left++;

            }else{
                smaller = heights[right];
                int minimum = smaller * (right-left);
                if (max < minimum){
                    max = minimum;
                }
                right--;
            }
        }

        return max;
        
    }
}
