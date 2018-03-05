package com.ktkim.s03;

/**
 * Fast Campus
 * Java for Start (by mindwing)
 * [3일차] 강의노트 - 상속, 인터페이스
 * 예제 - 형변환
 */
public class Casting {
    public static void main(String[] args) {
        FerrariEnzo enzo = new FerrariEnzo("enzo-1");

        // 묵시적 형변환
        Object object = enzo;

        // 묵시적 형변환
        TaxImposable tax1 = enzo;

        // 명시적 형변환
        Car2 car = (Car2) object;

        // 명시적 형변환
        FerrariEnzo cayenne2 = (FerrariEnzo) car;

        System.out.println(enzo == cayenne2);

        // 묵시적 형변환
        TaxImposable tax2 = car;

        // 기본형 데이터간의 묵시적, 명시적 형변환
        int i = 1000;
        double d = i;
        int i2 = (int)d;

        // boolean 형 변수는 다른 타입으로 형변환되지 않습니다.
        boolean b = true;

        // 컴파일 에러
//        int i3 = (int)b;

    }
}
