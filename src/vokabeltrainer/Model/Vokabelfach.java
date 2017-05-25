package vokabeltrainer.Model;

import java.io.Serializable;
import java.util.ArrayDeque;

/**
 * Stellt ein Vokabelfach eines Vokabelkastens in der Wirklichkeit dar
 *
 * @author Friedrich
 */
public class Vokabelfach implements Serializable {

    private ArrayDeque<Vokabel> mVokabelliste;

    private String name;

    /**
     * Erstellt ein Vokabelfach mit dem Namen:
     *
     * @param mName
     */
    public Vokabelfach(String mName) {
        mVokabelliste = new ArrayDeque<>();
        this.name = mName;
    }

    /**
     * gibt den Namen des Vokabel Faches zurück.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * fügt eine Vokabel in das Fach ein.
     *
     * @param nVokabel
     */
    public void fuegeVokabelEin(Vokabel nVokabel) {
        mVokabelliste.addLast(nVokabel);
    }

    /**
     * gibt di eAnzahl der Vokabel im Fach wieder.
     *
     * @return
     */
    public int getLaenge() {
        return mVokabelliste.size();
    }

    /**
     * Gibt die nachste vokabel aus ohne sie zu entfernen.
     *
     * @return
     */
    public Vokabel naechsteVokabelausgeben() {
        return (Vokabel) mVokabelliste.peekFirst();
    }

    /**
     * Entfernt und gibt die nächste Vokabel zurück.
     *
     * @return
     */
    public Vokabel naechsteVokabel() {
        return  mVokabelliste.removeFirst();
    }
}
