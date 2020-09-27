package HW7;

public class Test {


    public static void main(String[] args) {
//        Cat cat = new Cat("Мартин", 5);
//        Plate plate = new Plate(5);
//
//        plate.info();
//        cat.eat(plate);
//
//        plate.info();
//        plate.addFood(7);
//        plate.info();
//        cat.eat(plate);
//        plate.info();

        Cat[] arrayOfCats = new Cat[4];

        arrayOfCats[0] = new Cat("Матильда", 5);
        arrayOfCats[1] = new Cat("Рыжуля", 1);
        arrayOfCats[2] = new Cat("Лиза", 4);
        arrayOfCats[3] = new Cat("Тимоша", 4);

        Plate[] arrayOfPlates = new Plate[3];

        arrayOfPlates[0] = new Plate(3);
        arrayOfPlates[1] = new Plate(1);
        arrayOfPlates[2] = new Plate(9);

        int c = 0;
        int p = 0;

        while (c < arrayOfCats.length && p < arrayOfPlates.length) {
            while (!arrayOfCats[c].isFull() && p < arrayOfPlates.length) {
                arrayOfCats[c].eat(arrayOfPlates[p]);

                if (arrayOfPlates[p].getFood() == 0) {
                    p++;
                }
            }

            if (arrayOfCats[c].isFull()) {
                c++;
            }
        }

//        int c = 0;
//        int p = 0;
//
//        while (p < arrayOfPlates.length) {
//            if (arrayOfPlates[p].getFood() > arrayOfCats[c].getAppetite()) {
//                arrayOfPlates[p].decreaseFood(arrayOfCats[p].getAppetite());
//            }
//            else {
//                if (arrayOfPlates[p].getFood() <= arrayOfCats[c].getAppetite()) {
//                    int balance = (arrayOfCats[c].getAppetite() - arrayOfPlates[p].getFood());
//                    int leftOver = (arrayOfCats[c].getAppetite() - balance);
//                    arrayOfPlates[p].decreaseFood(leftOver);
//
//                    if (p + 1 < arrayOfPlates.length) {
//                        arrayOfPlates[p + 1].decreaseFood(balance);
//                    }
//                }
//                p++;
//            }
//            c++;
//        }

        for (Plate pl : arrayOfPlates) {
            pl.info();
        }

        for (Cat ct : arrayOfCats) {
            System.out.println(ct.isFull());
        }
    }
}
