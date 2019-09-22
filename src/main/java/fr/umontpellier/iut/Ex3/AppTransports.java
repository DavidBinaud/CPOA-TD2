package fr.umontpellier.iut.Ex3;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class AppTransports {

    public static void main(String[] args) {
        Wagon wagon1 = new Wagon("Rbus",110,"Toulouse");
        Wagon wagon2 = new Wagon("LaTouristra",110,"Paris");
        Wagon wagon3 = new Wagon("LeBonVin",90,"Bordeaux");
        Wagon wagon4 = new Wagon("PoPoLain",145,"Blois");
        Wagon wagon5 = new Wagon("PoPoLain32",28,"Blois");
        Wagon wagon6 = new Wagon("Ratatata",49,"Lille");

        ArrayList<Wagon> train = new ArrayList<>();
        train.add(wagon1);
        train.add(wagon2);
        train.add(wagon3);
        train.add(wagon4);
        train.add(wagon5);


        PriorityQueue<Wagon> assemblagetrainDistPoids = new PriorityQueue<>(new WagonComparatorDistPoids());
        assemblagetrainDistPoids.addAll(train);

        System.out.println(assemblagetrainDistPoids.poll());

        assemblagetrainDistPoids.add(wagon6);
        while(!assemblagetrainDistPoids.isEmpty()) System.out.println(assemblagetrainDistPoids.poll());
    }
}
