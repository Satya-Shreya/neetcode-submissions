class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int colStart=0;
        int rows=matrix.length;
        int cols=matrix[0].length;

        for(int i=0;i<rows;){
            int currentValue=matrix[i][colStart];
            if(currentValue==target) return true;
            if(currentValue<target && matrix[i][cols-1]>=target){
                colStart++;
            }
            else{
                i++;
                colStart=0;
            }
        }

        return false;
    }
}
