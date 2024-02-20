package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {
    public static void main(String... args) {
        Computer olinkaComputer = new Computer();
        System.out.println(olinkaComputer.toString());
        



    //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
    System.out.println("Program on.");
    }
}


/*
*   public static void main(String... args) {
    Pocitac filipuvPocitac = new Pocitac();
    System.out.println(filipuvPocitac.toString());
    filipuvPocitac.zapniSe();      // Vypíše chybu, protože počítač v tuto chvíli nemá všechny povinné součásti.

    Procesor filipuvProcesor = new Procesor();
    filipuvProcesor.setRychlost(3_490_000_000L);
    filipuvProcesor.setVyrobce("Apple");

    Pamet filipovaPamet = new Pamet();
    filipovaPamet.setKapacita(24_000_000_000L);

    Disk filipuvDisk = new Disk();
    filipuvDisk.setKapacita(994_662_584_320L);

    filipuvPocitac.setCpu(filipuvProcesor);
    filipuvPocitac.setRam(filipovaPamet);
    filipuvPocitac.setPevnyDisk(filipuvDisk);

    System.out.println(filipuvPocitac.toString());

    filipuvPocitac.zapniSe();
    filipuvPocitac.zapniSe();      // Vypíše chybu, protože počítač už běží
    System.out.println(filipuvPocitac.toString());
    filipuvPocitac.vypniSe();

    filipuvPocitac.vypniSe();   */







