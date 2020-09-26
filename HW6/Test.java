package HW6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(200,2);
        Dog dog1 = new Dog(500, 0.5, 10);
        Dog dog2 = new Dog(700, 1.1, 30);

        cat.run(1200);
        cat.swim(0);
        cat.jumpOver(120);

        dog1.run(300);
        dog1.jumpOver(1.9);
        dog1.swim(7);

        dog2.run(750);
        dog2.jumpOver(0.3);
        dog2.swim(35);
    }
}
