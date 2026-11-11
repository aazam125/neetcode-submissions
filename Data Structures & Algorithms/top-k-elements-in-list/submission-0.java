class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> mapElementToFrequency  = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            mapElementToFrequency.put(nums[i], mapElementToFrequency.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Integer> sortFrequencies = new PriorityQueue<>(
            (a,b) -> mapElementToFrequency.get(b) - mapElementToFrequency.get(a)
        );

        for(int num: mapElementToFrequency.keySet()){
            sortFrequencies.add(num);
        }

        int[] solution = new int[k];

        for(int i = 0; i < k; i++){
            solution[i] = sortFrequencies.poll();
        }


        return solution; 
    }
}
