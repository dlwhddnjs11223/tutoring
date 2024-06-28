package org.sparta.spring240628.assign1;

public class GoldCustomer  extends Customer{

    public GoldCustomer(int num, String name) {
       super(num, name);
       super.setGrade(GradeEnum.GOLD);
    }

    @Override
    public int calcPrice(int price) {
        super.bonusPoint += (int) (price*0.02);
        return (int) (price*0.9);

    }


}
