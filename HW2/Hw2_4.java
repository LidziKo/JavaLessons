package HW2;

import java.util.Arrays;

public class Hw2_4 {
    public static void main(String[] args) {
        int arraySize = 9;
        int[][] twoDimensionalArray = new int [arraySize][arraySize];
        int i = 0;
        int j = arraySize - 1;


        while (i < twoDimensionalArray.length){
            twoDimensionalArray[i][i] = 1;
            twoDimensionalArray[i][j] =  1;
            i += 1;
            j -= 1;
        }
        for (int[] ints : twoDimensionalArray) {
            System.out.println(Arrays.toString(ints));
        }


    }
}
