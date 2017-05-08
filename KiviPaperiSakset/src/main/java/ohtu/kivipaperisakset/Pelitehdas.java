package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tuomo
 */
public class Pelitehdas {
    
    private final Map<String, Peli> pelit;

    public Pelitehdas(IO io) {
        
        this.pelit = new HashMap<>();
        pelit.put("a", new KPSPelaajaVsPelaaja(io));
        pelit.put("b", new KPSTekoaly(io));
        pelit.put("c", new KPSParempiTekoaly(io));
    }
    
    public Peli hae(String pelinNimi) {
        Peli peli = pelit.get(pelinNimi);
        return peli;
    }
}
