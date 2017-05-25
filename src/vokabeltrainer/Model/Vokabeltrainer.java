package vokabeltrainer.Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import vokabeltrainer.View.View;

public class Vokabeltrainer {

    private static final String datnam = "vokabeltrainer.ser";

    private static View view = null;

    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(datnam));
            view = (View) in.readObject();
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
        if (view == null) {
            view = new View();
        } else {
            view.fensterErstellen();
        }
        out.println("vokabeltrainernet.main()");
        ObjectOutputStream aus = null;
        try {
            aus = new ObjectOutputStream(new FileOutputStream(datnam));
            aus.writeObject(view);
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
}
