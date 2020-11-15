class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer=0;
        Map<Character,Integer> isInsideString=new HashMap<>();
        char[] inputCharArray=s.toCharArray();
        int start=0;
        int end=0;
        while(end==inputCharArray.length){
            end++;
        }
        
        
        
        for (int i = 0; i < inputCharArray.length; i++) {
   
        if(answer<isInsideString.size()-1-start+1){
            answer=isInsideString.size()-1-start+1;
        }
        return answer;
    }
}
