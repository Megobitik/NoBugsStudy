package Objects;

public class Main {
    public static void main(String[] args){
        Car bmw = new Car("BMW", 2009);
        bmw.print();
        bmw.setYear(2100);
        bmw.print();

        Rectangle rectangle = new Rectangle(3,5);
        rectangle.print();
        rectangle.setWidth(10);
        rectangle.print();

        Book warAndPeace = new Book("War and Peace", "Tolstoy");
        warAndPeace.printInfo();
        warAndPeace.setAuthor("Dostoevski");
        warAndPeace.printInfo();

        BankAccount bankAccount = new BankAccount("Alex", 1000);
        bankAccount.printBalance();
        bankAccount.deposit(50);
        bankAccount.printBalance();
        bankAccount.withdraw(10000);
        bankAccount.printBalance();

        Point newPoint = new Point(1,3);
        newPoint.print();
        newPoint.setX(4);
        newPoint.print();

        StudentGroup studentGroup = new StudentGroup("школоло", 10);
        studentGroup.printinfo();
        studentGroup.setStudentCount(999);
        studentGroup.printinfo();

        Circle circle= new Circle(3);
        circle.print();
        circle.setRadius(6);
        circle.print();

        Teacher teacher = new Teacher("Mat", "math");
        teacher.setSubject("Rus");
        teacher.printInfo();

        Product product = new Product("bread",100);
        product.setPrice(150);
        product.printInfo();
        product.applyDiscount(30);
        product.printInfo();

        Laptop laptop = new Laptop("Lenua", 24);
        laptop.setPrice(13);
        laptop.printInfo();
    }
}
