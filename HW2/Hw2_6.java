package HW2;

public class Hw2_6 {
    public static void main(String[] args) {
        int[] ourArray = {0, 5, 3, 2, 1};
        System.out.println(hasEqualSumParts(ourArray));

        ourArray[4] = 0;
        System.out.println(hasEqualSumParts(ourArray));
    }

    public static boolean hasEqualSumParts(int[] arr) {
        int leftSum = arr[0];
        int sumArray = 0;

        for (int j : arr) {
            sumArray = sumArray + j;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            int rightSum = sumArray - leftSum;
            if (leftSum == rightSum){
                return true;
            }
            else{
                leftSum += arr[i];
            }
        }

        return false;
    }
}
