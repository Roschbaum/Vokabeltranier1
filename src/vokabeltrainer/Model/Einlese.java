package vokabeltrainer.Model;

import java.io.File;
import java.io.Serializable;
import javax.swing.JFileChooser;

public class Einlese implements Serializable {

    private File input;

    public Einlese() {
    }

    public void oeffnen() {
        JFileChooser fc = new JFileChooser();
        String pathOfFile = null;
        fc.setVisible(true);
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            pathOfFile = fc.getSelectedFile().getAbsolutePath();
            input = fc.getSelectedFile();
        }
        einLesen(pathOfFile);
    }

    private void einLesen(String pathOfFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
