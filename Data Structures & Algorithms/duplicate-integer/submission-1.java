class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> holder = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (holder.contains(nums[i])) {
                return true;
            }

            holder.add(nums[i]);
        }

        return false;
    }
}