package ohtu.kivipaperisakset;

public class Tekoaly implements Pelaaja {

    int siirto;
    private IO io;

    public Tekoaly(IO io) {
        siirto = 0;
        this.io = io;
    }

    @Override
    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;

        String tulos;
        
        if (siirto == 0) {
            tulos = "k";
        } else if (siirto == 1) {
            tulos = "p";
        } else {
            tulos = "s";
        }
        io.println("Tietokone valitsi: " + tulos);
        return tulos;
    }

    @Override
    public void asetaSiirto(String siirto) {
        // ei tee mitään
    }
}
