package HW6;

public class Cat extends Animal {


    public Cat(int runningLimit, int swimLimit) {
        super(runningLimit, 0, swimLimit);
    }

    @Override
    public boolean run(int runningDistance) {
        if (runningDistance <= runningLimit) {
            System.out.println("Кошка пробежала " + runningDistance + " метров");
            return true;
        }
        System.out.println("Кошка не может пробежать " + runningDistance + " метров");
        return false;
    }

    @Override
    public boolean swim(int swimDistance) {
        System.out.println("Кошка не умеет плавать :(");
        return false;
    }

    @Override
    public boolean jumpOver (double swimDistance){
        if (swimDistance <= swimLimit) {
            System.out.println("Кошка проплыла " + swimDistance + " метров");
            return true;
        }
        System.out.println("Кошка не может проплыть " + swimDistance + " метров");
        return false;
    }

}
