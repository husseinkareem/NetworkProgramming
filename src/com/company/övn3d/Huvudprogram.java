package com.company.övn3d;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Huvudprogram {
        Bil bil = new Bil(20, 40, 70,60);
        Tåg tåg = new Tåg(10,50,1000);
        Cykel cykel = new Cykel(40,20,21,26);
        List<IPrintable> fordonsLista = new ArrayList<>();

    public static void main(String[] args) {
        Huvudprogram huvudprogram = new Huvudprogram();
        Collections.addAll(huvudprogram.fordonsLista, huvudprogram.bil, huvudprogram.cykel, huvudprogram.tåg);

        for (IPrintable fordonet: huvudprogram.fordonsLista) {
            fordonet.printMe();
        }
    }
}
