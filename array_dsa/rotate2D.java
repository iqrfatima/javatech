package array_dsa;

import java.util.Arrays;

public class rotate2D {
    public static int[][] rotate(int[][] matrix) {
        int len = matrix.length-1;
        int i=0,j=0;
        while(i!=j && i!=len){
            if(i==0){
                matrix[j][i+2] = matrix[i][j];
                j++;
            }
            if(i==1){
                matrix[j][i+1] = matrix[i][j];
                j++;
            }
            if(i==2){
                matrix[j][i] = matrix[i][j];
                j++;
            }

        }
        return matrix;
        // System.out.println(matrix.toString());
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(rotate(arr)));
    }
}   

