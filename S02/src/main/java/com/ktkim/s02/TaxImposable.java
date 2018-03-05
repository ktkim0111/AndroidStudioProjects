package com.ktkim.s02;

public interface TaxImposable {
    public static int CODE_APT = 1;
    public static int CODE_CAR = 2;

    public int getTaxCode();

    public  int getPrice();
}
