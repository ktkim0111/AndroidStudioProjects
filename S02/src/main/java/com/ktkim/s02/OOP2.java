package com.ktkim.s02;

class  SinsaApt2{
    int floorCount;
    int parkingLotCount01;
    int parkingLotCount02;
    int elevatorCount;

    int  getFloorCount(){
        return  parkingLotCount01 + parkingLotCount02;
    }
}

public class OOP2 {
    public static void main(String[] args) {
        SinsaApt2 apt2001 = new SinsaApt2();
        apt2001.floorCount = 20;
        apt2001.parkingLotCount01 = 15;
        apt2001.parkingLotCount02 = 20;
        apt2001.elevatorCount = 1;

        System.out.println("2001동의 총 주차대수: " + apt2001.getFloorCount());
    }
}
