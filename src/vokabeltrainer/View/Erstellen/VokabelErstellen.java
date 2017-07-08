/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View.Erstellen;

import vokabeltrainer.Model.Vokabelliste;

/**
 * Erstellt die Eingabemoeglichkeit und speichert die Eingaben die für die
 * Berbeitung/Erzeugen einer Vokabel noetig sind.
 *
 * @author Friedrich
 */
public class VokabelErstellen extends ErstellenFenster {

    private Vokabelliste vokabelliste;

    /**
     * Erstellt eiene Vokabelbeaarbeitenfenter, in dem mn eine Vokabel entweder
     * berbeiten oder erstellen kann
     *
     * @param vokabelliste
     */
    public VokabelErstellen(Vokabelliste vokabelliste) {
        this.vokabelliste = vokabelliste;
    }

}
