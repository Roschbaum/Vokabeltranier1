/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View;

import vokabeltrainer.Model.Vokabelfach;

/**
 * Erstellt die Eingabemöglichkeit und speichert die Eingaben die für die
 * Erstellung eines Vokabelfaches nötig sind.
 *
 * @author Friedrich
 */
public class ErstelleFach {

    Vokabelfach vokabelfach;
    /**
     * Erstellt ein Fenster mit den Eingabemöklichkeiten, Speichert diese,
     * Registrierd ob die Eingabe richtig ist.
     */
    public ErstelleFach() {
    }

    /**
     * Erstelt ein Fenster mit den Eingabemöcklichkeiten zur Bearbeitung eines Vokabelfaches
     * @param vokabelfach zu bearbeitendes Vokabelfach.
     */
    public ErstelleFach(Vokabelfach vokabelfach) {
        this.vokabelfach = vokabelfach;
    }

    /**
     * Schließt das Eingabefenster.
     */
    public void closeVokablfacheingabe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt zurück ob die Eingabe korrekt zuendegeführt worden ist.
     *
     * @return ergebnis
     */
    public boolean getEingabeRichtig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt den Namen des neuen Vokabelfaches wieder.
     *
     * @return
     */
    public String getVokabelFachName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
