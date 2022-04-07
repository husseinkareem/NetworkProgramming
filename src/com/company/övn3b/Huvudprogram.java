package com.company.övn3b;

import java.util.List;
import java.util.ArrayList;

public class Huvudprogram {
        Bil bil = new Bil(20, 40, 70,60);
        Tåg tåg = new Tåg(10,50,1000);
        Cykel cykel = new Cykel(40,20,21,26);
        static List<Fordon> fordonsLista = new ArrayList<>();

    public static void main(String[] args) {
        Huvudprogram huvudprogram = new Huvudprogram();
        System.out.println(huvudprogram.bil.getVäxelJustNu());
        huvudprogram.bil.setVäxelJustNu(100);
        System.out.println(huvudprogram.bil.getVäxelJustNu());
        fordonsLista.add(huvudprogram.bil);
        fordonsLista.add(huvudprogram.cykel);
        fordonsLista.add(huvudprogram.tåg);

        for(int i = 0; i < 3; i++){
        System.out.println(huvudprogram.fordonsLista.get(i).getHastighet());      
        }
        for (Fordon fordonet: huvudprogram.fordonsLista) {
            fordonet.printMe();
        }
    }
}
