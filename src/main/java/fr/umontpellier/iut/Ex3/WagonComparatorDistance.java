package fr.umontpellier.iut.Ex3;

import java.util.Comparator;

public class WagonComparatorDistance implements Comparator<Wagon> {


    @Override
    public int compare(Wagon o1, Wagon o2) {
        return  o1.getDistance() - o2.getDistance();
    }
}
