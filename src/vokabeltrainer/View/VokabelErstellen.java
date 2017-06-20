/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View;

import vokabeltrainer.Model.Vokabelliste;

/**
 * Erstellt die Eingabemöglichkeit und speichert die Eingaben die für die
 * Berbeitung/Erzeugen einer Vokabel nötig sind.
 *
 * @author Friedrich
 */
public class VokabelErstellen {

    private Vokabelliste vokabelliste;

    /**
     * Erstellt eiene Vokabelbeaarbeitenfenter, in dem mn eine Vokabel entweder berbeiten oder erstellen kann
     *
     * @param vokabelliste
     * @param aktivitaet
     */
    public VokabelErstellen(Vokabelliste vokabelliste) {
        this.vokabelliste = vokabelliste;
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
