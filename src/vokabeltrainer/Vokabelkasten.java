package vokabeltrainer;

import java.io.Serializable;
import java.util.TreeMap;

/**
 * Stellt einen Vokabelkaste dar.
 * @author Friedrich
 */
public class Vokabelkasten implements Serializable {

    private TreeMap<Integer,Vokabelfach> faecher;

    private String name;

    private SControler mSControler;

    /**
     * Erzeugt einen Vokabelkasten.
     * @param name Name des neuen Vokabelkasten.
     * @param mSControler Contoler des Neuen vokabelkastens.
     */
    public Vokabelkasten(String name, SControler mSControler) {
        this.name = name;
        faecher = new TreeMap<>();
        this.mSControler = mSControler;
        for (int i = 0; i < 5; i++) {
            erzeugeFach("Fach Nummer " + i);
        }
    }

    /**
     * Gibt den Namen des Kastens wieder.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Bestimmt den Namen des Kastens.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Erzeugt eien neues Fachh im Vokabelkasten.
     * @param name Name des neuen Fachs 
     */
    public void erzeugeFach(String name) {
        faecher.put(faecher.size(),new Vokabelfach(name));
    }

    /**
     * Entvernt das Vokabelfach mit der zugehörigen nummer.
     * @param stelle
     */
    public void loescheFach(int stelle) {
        faecher.remove(stelle);
    }

    /**
     *  fügt eine Vokabel in einen Fach ein.
     * @param vokabel 
     * @param fach
     */
    public void fuegeVokabelEin(Vokabel vokabel, int fach) {
        Vokabelfach f = (Vokabelfach) faecher.get(fach);
        f.fuegeVokabelEin(vokabel);
    }

    /**
     *
     * @param fach
     * @return
     */
    public Vokabel gibVokabelAusFach(int fach) {
        Vokabelfach lVokabelfach = (Vokabelfach) faecher.get(fach);
        return lVokabelfach.naechsteVokabel();
    }

    /**
     *
     * @return
     */
    public int getLaenge() {
        return faecher.size();
    }

    /**
     *
     * @param fach
     * @return
     */
    public boolean hoereAb(int fach) {
        Vokabelfach lFach = (Vokabelfach) faecher.get(fach);
        if (lFach.getLaenge() == 0) {
            return false;
        }
        int richtig = mSControler.geKont(lFach.naechsteVokabelausgeben());
        switch(richtig) {
            case 1:
                Vokabelfach rFach = (Vokabelfach) faecher.get(fach - 1);
                rFach.fuegeVokabelEin(lFach.naechsteVokabel());
                return hoereAb(fach);
            case -1:
                if (faecher.size()> fach) {
                    Vokabelfach kFach = (Vokabelfach) faecher.get(fach + 1);
                    kFach.fuegeVokabelEin(lFach.naechsteVokabel());
                } else {
                    lFach.fuegeVokabelEin(lFach.naechsteVokabel());
                }
                return hoereAb(fach);
            default:
                return false;
        }
    }
}
