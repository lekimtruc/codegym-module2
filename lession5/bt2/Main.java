package lession5.bt2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
