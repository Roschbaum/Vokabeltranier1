/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View.Loeschen;

import vokabeltrainer.Model.Vokabelliste;

/**
 * Diese Klasse erstellt ein Fenster zum Loeschen eines Vokabelfaches. Sie regelt
 * sämtiche Abläufe die damit verbunden sind
 *
 * @author Friedrich
 */
public class LoescheFach extends LoeschenFenster{

    private Vokabelliste vokabelliste;

    /**
     * Erstellt ein Fenster
     *
     * @param vokabelliste
     */
    public LoescheFach(Vokabelliste vokabelliste) {
        this.vokabelliste = vokabelliste;
    }

}
