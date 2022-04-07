package com.company.Scanner;

import java.util.Scanner;

public class Bensin {
    private double mil;
    private double bensin;
    private double forbrukning;

    Scanner sc = new Scanner(System.in);

    public void setMil(double mil) {
        this.mil = mil;
    }

    public void setBensin(double bensin) {
        this.bensin = bensin;
    }

    public void setForbrukning(double forbrukning) {
        this.forbrukning = forbrukning;
    }

    public double getForbrukning() {
        return forbrukning;
    }

    public double getMil() {
        return mil;
    }

    public double getBensin() {
        return bensin;
    }

    public double getData(String message){
        System.out.println(message);
        return sc.nextDouble();
    }
    public void berknaForbrukning(){
        setMil(getData("Ange antal mil: "));
        setBensin(getData("Ange antal liter: "));
        setForbrukning((getBensin() / getMil()));
        System.out.println(getForbrukning());
    }
    public static void main(String[] args) {
        Bensin b = new Bensin();
        b.berknaForbrukning();
    }
}
