package javaThreads;

import java.util.ArrayList;

public class Race {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("VR6", 220));
        cars.add(new Car("X5m", 250));
        cars.add(new Car("WRX",240));
        ArrayList<Thread> carThreads = new ArrayList<>();
    }
}
