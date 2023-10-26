package pl.codemiry.sptest;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private final List<Car> carList;

    public CarService() {
        Car car1 = new Car("BMW", "18");
        Car car2 = new Car("Fiat", "126p");
        Car car3 = new Car("Polonez", "Caro");
        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    public void showCar() {
        carList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.showCar();
    }
}
