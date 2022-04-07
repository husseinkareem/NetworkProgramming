package com.company.övn3d;

public class Bil extends Fordon {

    private int antalVäxlar;

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void setVäxelJustNu(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }

    private int växelJustNu;

    Bil(int antalVäxlar, int växelJustNu, int hastighet, int vikt) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public void växel(int nyväxel){
        int växel = nyväxel;
    }

    @Override
    public void printMe() {
        System.out.println("Bil med hastighet"+ getHastighet()+"Km/h"+ getVikt()+ "kg");
    }
}

