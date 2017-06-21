/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View.Erstellen;

import vokabeltrainer.View.Erstellen.ErstellenFenster;
import vokabeltrainer.Model.Vokabelliste;

/**
 * Erstellt die Eingabemoeglichkeit und speichert die Eingaben die für die
 * Erstellung eines Vokabelfaches noetig sind.
 *
 * @author Friedrich
 */
public class ErstelleFach extends ErstellenFenster{

    Vokabelliste vokabelliste;

    /**
     * Erstellt ein Fenster mit den Eingabemoeklichkeiten zur Erzeugung bzw. Bearbeitung eines Vokabelfaches
     * Welches anschliesend erstellt und eingeordnet wird.
     */
    public ErstelleFach(Vokabelliste vokabelliste) {
        this.vokabelliste = vokabelliste;
    }

}
