package org.sparta.spring240613.assign1;

import lombok.Getter;

@Getter
public class Car {
    private static int Num = 10000;
    private int carNumber;

    public Car() {
        this.carNumber = Num++;
    }
}
