package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends Peli {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void pelaa() {
        Pelaaja p1 = new Ihmispelaaja(scanner, "Ensimmäisen");
        Pelaaja p2 = new Ihmispelaaja(scanner, "Toisen");
        
        super.pelaa(p1, p2);
    }
}