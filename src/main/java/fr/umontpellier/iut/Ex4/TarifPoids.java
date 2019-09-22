package fr.umontpellier.iut.Ex4;

public class TarifPoids implements Tarif {

    private int priceperkg;

    public TarifPoids(int priceperkg) {
        this.priceperkg = priceperkg;
    }

    @Override
    public double getPrix(Wagon w) {
        return w.getPoids() * priceperkg;
    }
}