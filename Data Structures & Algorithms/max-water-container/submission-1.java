class Solution {
    public int maxArea(int[] heights) {

        int i = 0;
        int j = heights.length - 1;

        int solution = 0;

        while (i < j) {

            int temp = Math.min(heights[i], heights[j]) * (j - i);

            if (temp > solution) {
                solution = temp;
            }

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return solution; 
    }

}
