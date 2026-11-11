class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> holder = new HashMap<>();

        for(int i = 0; i < strs.length; i++){

            char[] tempChar = strs[i].toCharArray();
            Arrays.sort(tempChar);
            String key = new String(tempChar); 

            if(!holder.containsKey(key)){
                ArrayList<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                holder.put(key, tempList);
            }
            else{
                List<String> tempList2 = holder.get(key);
                tempList2.add(strs[i]);
            }
        }

        List<List<String>> solution = new ArrayList<>(holder.values());
        
        return solution;
        
    }
}
