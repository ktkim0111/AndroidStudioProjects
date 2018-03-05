package com.ktkim.s03;

public class Car2 implements TaxImposable {
    String birthDate = "20150914";
    String serialNumber;

    String getBirthDate() {
        return birthDate;
    }

    String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public int getTaxCode() {
        return TaxImposable.CODE_CAR;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

class FerrariEnzo extends Car2 {
    FerrariEnzo(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

class BMW730d extends Car2 {
    BMW730d(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    String getSerialNumber() {
        System.out.println(" ::: BMW 의 일련번호를 얻어갔습니다.");
        return super.getSerialNumber();
    }
}

class BentleyGT extends Car2 {
    BentleyGT(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    String getSerialNumber() {
        return serialNumber + "*" + birthDate;
    }
}



