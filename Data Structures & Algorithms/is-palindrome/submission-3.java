class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^A-Z0-9a-z]","");
        s = s.replaceAll(" ","");

        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while (left < right){
           
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
            
        }

        return true;

    }
}
