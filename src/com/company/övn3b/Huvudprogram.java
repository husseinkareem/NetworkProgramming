package com.company.övn3b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Huvudprogram {
        Bil bil = new Bil(20, 40, 70,60);
        Tåg tåg = new Tåg(10,50,1000);
        Cykel cykel = new Cykel(40,20,21,26);
        List<Fordon> fordonsLista = new ArrayList<>();

    public static void main(String[] args) {
        Huvudprogram huvudprogram = new Huvudprogram();
        Collections.addAll(huvudprogram.fordonsLista, huvudprogram.bil, huvudprogram.cykel, huvudprogram.tåg);

        for (Fordon fordonet: huvudprogram.fordonsLista) {
            fordonet.printMe();
        }
    }
}
