package HW2;

import java.util.Arrays;

public class Hw2_1 {
    public static void main(String[] args) {
        int[] newArray = {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1};

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
