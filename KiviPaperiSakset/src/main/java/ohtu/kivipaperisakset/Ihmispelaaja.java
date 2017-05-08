package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author tuomo
 */
public class Ihmispelaaja implements Pelaaja {

    Scanner scanner;
    String monennenko;

    public Ihmispelaaja(Scanner scanner, String monennenko) {
        this.scanner = scanner;
        this.monennenko = monennenko;
    }
    
    @Override
    public String annaSiirto() {
        System.out.println(monennenko + " pelaajan siirto: ");
        return scanner.nextLine();
    }

    @Override
    public void asetaSiirto(String siirto) {
        // ei tee mitään
    }
}
