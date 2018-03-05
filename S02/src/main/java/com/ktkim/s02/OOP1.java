package com.ktkim.s02;

class SinsaApt1{
    int floorCount;
    int parkingLotCount;
    int elevatorCount;
}

public class OOP1 {
    public static void main(String[] args) {
        int sumOfFloor;
        SinsaApt1 apt1001 = new SinsaApt1();
        apt1001.floorCount = 20;
        apt1001.parkingLotCount = 25;
        apt1001.elevatorCount = 1;

        SinsaApt1 apt1002 = new SinsaApt1();
        apt1002.floorCount = 25;
        apt1002.parkingLotCount = 35;
        apt1002.elevatorCount = 1;

        sumOfFloor = apt1001.floorCount + apt1002.floorCount;

        System.out.println("1001동의 층수: " + apt1001.floorCount);
        System.out.println("1002동의 층수: " + apt1002.floorCount);
        System.out.println("1001동과 1002동 층수의 합계: " + sumOfFloor);
    }
}
