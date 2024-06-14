package org.sparta.spring240613.assign1;

import lombok.Getter;

@Getter
public class Car {

    private int carNumber;

    public Car(int carNumber) {
      this.carNumber = carNumber;
    }
}
