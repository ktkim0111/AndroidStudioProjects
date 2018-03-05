package com.ktkim.s02;

import javax.swing.undo.AbstractUndoableEdit;

public class Inheritance {
    public static void main(String[] args) {
        HyundaiSonata sonata = new HyundaiSonata("20140102", 1000);
        ChevroletImpala impala = new ChevroletImpala("20140102", 1500);
        PorscheCayenne cayenne = new PorscheCayenne("20140103", 2000);
        AudiR8 r8 = new AudiR8("20140104", 5000);

        System.out.println("쏘나타 가격: " + sonata.getPrice());
        System.out.println("임팔라 가격: " + impala.getPrice());
        System.out.println("카이엔 가격: " + cayenne.getPrice());
        System.out.println("R8 가격" + r8.getPrice());
    }
}
