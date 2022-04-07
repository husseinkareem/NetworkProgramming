package com.company.Scanner;


import java.util.Scanner;

public class Bensinforbrukning {
    private double mil;
    private double bensin;
    private double forbrukning;

    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Ange mil och bensin i decimalform: ");
        while(sc.hasNextDouble() == true){
         mil = sc.nextDouble();
         bensin = sc.nextDouble();
            break;
        }
        forbrukning=  bensin / mil;
        System.out.println(forbrukning);
    }
    public double getMil() {
        return mil;
    }

    public void setMil(double mil) {
        this.mil = mil;
    }

    public double getBensin() {
        return bensin;
    }

    public void setBensin(double bensin) {
        this.bensin = bensin;
    }

    public double getForbrukning() {
        return forbrukning;
    }

    public void setForbrukning(double forbrukning) {
        this.forbrukning = forbrukning;
    }

    public static void main(String[] args) {
        Bensinforbrukning bensinforbrukning = new Bensinforbrukning();
        bensinforbrukning.input();
    }
}


