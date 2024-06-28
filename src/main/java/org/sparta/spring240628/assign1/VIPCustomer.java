package org.sparta.spring240628.assign1;

import lombok.Getter;

@Getter
public class VIPCustomer extends Customer {
    private int csNum;

    public VIPCustomer(int num, String name, int csNum) {
      super(num, name);
      this.csNum=csNum;
      super.setGrade(GradeEnum.VIP);
    }


    @Override
    public int calcPrice(int price) {
        super.bonusPoint += (int) (price*0.05);
        return (int) (price*0.8);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + this.csNum + "입니다";
    }
}
