package org.sparta.spring240613.assign1;

public class CarFactory {

    private static CarFactory carFactory;
    private int carNumber = 10000; //int가 원래 표현할수 있는 숫자 범위가 제한돼있는거 아닌가?


    private CarFactory () {

    }

    public static CarFactory getInstance(){
       if(carFactory==null){
           carFactory = new CarFactory();
       }

        return carFactory;
    }

    public Car createCar() {
        this.carNumber++;
        Car car = new Car(carNumber);
        return car;
    }

}
