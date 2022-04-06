package com.company;

public class Fordon {
    protected int hastighet;
    protected int vikt;

    public void ändrahasighet(int nyHastighet){
        hastighet=nyHastighet;
    }

    public Fordon(){}

    public Fordon(int hastighet, int vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }
}
