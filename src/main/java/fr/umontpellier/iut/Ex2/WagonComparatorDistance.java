package fr.umontpellier.iut.Ex2;

import java.util.Comparator;

public class WagonComparatorDistance implements Comparator<Wagon> {


    @Override
    public int compare(Wagon o1, Wagon o2) {
        return o2.getDistance() - o1.getDistance();
    }
}
