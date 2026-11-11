class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        
        HashSet<Integer> holder = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            holder.add(nums[i]);
        }


        int longestStreak = 1;
        for(int num: holder){
            if(!holder.contains(num - 1)){
                int temp = num + 1;
                int currentStreak = 1;
                while(holder.contains(temp)){
                    currentStreak++;
                    if(currentStreak > longestStreak){
                        longestStreak = currentStreak;
                    }
                    temp++;
                }
            }
            else{
                continue;
            }
        }

        return longestStreak; 
    }
}
