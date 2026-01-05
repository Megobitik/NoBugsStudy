package org.example;

public class Methods {
    public static void main(String[] args){
        int useFindMax = findMax(8,5);
        System.out.println(useFindMax + " максимум");
        int useDifference = difference(3,4);
        System.out.println(useDifference + " разница");
        int useSquareArea = squareArea(5);
        System.out.println(useSquareArea + " площадь");
        int useSquarePerimeter = squarePerimeter(4);
        System.out.println(useSquarePerimeter + " периметр");
        double useConvertSecondsToMinutes = convertSecondsToMinutes(10);
        System.out.println(useConvertSecondsToMinutes + " конвертация");
        double useAverageSpeed = averageSpeed(10,5);
        System.out.println(useAverageSpeed + " средняя скорость");
        double useFindHypotenuse = findHypotenuse(0,4);
        System.out.println(useFindHypotenuse + " гипотенуза");
        double useCircleCircumference = circleCircumference(5);
        System.out.println(useCircleCircumference + " длина окружности");
        double useCalculatePercentage = calculatePercentage(100,2);
        System.out.println(useCalculatePercentage + " вычисление процентов");
        double useCelsiusToFahrenheit = celsiusToFahrenheit(50);
        System.out.println(useCelsiusToFahrenheit + "перевод в Фаренгейт");
        double useFahrenheitToCelsius = fahrenheitToCelsius(100);
        System.out.println(useFahrenheitToCelsius + " перевод в Цельсий");
     }
    //Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
    public static int findMax(int x, int y){
        return Math.max(x,y);
        }
    //Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел
    public static int difference(int x, int y){
        return Math.abs(x - y);
    }
    // squareArea(int side) — возвращает площадь квадрата
    public static int squareArea (int side){
        return side * side;
    }
    // squarePerimeter(int side) — возвращает периметр
    public static int squarePerimeter(int side){
        return 4 * side;
    }
    //Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных)
    public static double convertSecondsToMinutes(int second){
        return (double) second / 60;
    }
    // Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
    public static double averageSpeed (double distance, double time){
        if (time == 0) {
            System.out.println("на ноль не делим");
            return 0;
        }
        else {
            return  distance/time;
        }
    }
    // Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
    //√(a² + b²)
    public static double findHypotenuse(double a, double b){
        if (a == 0 || b == 0){
            return 0.0;
        }
        else {
            return Math.sqrt((a*a)+(b*b));
        }
    }
    // Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
    public static double circleCircumference(double radius) {
        if (radius == 0) {
            System.out.println("Нулевой радиус");
            return 0;
        }
        else {
            return 2 * Math.PI * radius;
        }
    }
    //Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
    public static double calculatePercentage(double total, double part){
        if (total == 0){
            System.out.println("Будет ошибка");
            return 0;
        }
        else {
            return (part / total) * 100;
        }
    }
    //celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }
    //fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
}
