class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal = 0;
        int maxArea = 0;
        for (int[] d : dimensions) {
            int length = d[0];
            int width = d[1];

            double maxDiagonal = Math.sqrt(length * length + width * width);
            int area=length*width;

            if(diagonal < maxDiagonal){
                diagonal=maxDiagonal;
                maxArea=area;
            }
            else if(diagonal == maxDiagonal){
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}
