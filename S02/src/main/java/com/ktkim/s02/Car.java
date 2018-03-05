package com.ktkim.s02;

//자동차
public class Car implements TaxImposable {
    String birthDate;
    int price;

    Car() {
        birthDate = "unknown";
    }

    Car(int _price) {
        this();
        price = _price;
    }

    Car(String _birthDate, int _price)
    {
        birthDate = _birthDate;
        price = _price;
    }

    String getBirthDate(){
        return  birthDate;
    }
    public int getPrice(){
        return  price;
    }

    public int getTaxCode()
    {
        return TaxImposable.CODE_CAR;
    }
}

//현대 소나타
class HyundaiSonata extends Car{
    HyundaiSonata(String _birthDate, int _price){
        super(_birthDate, _price);
    }
}

//쉐보레 임팔라
class ChevroletImpala extends Car
{
    ChevroletImpala(String _birthDate, int _price)
    {
        super(_birthDate, _price);
    }
}

//포르쉐 카이엔
class PorscheCayenne extends Car
{
    PorscheCayenne(String _birthDate, int _price)
    {
        super(_birthDate, _price);
    }
}

//아우디 R8
class AudiR8 extends  Car
{
    AudiR8(int _price)
    {
        //super();
        //price = _price;
        super(_price);
    }
    AudiR8(String _birthDate, int _price)
    {
        super(_birthDate, _price);
    }
}