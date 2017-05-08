package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Peli {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void pelaa() {
        Pelaaja p1 = new Ihmispelaaja(scanner, "Ensimmäinen");
        Tekoaly tekoaly = new Tekoaly();

        super.pelaa(p1, tekoaly);
    }
}