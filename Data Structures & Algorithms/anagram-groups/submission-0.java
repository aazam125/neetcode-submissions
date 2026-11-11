class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String, ArrayList<String>> mapSolution = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String myString = new String(charArray);
            if(mapSolution.containsKey(myString)){
                mapSolution.get(myString).add(strs[i]);
            }
            else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                mapSolution.put(myString, temp);
            }

        }

        List<List<String>> solution = new ArrayList<>(mapSolution.values());

        return solution;
        
    }
}
