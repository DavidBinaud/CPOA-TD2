package fr.umontpellier.iut.Ex4;

public class TarifKm implements Tarif {
    private int priceperkm;


    public TarifKm(int priceperkm) {
        this.priceperkm = priceperkm;
    }

    @Override
    public double getPrix(Wagon w) {
        return w.getDistance() * priceperkm;
    }
}
