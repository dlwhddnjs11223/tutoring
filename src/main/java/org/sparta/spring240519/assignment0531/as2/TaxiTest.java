package org.sparta.spring240519.assignment0531.as2;

public class TaxiTest {
    public static void main(String[] args) {
        Person personE = new Person("Edward",20000);
        Taxi unsu = new Taxi("잘나간다 운수");
        personE.takeTaxi(unsu);
        personE.showInfo();
        unsu.showTaxiInfo();
    }
}
