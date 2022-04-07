package com.company.övn3b;

public class Tåg extends Fordon {

    private int antalVagnar;

    Tåg(int antalVagnar, int hastighet, int vikt) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    @Override
    public void printMe() {
        System.out.println("Tågets hastighet" +
                +getHastighet()+ "Km/h, vikt"
                +getVikt()+ "Kg, antalvagnar: "
                + antalVagnar);
    }
}
