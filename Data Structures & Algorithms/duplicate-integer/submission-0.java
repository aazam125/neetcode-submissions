
class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet holder = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!holder.add(nums[i])){
                return true;
            }
            else{
                holder.add(nums[i]);
            }
        }

        return false;
    }
}