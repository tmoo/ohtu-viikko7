package ohtu.kivipaperisakset;

public class KPSTekoaly extends Peli {

    public KPSTekoaly(IO io) {
        super(io);
    }
    
    @Override
    public void pelaa() {
        Pelaaja p1 = new Ihmispelaaja(super.getIo(), "Ensimmäinen");
        Tekoaly tekoaly = new Tekoaly(super.getIo());

        super.pelaa(p1, tekoaly);
    }
}