package com.company;

public class Bil extends Fordon{

    protected int antalVäxlar;
    protected int växelJustNu;

    Bil(int antalVäxlar, int växelJustNu, int hastighet, int vikt) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }
    public void växel(int nyväxel){
        int växel = nyväxel;
    }
}
