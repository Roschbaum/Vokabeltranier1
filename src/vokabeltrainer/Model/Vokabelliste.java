package vokabeltrainer.Model;

import java.io.Serializable;
import java.util.TreeMap;

/**
 * g
 *
 * @author Friedrich
 */
public class Vokabelliste implements Serializable {

    private TreeMap<String, VokabelmitGleichemNamen> mBaum;

    /**
     * Erzeugt einen neue Vokabelliste
     */
    public Vokabelliste() {
        this.mBaum = new TreeMap<>();
    }

    /**
     * fügt eien neue Vokabel in die Liste ein.
     *
     * @param nVokabel
     */
    public boolean einfuegen(Vokabel nVokabel) {
        if (mBaum.containsKey(nVokabel.getmName())) {
            if (mBaum.get(nVokabel.getmName()).add(nVokabel)) {
                return  true;
            } else {
                return  false;
            }
        } else {
            VokabelmitGleichemNamen vokabelmitGleichemNamen = new VokabelmitGleichemNamen(nVokabel.getmName());
            vokabelmitGleichemNamen.add(nVokabel);
            mBaum.put(nVokabel.getmName(),vokabelmitGleichemNamen );
            return true;
        }
    }

    /**
     * sucht eine Vokabel mit dem Namen
     *
     * @param nString
     * @return
     */
    public VokabelmitGleichemNamen suche(String nString) {
        return mBaum.get(nString);
    }

    /**
     * Entvernt eine Vokbel aus der Liste
     *
     * @param lVokabel
     */
    public void loescheVokabel(Vokabel lVokabel) {
        mBaum.remove(lVokabel.getmName());
    }
}
