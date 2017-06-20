/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View;

import vokabeltrainer.Model.Vokabelliste;

/**
 * Diese Klasse erstellt ein Fenster zum Löschen eines Vokabelfaches. Sie regelt
 * sämtiche Abläufe die damit verbunden sind
 *
 * @author Friedrich
 */
public class LöscheFach {

    private Vokabelliste vokabelliste;

    /**
     * Erstellt ein Fenster
     *
     * @param vokabelliste
     */
    public LöscheFach(Vokabelliste vokabelliste) {
        this.vokabelliste = vokabelliste;
    }

}
