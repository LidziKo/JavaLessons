package HW2;

public class Hw2_5 {
    public static void main(String[] args) {
        int[] newArray = {20, 1, 45, 17, 98, 1129, 92, 20, 88, 71, -8, 154};
        int maxVal = 0;
        int minVal = newArray[0];

        for (int i = 0; i < newArray.length; i++) {
            if (maxVal < newArray[i]) {
                maxVal = newArray[i];
            } else if (minVal > newArray[i]) {
                minVal = newArray[i];
            }
        }
        System.out.println("самое большое число в массиве - это: " + maxVal);
        System.out.println("самое маленькое число в массиве - это: " + minVal);
    }
}