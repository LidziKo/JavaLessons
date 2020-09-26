package HW6;

public abstract class Animal {

    public Animal(int runningLimit, double jumpLimit, int swimLimit) {
        this.runningLimit = runningLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    int runningLimit;
    double jumpLimit;
    int swimLimit;

    public abstract boolean run(int runningDistance);
    public abstract boolean swim(int swimDistance);
    public abstract boolean jumpOver(double jumpDistance);


}