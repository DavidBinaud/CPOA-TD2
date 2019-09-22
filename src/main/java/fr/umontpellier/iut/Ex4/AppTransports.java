package fr.umontpellier.iut.Ex4;




public class AppTransports {

    public static void main(String[] args) {
        Wagon wagon1 = new Wagon("Rbus", 110, "Toulouse");
        Wagon wagon2 = new Wagon("LaTouristra", 110, "Paris");
        Wagon wagon3 = new Wagon("LeBonVin", 90, "Bordeaux");
        Wagon wagon4 = new Wagon("PoPoLain", 145, "Blois");


        Tarif tariffixe = new TarifFixe(1000);

        TarifPoids tarifpoids = new TarifPoids(15);

        TarifKm tarifkm = new TarifKm(10);

        // output 1000
        System.out.println(wagon1.getTarif(tariffixe));

        // output 15 * 110 = 1650
        System.out.println(wagon1.getTarif(tarifpoids));

        // output 10 * 249 = 2490
        System.out.println(wagon1.getTarif(tarifkm));



        Tarif tarifmin = new TarifMinKmPoids(tarifpoids,tarifkm);

        // output 1650 car 1650 < 2490
        System.out.println("Tarifmin =" + wagon1.getTarif(tarifmin));
    }
}
