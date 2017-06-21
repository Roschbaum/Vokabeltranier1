/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View.Erstellen;

import vokabeltrainer.Model.Vokabelliste;

/**
 * Erstellt die Eingabemoeglichkeit und speichert die Eingaben die für die
 * Erstellung eines Vokabelfaches noetig sind.
 *
 * @author Friedrich
 */
public class ErselleKasten extends ErstellenFenster{

    private Vokabelliste vokabelliste;

    /**
     * Erstellt ein Fenster in dem ein Vokabel Kasten erstellt werden oder
     * Bearbeitet werden kann.
     *
     * @param vokabelliste
     */
    public ErselleKasten(Vokabelliste vokabelliste) {
        this.vokabelliste = vokabelliste;
    }

}
