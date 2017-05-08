package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tuomo
 */
public class Pelitehdas {
    
    private final Map<String, Peli> pelit;

    public Pelitehdas() {
        this.pelit = new HashMap<>();
        pelit.put("a", new KPSPelaajaVsPelaaja());
        pelit.put("b", new KPSTekoaly());
        pelit.put("c", new KPSParempiTekoaly());
    }
    
    public Peli hae(String pelinNimi) {
        Peli peli = pelit.get(pelinNimi);
        return peli;
    }
}
