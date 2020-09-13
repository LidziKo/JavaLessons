package HW1;

public class Hw1_3 {
    public static void main(String[] args) {
        double mathCalc = methodCalculation(15, 8, 34, 7);
        System.out.println(mathCalc);
    }

    public static double methodCalculation(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
}