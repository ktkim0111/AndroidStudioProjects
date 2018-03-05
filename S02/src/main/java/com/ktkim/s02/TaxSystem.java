package com.ktkim.s02;

public class TaxSystem {
    public static void main(String[] args) {
        Car sonata = new HyundaiSonata("20140101", 1000);
        TaxImposable impala = new ChevroletImpala("20140102", 1500);
        TaxImposable cayenne = new PorscheCayenne("20140103", 2000);
        TaxImposable r8 = new AudiR8((5000));

        System.out.println("현대 쏘나타 과세코드" + sonata.getTaxCode());
        System.out.println("쉐보레 임팔라 과세코드" + impala.getTaxCode());
        System.out.println("포르셰 카이엔 과세코드" + cayenne.getTaxCode());
        System.out.println("아우디 R8 과세코드" + r8.getTaxCode());
        System.out.println("아우디 R8 가격" + r8.getPrice());


        //sonata.getBirthDate 는 안됨 TaxImposable 타입이기때문에
        //타입을 Car로 해주면 getBirthDate 호출 가능
    }
}
