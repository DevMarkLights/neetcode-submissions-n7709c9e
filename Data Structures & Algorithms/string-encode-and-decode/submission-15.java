class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        if(strs.size() == 0){
            return encodedString;
        }

        for(int i = 0; i < strs.size(); i++){
            String lengthOfString = String.valueOf(strs.get(i).length());
            encodedString = encodedString + lengthOfString + "#"+ strs.get(i);
        }
        // System.out.println(encodedString);
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        if(str.length() == 0){
            return answer;
        }

        String number = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                number = number + str.charAt(i);
            }
            // System.out.println(number+" "+str.charAt(i));
           
            if(str.charAt(i) == '#'){
                int length = Integer.parseInt(number);
                int end = i+1+length;
                String string = str.substring(i+1,end);
                answer.add(string);
                // System.out.println(string);
                number = "";
                i = end-1;
            }
        }
        // System.out.println(answer);

        return answer;
    }
}
