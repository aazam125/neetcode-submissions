class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> solution = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> temp = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));

                    solution.add(temp);

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (k > j && nums[k] == nums[k + 1]) {
                        k--;
                    }

                }

                else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }

        return solution;
        
    }
}
