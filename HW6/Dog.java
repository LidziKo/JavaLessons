package HW6;

public class Dog extends Animal {


    public Dog(int runningLimit, double jumpLimit, int swimLimit) {
        super(runningLimit, jumpLimit, swimLimit);
    }

    @Override
    public boolean run(int runningDistance) {
        if (runningDistance <= runningLimit) {
            System.out.println("Собака пробежала " + runningDistance + " метров");
            return true;
        }
        System.out.println("Собака не может пробежать " + runningDistance + " метров");
        return false;
    }

    @Override
    public boolean jumpOver(double jumpDistance) {
        if (jumpDistance <= jumpLimit) {
            System.out.println("Собака прыгнула " + jumpDistance + " метров");
            return true;
        }
        System.out.println("Собака не может прыгнуть " + jumpDistance + " метров");
        return false;
    }


    @Override
    public boolean swim(int swimDistance) {
        if (swimDistance <= swimLimit) {
            System.out.println("Собака проплыла " + swimDistance + " метров");
            return true;
        }
        System.out.println("Собака не может проплыть " + swimDistance + " метров");
        return false;
    }



}