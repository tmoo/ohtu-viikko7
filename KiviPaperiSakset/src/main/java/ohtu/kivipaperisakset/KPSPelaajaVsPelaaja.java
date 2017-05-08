package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends Peli {

    public KPSPelaajaVsPelaaja(IO io) {
        super(io);
    }

    @Override
    public void pelaa() {
        Pelaaja p1 = new Ihmispelaaja(super.getIo(), "Ensimmäisen");
        Pelaaja p2 = new Ihmispelaaja(super.getIo(), "Toisen");
        
        super.pelaa(p1, p2);
    }
}