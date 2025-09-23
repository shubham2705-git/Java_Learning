package ArrayMediumLevel;

import java.util.Arrays;

public class RotateMatrixBy90Degree {
    public static int[][] rotateImage(int[][] matrix){
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[j][n-1-i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix =  {{1,2,3},{4,5,6},{7,8,9}};
        int ans[][] = rotateImage(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
}
