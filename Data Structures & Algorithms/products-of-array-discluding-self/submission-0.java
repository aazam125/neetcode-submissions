class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] solution = new int[nums.length];

        int sum = 1;

        for(int i = 0; i < nums.length; i++){
            solution[i] = sum;
            sum*=nums[i];
        }

        sum = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            solution[i]*=sum;
            sum*=nums[i];
        }

        return solution; 
        
    }
}  
