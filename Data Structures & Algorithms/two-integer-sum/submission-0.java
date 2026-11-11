class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> holder = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(holder.containsKey(complement)){
                return new int[]{holder.get(complement), i};
            }
            else{
                holder.put(nums[i],i);
            }
        }

        return new int[2];
        
    }
}
