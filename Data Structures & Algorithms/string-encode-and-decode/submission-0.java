class Solution {

    public String encode(List<String> strs) {

        String solution = "";

        
        for(String text: strs){
            String length = String.valueOf(text.length()) + "#";
            String solutionPart = length + text;
            solution+=solutionPart;

        }

        return solution;

    }

    public List<String> decode(String str) {

        ArrayList<String> solution = new ArrayList<>();

        int lengthHelper = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '#'){
                int length = Integer.parseInt(str.substring(lengthHelper,i));
                int end = i + length + 1;
                lengthHelper = end; 
                solution.add(str.substring(i + 1, end));
                i = end;
                
            }
            else{
                continue;
            }
        }

        return solution; 

    }
}
