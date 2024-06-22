package org.sparta.spring240519.assignment0531.as2;

public class Person {
    private final String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi unsu) {
        this.money -= 10000;
        unsu.income(10000);
    }

    public void showInfo() {
        System.out.println(this.name+"님의 남은 돈은"+this.money+"원 입니다." );
    }
}
