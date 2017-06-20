/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View;

import vokabeltrainer.Model.Vokabelliste;

/**
 * Erstellt die Eingabemöglichkeit und speichert die Eingaben die für die
 * Erstellung eines Vokabelfaches nötig sind.
 *
 * @author Friedrich
 */
public class ErstelleFach {

    Vokabelliste vokabelliste;

    /**
     * Erstellt ein Fenster mit den Eingabemöklichkeiten zur Erzeugung bzw. Bearbeitung eines Vokabelfaches
     * Welches anschliesend erstellt und eingeordnet wird.
     */
    public ErstelleFach(Vokabelliste vokabelliste) {
        this.vokabelliste = vokabelliste;
    }

}
