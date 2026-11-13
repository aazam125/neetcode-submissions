class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> repeatedCheck = new HashSet<>();

        int longestCount = 0;
        int runningCount = 0; 
        int left = 0;

        for(int i = 0; i < s.length(); i++){

            if(!repeatedCheck.add(s.charAt(i))){
                if(runningCount > longestCount){
                    longestCount = runningCount;
                }

                while(repeatedCheck.contains(s.charAt(i))){
                    repeatedCheck.remove(s.charAt(left));
                    left++;
                }

                repeatedCheck.add(s.charAt(i));


            }
            else{
                runningCount = i - left + 1;
                if(runningCount > longestCount){
                    longestCount = runningCount;
                }
            }

        }

        if(runningCount > longestCount){
            longestCount = runningCount;
        }

        return longestCount;

        
    }
}
