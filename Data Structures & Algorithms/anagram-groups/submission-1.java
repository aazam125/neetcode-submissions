class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String, ArrayList<String>> mapSolution = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] count = new int[26];
            for (char c : strs[i].toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);

            if(mapSolution.containsKey(key)){
                mapSolution.get(key).add(strs[i]);
            }
            else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                mapSolution.put(key, temp);
            }

        }

        List<List<String>> solution = new ArrayList<>(mapSolution.values());

        return solution;
        
    }
}
