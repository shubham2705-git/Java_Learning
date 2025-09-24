package ArrayMediumLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,right=m-1;
        int top=0,bottom=n-1;
        int total=n*m;
        int count=0;
        List<Integer> ans=new ArrayList<>();


        while (count < total) {
            for (int i = left; i <= right && count < total; i++) {
                ans.add(matrix[top][i]);
                count++;
            }
            top++;

            for (int i = top; i <= bottom && count < total; i++) {
                ans.add(matrix[i][right]);
                count++;
            }
            right--;

            for (int i = right; i >= left && count < total; i--) {
                ans.add(matrix[bottom][i]);
                count++;
            }
            bottom--;

            for (int i = bottom; i >= top && count < total; i--) {
                ans.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
