/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.View.Loeschen;

import vokabeltrainer.Model.Vokabelliste;

/**
 *  Diese Klasse dient der Steuerung und Ausführung der Prozesse zum Loeschen eines Vokabelkastens
 * @author Friedrich
 */
public class LoescheKasten extends LoeschenFenster{

    private Vokabelliste vokabelliste;

    public LoescheKasten(Vokabelliste vokabelliste) {
        this.vokabelliste = vokabelliste;
    }

    
}
