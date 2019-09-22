package fr.umontpellier.iut.Ex3;

import java.util.ArrayDeque;
import java.util.Collection;

public class Chargement {

    private ArrayDeque<Wagon> chargement;

    public Chargement(Collection<Wagon> assemblagetrain) {
        this.chargement= new ArrayDeque<>(assemblagetrain);
    }

    public void attacher(Wagon wagon){
        chargement.push(wagon);
    }



    public Wagon detacher(){
            return chargement.pop();
    }

    public ArrayDeque<Wagon> getChargement() {
        return new ArrayDeque<>(chargement);
    }

}
