package fr.umontpellier.iut.Ex4;

public class Wagon {

    private String expediteur;

    private int poids;

    private String destination;

    public Wagon(String expediteur, int poids, String destination) {
        this.expediteur = expediteur;
        this.poids = poids;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "expediteur='" + expediteur + '\'' +
                ", poids=" + poids +
                ", destination='" + destination + '\'' +
                '}';
    }

    public int getPoids() {
        return poids;
    }

    public int getDistance(){
        return GestionDistances.getDistances(destination);
    }
}