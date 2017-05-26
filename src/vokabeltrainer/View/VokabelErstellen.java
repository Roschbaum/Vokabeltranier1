/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View;

import vokabeltrainer.Model.Vokabel;

/**
 * Erstellt die Eingabemöglichkeit und speichert die Eingaben die für die
 * Erstellung einer Vokabel nötig sind.
 *
 * @author Friedrich
 */
public class VokabelErstellen {
    Vokabel vokabel;
    /**
     * Erstellt ein Fenster mit den Eingabemöklichkeiten, Speichert diese,
     * Registrierd ob die Eingabe richtig ist.
     */
    public VokabelErstellen() {
    }

    /**
     * Erstellt die Eingabemöcklichkeiten um eine Vokabel zu Bearbeiten.
     * @param vokabel 
     */
    public VokabelErstellen(Vokabel vokabel) {
        this.vokabel = vokabel;
    }

    /**
     * Schließt das Eingabefenster
     */
    public void closeVokabeleingabe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt die Eingabe zurück, ob die neue Vokabel heufig ist.
     *
     * @return
     */
    public boolean getBooleanHeufig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt wieder ob die neue Vokabel sich in einem Vokabelkasten befindet.
     *
     * @return
     */
    public boolean getBooleanVokabelkasten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt die Bedeutung der neuen Vokabel wieder.
     *
     * @return
     */
    public String getEingabeBedeutung() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt den Namen der neuen Vokabel wieder.
     *
     * @return
     */
    public String getEingabeName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt zurück ob die Eingabe richtig verlaufen ist.
     *
     * @return
     */
    public boolean getEingabeRichtig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gibt die Zusatzangaen der neuen Vokabel wieder.
     *
     * @return
     */
    public String getEingabeZusatzangaben() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
