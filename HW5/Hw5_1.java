package HW5;

public class Hw5_1 {
    public static void main(String[] args) {

        int reqAge = 40;

        Staff[] arrayOfEmps = new Staff[7];

        arrayOfEmps[0] = new Staff("Ivan P.", "QA", "sample@example.com", "1234", 1000, 32);
        arrayOfEmps[1] = new Staff("Sarah O.", "Sales", "sample@example.com", "5678", 1100, 43);
        arrayOfEmps[2] = new Staff("Igor B.", "Dev", "sample@example.com", "9012", 1500, 21);
        arrayOfEmps[3] = new Staff("Anna K.", "HR", "sample@example.com", "3456", 900, 56);
        arrayOfEmps[4] = new Staff("Sarah B.", "Admin", "sample@example.com", "7890", 800, 28);
        arrayOfEmps[5] = new Staff("Petr I.", "BA", "sample@example.com", "2143", 1200, 16);
        arrayOfEmps[6] = new Staff("Kate V.D.", "PM", "sample@example.com", "6587", 1300, 40);


        for (Staff employee : arrayOfEmps) {
            if (employee.age >= reqAge) {
                employee.printInfo();
            }
        }
    }

}
