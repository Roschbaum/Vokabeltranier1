package vokabeltrainer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;

public class Vokabeltrainer {

    private static final String datnam = "vokabeltrainer.ser";

    private static vokabeltrainer.View view = null;

    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(datnam));
            view = (vokabeltrainer.View) in.readObject();
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
            view = new vokabeltrainer.View();
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
