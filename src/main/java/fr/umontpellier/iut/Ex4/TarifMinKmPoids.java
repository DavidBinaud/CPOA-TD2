package fr.umontpellier.iut.Ex4;

public class TarifMinKmPoids implements Tarif{

    Tarif tarifpoids;

    Tarif tarifkm;

    public TarifMinKmPoids(TarifPoids tarifpoids, TarifKm tarifkm) {
        this.tarifpoids = tarifpoids;
        this.tarifkm = tarifkm;
    }

    @Override
    public double getPrix(Wagon w) {
        return Math.min(tarifkm.getPrix(w),tarifpoids.getPrix(w));
    }
}
