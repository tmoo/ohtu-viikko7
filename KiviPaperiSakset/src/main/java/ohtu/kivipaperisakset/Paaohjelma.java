package ohtu.kivipaperisakset;

public class Paaohjelma {

    private static final IO io = new ConsoleIO();

    public static void main(String[] args) {

        while (true) {
            io.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = io.nextLine();

            Pelitehdas ptehdas = new Pelitehdas(io);
            Peli peli = ptehdas.hae(vastaus);
            if (peli == null) {
                break;
            }
            io.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            peli.pelaa();
        }
    }
}
