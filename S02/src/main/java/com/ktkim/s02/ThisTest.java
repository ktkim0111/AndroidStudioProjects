package com.ktkim.s02;

public class ThisTest {
    public static void main(String[] args) {
        ThisTest obj = new ThisTest();

        System.out.println(obj);
        //System.out.println(this); 인스턴스 메서드가 아니기때문에 오류 main은 static메서드
        //static매서드는 기준이 되는 인스턴스가 없다.
        obj.printThis();
    }

    void printThis()
    {
        System.out.println(this);
    }
}
