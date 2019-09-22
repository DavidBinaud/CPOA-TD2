package fr.umontpellier.iut.Ex3;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class AppTransports {

    public static void main(String[] args) {
        Wagon wagon1 = new Wagon("Rbus", 110, "Toulouse");
        Wagon wagon2 = new Wagon("LaTouristra", 110, "Paris");
        Wagon wagon3 = new Wagon("LeBonVin", 90, "Bordeaux");
        Wagon wagon4 = new Wagon("PoPoLain", 145, "Blois");

        Wagon wagon5 = new Wagon("PoPoLain32", 28, "Blois");
        Wagon wagon6 = new Wagon("Ratatata", 49, "Lille");

        ArrayList<Wagon> train = new ArrayList<>();
        train.add(wagon1);
        train.add(wagon2);
        train.add(wagon3);
        train.add(wagon4);


        PriorityQueue<Wagon> assemblagetrain = new PriorityQueue<>(new WagonComparatorDistance());
        assemblagetrain.addAll(train);


        //necessaire pour obtenir l'ordre du train dans le bon sens afin de le remettre dans Chargement
        ArrayDeque<Wagon> copieassemblage = new ArrayDeque<>();
        while (!assemblagetrain.isEmpty()){copieassemblage.addLast(assemblagetrain.poll());}



        Chargement chargement = new Chargement(copieassemblage);

        //on detache deux wagons
        System.out.println(chargement.detacher()); // D
        System.out.println(chargement.detacher()); // C

        //on attache deux wagons
        chargement.attacher(wagon6);    // E
        chargement.attacher(wagon5);    // F

        //Les wagons dans l'ordre de la queue à la tete sont dans l'ordre d'apparition; cad l'assemblage de base D C B A
        // ou D C ont été détaché donc  B A
        // auquel on rajoute E F
        // F E B A
        System.out.println(chargement.getChargement());



    }
}
