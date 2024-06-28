package org.sparta.spring240628.assign1;

public class Customer {

    private final int num;
    private final String name;
    public int bonusPoint;
    private GradeEnum grade = GradeEnum.SILVER;

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }

    public Customer(int num, String name) {
        this.name = name;
        this.num = num;
    }

    public String getCustomerName() {
        return this.name;
    }

    public int calcPrice(int price) {
        this.bonusPoint += (int) (price*0.01);
        return price;
    }

    public String showCustomerInfo() {
        return this.name + " 님의 등급은 " + this.grade + "이며, 보너스 포인트는 "+ this.bonusPoint +"입니다.";
    }



}
