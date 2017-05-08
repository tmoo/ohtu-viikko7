package ohtu.kivipaperisakset;

/**
 *
 * @author tuomo
 */
public abstract class Peli {

    public void pelaa(Pelaaja p1, Pelaaja p2) {
        Tuomari tuomari = new Tuomari();
        
        String ekanSiirto = p1.annaSiirto();
        String tokanSiirto = p2.annaSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();
            
            ekanSiirto = p1.annaSiirto();
            tokanSiirto = p2.annaSiirto();
            p1.asetaSiirto(tokanSiirto);
            p2.asetaSiirto(ekanSiirto);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    public static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    public abstract void pelaa();
}
