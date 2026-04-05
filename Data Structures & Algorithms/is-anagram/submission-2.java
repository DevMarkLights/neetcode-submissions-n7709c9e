class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        // for(int i = 0; i < s.length(); i++){
        //     if(!t.contains(s.charAt(i))){
        //         return false
        //     }

        // }
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
            list2.add(t.charAt(i));
        }

        for(int i = 0; i < list2.size(); i++){
            list.remove(list2.get(i));
        }
        if(list.size() > 0){
            return false;
        }else{
            return true;
        }
    }
}
