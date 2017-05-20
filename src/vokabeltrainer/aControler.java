package vokabeltrainer;

import java.awt.event.*;
import java.io.Serializable;

public class aControler implements ActionListener, Serializable {

    String cmd;

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

    protected void actionEventPruefen() {
    }

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
