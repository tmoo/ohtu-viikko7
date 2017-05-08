package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author tuomo
 */
public class Ihmispelaaja implements Pelaaja {

    IO io;
    String monennenko;

    public Ihmispelaaja(IO io, String monennenko) {
        this.io = io;
        this.monennenko = monennenko;
    }
    
    @Override
    public String annaSiirto() {
        io.println(monennenko + " pelaajan siirto: ");
        return io.nextLine();
    }

    @Override
    public void asetaSiirto(String siirto) {
        // ei tee mitään
    }
}
