package HW1;

public class Hw1_4 {
    public static void main(String[] args) {
        boolean inRange = amountInRange(-1, 22 );
        System.out.println(inRange);
    }

    public static boolean amountInRange(int a, int b) {
        int sum = a + b;
        return (sum >= 10) && (sum <= 20);

    }
}
