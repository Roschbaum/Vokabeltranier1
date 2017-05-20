package vokabeltrainer;

import java.io.Serializable;
import java.util.TreeMap;

/**
 * g
 * @author Friedrich
 */
public class Vokabelliste implements Serializable {

    private TreeMap<String, Vokabel> mBaum;

    /**
     * Erzeugt einen neue Vokabelliste
     */
    public Vokabelliste() {
        this.mBaum = new TreeMap<>();
    }

    /**
     * fügt eien neue Vokabel in die Liste ein.
     * @param nVokabel
     */
    public void einfuegen(Vokabel nVokabel) {
        mBaum.put(nVokabel.getmName(), nVokabel);
    }

    /**
     * sucht eine Vokabel mit dem Namen
     * @param nString
     * @return
     */
    public Vokabel suche(String nString) {
        return mBaum.get(nString);
    }

    /**
     * Entvernt eine Vokbel aus der Liste
     * @param lVokabel
     */
    public void loescheVokabel(Vokabel lVokabel) {
        mBaum.remove(lVokabel.getmName());
    }
}
