class Solution {
    public int trap(int[] height) {
        

        int[] largestLeftContainer = new int[height.length];
        int largestLeft = 0;

        for(int i = 0; i < height.length; i++){ 
            if(i == 0){
                largestLeft = height[i];
                largestLeftContainer[0] = largestLeft;
            }
            else{
                largestLeftContainer[i] = largestLeft;
                if(height[i] > largestLeft){
                    largestLeft = height[i];
                }
            }
        }

        int[] largestRightContainer = new int[height.length];
        int largestRight = 0 ;

        for(int i = height.length - 1 ; i >= 0; i--){ 
            if(i == height.length - 1){
                largestRight= height[i];
                largestRightContainer[height.length -1] = largestRight;
            }
            else{
                largestRightContainer[i] = largestRight;
                if(height[i] > largestRight){
                    largestRight = height[i];
                }
            }
        }

        int solution = 0; 

        for(int i = 0; i < height.length; i++){

            int leftHeight = largestLeftContainer[i];
            int rightHeight = largestRightContainer[i];
            int barHeight = height[i];

            int waterTrapped = Math.min(leftHeight,rightHeight) - barHeight; 

            if(waterTrapped > 0){
                solution+=waterTrapped;
            }

        }

        return solution; 

        
    }
}
