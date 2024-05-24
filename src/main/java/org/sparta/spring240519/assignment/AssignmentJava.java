package org.sparta.spring240519.assignment;

import java.util.HashMap;
import java.util.Map;



public class AssignmentJava {
    public static void main(String[] args) {

        Order o = new Order("20201102003","01023450001", "서울시 강남구 역삼동 111-333", "20201102","130258", "35000", "0003");
        System.out.println(o.showOrderInfo());

        People people = new People(180,78,"남성","Tomas",37);
        System.out.println(people.showPeopleInfo());

    }}

class Order {
    private String rn;
    private String pn;
    private String a;
    private String d;
    private String t;
    private String p;
    private String mn;


    public Order(String rn, String pn, String a, String d, String t, String p, String mn) {
        this.rn = rn;
        this.pn = pn;
        this.a = a;
        this.d = d;
        this.t = t;
        this.p = p;
        this.mn = mn;
    }

    public String showOrderInfo(){
        StringBuilder sb = new StringBuilder();
        Map<String,String> map = new HashMap<>();
        map.put("주문 접수번호:", this.rn);
        map.put("주문 핸드폰 번호 :", this.pn);
        map.put("주문 집 주소 :", this.a);
        map.put("주문 날짜 :", this.d);
        map.put("주문 시간 :", this.t);
        map.put("주문 가격 :", this.p);
        map.put("메뉴 번호 ", this.mn);

        map.entrySet().forEach(entry-> sb.append(entry.getKey()).append(":").append(entry.getValue()).append("\n")); // 이게 인텔리제이가 추천해준거고

        map.entrySet().forEach(entry->sb.append(entry.getKey()+":"+entry.getValue()+"\n")); //이게 제가 쓴건데 무슨 차이가 있는건지 궁금합니다.

        return sb.toString();
    }
}

class People{
    private int h;
    private int w;
    private String g;
    private String n;
    private int a;

    public People(int h, int w, String g, String n, int a) {
        this.h = h;
        this.w = w;
        this.g = g;
        this.n = n;
        this.a = a;
    }

    public String showPeopleInfo(){
        return "키가 "+h+"이고 몸무게가 "+w+"킬로인 남성이 있습니다. 이름은 "+n+"이고 나이는 "+ a+"세입니다";
    }
}


