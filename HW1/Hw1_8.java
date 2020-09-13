package HW1;

public class hw1_8 {
    public static void main(String[] args){
        int year = 404;
        isItLeap(year);
    }
    public static void isItLeap (int a){
        if ((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0)){
            System.out.println(a + " является високосным годом");
        }
        else {
            System.out.println(a + " является невисокосным годом");
        }
    }
}
