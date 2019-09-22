package fr.umontpellier.iut.Ex4;

import java.util.HashMap;

public abstract class GestionDistances {

    private static HashMap<String,Integer> distances = new HashMap<>();


    static {
        distances.put("Toulouse",249);
        distances.put("Paris",860);
        distances.put("Bordeaux",483);
        distances.put("Blois",618);
        distances.put("Lille",960);
    }

    public static int getDistances(String ville) {
        return distances.get(ville);
    }
}
