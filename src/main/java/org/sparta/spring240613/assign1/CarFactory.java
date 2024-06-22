package org.sparta.spring240613.assign1;

public class CarFactory {

    private static CarFactory carFactory;



    private CarFactory () {

    }

    public static CarFactory getInstance(){
       if(carFactory==null){
           carFactory = new CarFactory();
       }

        return carFactory;
    }

    public Car createCar() {

        Car car = new Car();
        return car;
    }

}
