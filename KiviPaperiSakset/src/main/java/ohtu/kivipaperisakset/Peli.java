package ohtu.kivipaperisakset;

/**
 *
 * @author tuomo
 */
public abstract class Peli {

    private IO io;

    public Peli(IO io) {
        this.io = io;
    }

    public IO getIo() {
        return io;
    }
    
    public void pelaa(Pelaaja p1, Pelaaja p2) {
        Tuomari tuomari = new Tuomari();
        
        String ekanSiirto = p1.annaSiirto();
        String tokanSiirto = p2.annaSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            io.println(tuomari.toString());
            io.println("");
            
            ekanSiirto = p1.annaSiirto();
            tokanSiirto = p2.annaSiirto();
            p1.asetaSiirto(tokanSiirto);
            p2.asetaSiirto(ekanSiirto);
        }

        io.println("");
        io.println("Kiitos!");
        io.println(tuomari.toString());
    }

    public static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    public abstract void pelaa();
}
