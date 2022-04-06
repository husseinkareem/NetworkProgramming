package com.company.övn3b;

public class Tåg extends Fordon {

    protected int antalVagnar;

    Tåg(int antalVagnar, int hastighet, int vikt) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }
    public void kopplaVagn(int kopplaNyVagn){
        int kopplaVagn=kopplaNyVagn;
    }
}
