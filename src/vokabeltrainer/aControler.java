package vokabeltrainer;

import java.awt.event.*;
import java.io.Serializable;

/**
 * Implementiert die wesentlichen eigenschaften, die ein Contoler im Algemeinen
 * aufweisen muss.
 *
 * @author Friedrich
 */
public class aControler implements ActionListener, Serializable {

    String cmd;

    /**
     * Erstellt einen neuen aControler.
     */
    public aControler() {
        this.cmd = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cmd = e.getActionCommand();
        actionEventPruefen();
        notifyCMD();
    }

    private synchronized void notifyCMD() {
        notifyAll();
    }

    /**
     * Enthällt die ActionEvents die vom Aktionlistener immer ausgeführt werden
     * sollen.
     */
    protected void actionEventPruefen() {
    }

    /**
     * Wartet solangge bis, ein ActionEvent auftritt. Dieses wird dann im String
     * cmd abgspeichert.
     */
    protected synchronized void warteAufEvent() {
        cmd = "";
        while ("".equals(cmd)) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }
}
