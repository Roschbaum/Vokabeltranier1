/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View;

import vokabeltrainer.Model.Vokabelkasten;

/**
 * Erstellt die Eingabemöglichkeit und speichert die Eingaben die für die
 * Erstellung eines Vokabelfaches nötig sind.
 *
 * @author Friedrich
 */
public class ErselleKasten {

    private Vokabelkasten mVokabelkasten;

    /**
     * Erstellt die Eingabemöglichkeit und speichert die Eingaben die für die
     * Erstellung eines Vokabelkastens nötig sind.
     */
    public ErselleKasten() {
    }

    /**
     * Bietet die Möglichkeit einen Vokabelkasten zu bearbeiten
     *
     * @param mVokabel zu bearbeitender Vokabelkasten
     */
    public ErselleKasten(Vokabelkasten mVokabelkasten) {
        this.mVokabelkasten = mVokabelkasten;
    }

    /**
     * Schließt das Eingabefenster,
     */
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt an ob die Eingabe korrekt verlaufen ist.
     *
     * @return
     */
    public boolean getEingabeRichtig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt den Namen des Neuen Vokabelkasten zurück.
     *
     * @return
     */
    public String getNameVokabelkasten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
