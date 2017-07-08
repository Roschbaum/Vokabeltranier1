/*
 *  Copyright (c) Friedrich Roth 
 *  Alle Recht vor behalten
 *  nur fuer den privaten Gebrauch freigegeben.
 */
package Speichern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.out;

/**
 *
 * @author Friedrich
 */
public class Speichern implements Serializable {

    private final String datnam = "hallo.ser";

    /**
     * Konstuktor der klasse Speichern
     */
    public Speichern() {
    }

    /**
     * Speichert das ubergebene Objekt.
     *
     * @param nObject zuspeicherndes Objekt.
     */
    public void speichern(Object nObject) {

        out.println("vokabeltrainernet.main()");
        ObjectOutputStream aus = null;
        try {
            aus = new ObjectOutputStream(new FileOutputStream(datnam));
            aus.writeObject(nObject);
        } catch (IOException ex) {
            out.println(ex);
        } finally {
            try {
                if (aus != null) {
                    aus.flush();
                    aus.close();
                }
            } catch (IOException e) {
            }
        }
    }

    /**
     *
     * @return
     */
    public Object oeffnen() {
        ObjectInputStream in = null;
        Object mObject = null;
        try {
            in = new ObjectInputStream(new FileInputStream(datnam));
            mObject = (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            out.println("Speichersdatei (noch) nicht vorhanden!");
        } catch (Exception ex) {
            out.println(ex);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
            }
        }
        return mObject;
    }

}
