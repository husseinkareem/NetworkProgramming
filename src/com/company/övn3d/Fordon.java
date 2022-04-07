package com.company.övn3d;

public abstract class Fordon implements IPrintable{

    private int hastighet;
    private int vikt;

    public void ändrahasighet(int nyHastighet){
        hastighet=nyHastighet;
    }

    public Fordon(){}

    public Fordon(int hastighet, int vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }
    public int getHastighet(){
        return hastighet;
    }
    public int getVikt(){
        return vikt;
    }
    abstract public void printMe();

}

