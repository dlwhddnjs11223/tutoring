package org.sparta.spring240519.assignment0531.as2;

public class TaxiTest {
    public static void main(String[] args) {
        Student studentE = new Student("Edward",20000);
        Taxi unsu = new Taxi("잘나간다 운수");
        studentE.takeTaxi(unsu);
        studentE.showInfo();
        unsu.showTaxiInfo();
    }
}
