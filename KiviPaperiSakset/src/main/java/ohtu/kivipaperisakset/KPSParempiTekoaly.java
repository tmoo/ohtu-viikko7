package ohtu.kivipaperisakset;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends Peli {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void pelaa() {
        Pelaaja p1 = new Ihmispelaaja(scanner, "Ensimmäisen");
        TekoalyParannettu tekoaly = new TekoalyParannettu(20);
        
        super.pelaa(p1, tekoaly);
    }
}