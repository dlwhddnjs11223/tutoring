package org.sparta.spring240613.assign1;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getInstance();

        Car mySonata = carFactory.createCar();
        Car yourSonata = carFactory.createCar();

        System.out.println(mySonata.getCarNumber());
        System.out.println(yourSonata.getCarNumber());
    }
}
