package fr.umontpellier.iut.Ex1;

import java.util.ArrayList;

public class AppTransports {

    public static void main(String[] args) {
        Wagon wagon1 = new Wagon("Rbus",110,"Toulouse");
        Wagon wagon2 = new Wagon("LaTouristra",110,"Paris");
        Wagon wagon3 = new Wagon("LeBonVin",90,"Bordeaux");
        Wagon wagon4 = new Wagon("PoPoLain",145,"Blois");

        ArrayList<Wagon> train = new ArrayList<>();
        train.add(wagon1);
        train.add(wagon2);
        train.add(wagon3);
        train.add(wagon4);

        System.out.println(train);
    }
}
