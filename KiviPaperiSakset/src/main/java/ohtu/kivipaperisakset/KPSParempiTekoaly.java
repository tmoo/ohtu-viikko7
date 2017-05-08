package ohtu.kivipaperisakset;
// vastaan vai ei
public class KPSParempiTekoaly extends Peli {

    public KPSParempiTekoaly(IO io) {
        super(io);
    }

    @Override
    public void pelaa() {
        Pelaaja p1 = new Ihmispelaaja(super.getIo(), "Ensimmäisen");
        TekoalyParannettu tekoaly = new TekoalyParannettu(super.getIo(), 20);
        
        super.pelaa(p1, tekoaly);
    }
}