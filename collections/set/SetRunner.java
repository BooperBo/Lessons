package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetRunner {

    public static void main(String[] args) {

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf", 45));
        sixCars.add(new Car("Audi", "AJ", 60));
        sixCars.add(new Car("VW", "Golf", 25));
        sixCars.add(new Car("BMW", "24", 120));
        sixCars.add(new Car("BMW", "4401", 200));

        Set<Car> europeCars = new HashSet<>();
        europeCars.add(new Car("Toyota", "Auris", 40));
        europeCars.add(new Car("Reno", "Clio", 30));
        europeCars.add(new Car("Reno", "Megan", 50));
        europeCars.add(new Car("VW", "Golf", 45));
        europeCars.add(new Car("Vw", "Polo", 35));

        Set<Car> uniqueCars = new HashSet<>(sixCars);
        uniqueCars.addAll(europeCars);

        print(uniqueCars);
    }

    private static void print(Set<Car> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per day");
        for (Car car : cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }


}
