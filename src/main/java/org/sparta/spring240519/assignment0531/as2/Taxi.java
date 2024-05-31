package org.sparta.spring240519.assignment0531.as2;

public class Taxi {
    private final String name;
    private int income;

    public Taxi(String name) {
        this.name = name;
    }

    public void showTaxiInfo() {
        System.out.println("잘 간다 운수택시 수입은"+this.income+"원 입니다.");
    }

    public void income(int i) {
        this.income = i;
    }
}
