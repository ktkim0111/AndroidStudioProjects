package com.ktkim.s03;

/**
 * Fast Campus
 * Java for Start (by mindwing)
 * [3일차] 강의노트 - 메서드 오버라이딩
 * 예제 - 메서드 오버라이딩
 */
public class Overriding {
    public static void main(String[] args) {
        FerrariEnzo ferrari = new FerrariEnzo("enzo-1");
        BMW730d bmw = new BMW730d("730d-1");
        BentleyGT bentley = new BentleyGT("continental-1");

        System.out.println(ferrari.getSerialNumber());
        System.out.println(bmw.getSerialNumber());
        System.out.println(bentley.getSerialNumber());
    }
}
