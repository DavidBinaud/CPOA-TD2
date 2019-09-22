package fr.umontpellier.iut.Ex4;

public class TarifFixe implements Tarif{
    private int tarif;

    public TarifFixe(int tarif) {
        this.tarif = tarif;
    }

    @Override
    public double getPrix(Wagon w) {
        return tarif;
    }
}
