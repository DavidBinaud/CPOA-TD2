package fr.umontpellier.iut.Ex3;

import java.util.Comparator;

public class WagonComparatorDistPoids implements Comparator<Wagon>{

    WagonComparatorDistance comparator = new WagonComparatorDistance();

    @Override
    public int compare(Wagon o1, Wagon o2) {
        if(comparator.compare(o1,o2) != 0) return comparator.compare(o1,o2);
        else return o1.getPoids() - o2.getPoids();
    }
}
