package com.company.övn3d;

public class Båt extends Fordon {

    private int dödVikt;

    Båt(int dödVikt, int hastighet, int vikt) {
        super(hastighet, vikt);
        this.dödVikt=dödVikt;
    }

    public int getDödVikt() {
        return dödVikt;
    }

    public void setDödVikt(int dödVikt) {
        this.dödVikt = dödVikt;
    }

    public void sväng(int nyasvängar){
        int sväng=nyasvängar;
    }

    @Override
    public void printMe() {
        System.out.println("Dödvikt: "+ dödVikt);
    }
}
