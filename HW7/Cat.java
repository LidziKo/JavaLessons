package HW7;

public class Cat {

    protected final String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        System.out.println(name + " ест");
        if (plate.getFood() >= appetite) {
            doEat(plate);
            appetite = 0;
        } else {
            appetite -= plate.getFood();
            plate.decreaseFood(plate.getFood());
        }
    }

    public boolean isFull() {
        return appetite == 0;
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }
}
