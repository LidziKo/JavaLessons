package HW1;

public class Hw1_5 {
    public static void main(String[] args){
        int number = 0;
        positiveOrNegative(number);
    }
    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("число " + a + " положительное");
        }
        else {
            System.out.println("число " + a + " отрицательное");
        }
    }
}
