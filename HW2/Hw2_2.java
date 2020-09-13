package HW2;

import java.util.Arrays;

public class Hw2_2 {
    public static void main(String[] args) {
        int arraySize = 8;
        int[] newArray = new int[arraySize];
        int step = 0;

        for (int i = 0; i < arraySize; i++) {
            newArray[i] = step;
            step += 3;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
