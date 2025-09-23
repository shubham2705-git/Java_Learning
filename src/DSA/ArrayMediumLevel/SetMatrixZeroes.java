package ArrayMediumLevel;

import java.util.Arrays;

public class SetMatrixZeroes {
    int setMatrixZeroes(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
    }
    public static void main(String[] args) {
        int[][] arr= {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,0}};
        int[][] result = setMatrixZeroes(arr);
        System.out.println(Arrays.toString(result));
    }
}
