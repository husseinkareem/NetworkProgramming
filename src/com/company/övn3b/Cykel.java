package com.company.övn3b;

public class Cykel extends Fordon {

    private int antalVäxlar;
    private int växlarJustNu;

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxlarJustNu() {
        return växlarJustNu;
    }

    public void setVäxlarJustNu(int växlarJustNu) {
        this.växlarJustNu = växlarJustNu;
    }

    Cykel(int antalVäxlar, int växlarJustNu, int hastighet, int vikt) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växlarJustNu = växlarJustNu;
    }

    @Override
    public void printMe() {
        System.out.println("Cykel med hastighet"
                            +getHastighet()+ "km/h, vikt"
                            +getVikt()+ "kg, antalväxlar"
                            +antalVäxlar);
    }
}
