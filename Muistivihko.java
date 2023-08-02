package Demot;

import java.util.ArrayList;

/**
 * Luokka toimii kuten muistivihko
 * sille voi asettaa nimen ja omistajan,
 * sekä sinne voi kirjoittaa muistiinpanoja
 */

public class Muistivihko {
    private String nimi;
    private String omistaja;
    private ArrayList<String> muistiinpanot;

    /**
     * Konstruktoi uuden muistivihon (rakentaa?)
     * 
     * @param nimi Muistivihon nimi
     * @param omistaja Omistajan nimi
     */

    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }
    /**
     * Palauttaa muistivihon nimen
     * 
     * @return muistivihon nimen
     */
    public String getNimi() {
        return nimi;
    }
    /**
     * Asettaa muistivihon uuden nimen
     * 
     * @param nimi on muistivihon uusi nimi
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    /**
     * Palauttaa omistajan nimen
     * 
     * @return omistajan nimi
     */
    public String getOmistaja() {
        return omistaja;
    }
    /**
     * Asettaa muistivihon omistajan nimen
     * 
     * @param omistaja on muistivihon omistajan uusi nimi
     */
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }
    /**
     * Lisätään uusi muistiinpano
     * 
     * @param viesti asetettava viesti
     */
    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }
    /**
     * Palauttaa muistivihon koon eli muistiinpanojen määrän
     * 
     * @return muistiinpanojen määrän
     */
    public int muistiinpanoja() {
        return muistiinpanot.size();
    }
    /**
     * Tulostaa kaikki muistivihon muistiinpanot kunkin omalle rivilleen
     */
    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }
}


