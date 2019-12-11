package lv.jg.homeWork.Cars;

import java.util.Arrays;

public class CarsPark {

    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("BMW", "Black", 4);
        Truck truck = new Truck("Ford", "White", 2);
        Bus bus = new Bus("Solaris", "Blue", 40);

        Cars[] myCars = {passengerCar, truck, bus};
        for (Cars cars : myCars){
            System.out.println(cars);
        }
        Arrays.stream(myCars).forEach(shape-> System.out.println(shape));
        Arrays.stream(myCars).forEach(System.out::println);

    }
}
