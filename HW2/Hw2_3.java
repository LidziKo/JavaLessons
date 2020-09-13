package HW2;

import java.util.Arrays;

public class Hw2_3 {
    public static void main(String[] args) {
        int[] ourArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i = 0;

        while (i < ourArray.length){
            if (ourArray[i] < 6){
                ourArray[i] *= 2;
            }
            i++;
        }
        System.out.println(Arrays.toString(ourArray));
    }
}
