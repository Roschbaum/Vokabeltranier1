package vokabeltrainer;

import Speichern.Speichern;
import java.io.Serializable;
import static java.lang.System.exit;
import java.util.ArrayList;
import vokabeltrainer.Model.*;
import vokabeltrainer.View.*;

/**
 * Controllerklasse
 *
 * @author Friedrich
 */
public class SControler extends aControler implements Serializable {

    private Einlese mEinlese;
    private Speichern mSpeicher;
    private ArrayList<Vokabelkasten> mKasten;
    private View mView;
    private Vokabelliste mVokabelliste;

    public SControler() {
    }

    /**
     * Ereugt einen Cotroller mit einem Haubtvokabelkassten.
     *
     * @param mView
     */
    public SControler(View mView) {
        super();
        this.mView = mView;
        mKasten = new ArrayList();
        mVokabelliste = new Vokabelliste();
        mEinlese = new Einlese();
        mSpeicher = new Speichern();
        addVokabelkasten("Haubtvokabelkasten");
    }

    private void addVokabelkasten(String mName) {
        mKasten.add(new Vokabelkasten(mName, this));
    }

    /**
     * Berurteilt ob eine Vokabel gekot wurde.
     *
     * @param v
     * @return
     */
    public int geKont(Vokabel v) {
        mView.zeichneVokabel(v);
        if (0 == zeichneZusatzangaben(v)) {
            return 0;
        }
        if (0 == zeichneBedeutung(v)) {
            return 0;
        }
        switch (cmd) {
            case "richtig":
                return 1;
            case "falsch":
                return -1;
            case "abbrechen":
                return 0;
            default:
                return geKont(v);
        }
    }

    /**
     * Löscht den vom Benutzer noch zu bestimenden Vokabelkasten.
     */
    public void loescheVokabelkasten() {
        new LöscheKasten(mVokabelliste);
    }

    /**
     * Zeigt die Bedeutung einer Vokabel wenn dies vom Benutzer verlagt wird.
     *
     * @param v Vokabel deren Bedeutung gezeichnet werden soll
     * @return
     */
    public int zeichneBedeutung(Vokabel v) {
        warteAufEvent();
        switch (cmd) {
            case "bedeutung":
                mView.zeichneBedeutung(v);
                return 1;
            case "abbrechen":
                return 0;
            default:
                return zeichneBedeutung(v);
        }
    }

    /**
     * Zeichnet die Zusatzangaben einer Vokabel
     *
     * @param v
     * @return
     */
    public int zeichneZusatzangaben(Vokabel v) {
        warteAufEvent();
        switch (cmd) {
            case "zusatzangaben":
                mView.zeichneZusatangaben(v);
                return 1;
            case "abbrechen":
                return 0;
            default:
                return zeichneZusatzangaben(v);
        }
    }

    //Auslagern ?
    private int bestimmeVokabelfach(int anzahl) {
        warteAufEvent();
        if (cmd.startsWith("vokabelfach")) {
            for (int i = 0; i < anzahl; i++) {
                if (cmd.contains("" + (i + 1))) {
                    return i + 1;
                }
            }
        } else {
            return bestimmeVokabelfach(anzahl);
        }
        return -1;
    }

    //Auslagern ?
    private Vokabelkasten bestimmeVokabelkasten() {
        warteAufEvent();
        if (cmd.startsWith("vokabelkasten")) {
            for (int i = 0; i < mKasten.size(); i++) {
                if (cmd.contains("" + (i))) {
                    return mKasten.get(i);
                }
            }
        }
        return null;
    }

    private void einfuegen() {
        switch (cmd) {
            case "erstellevokabelkasten":
            case "bearbeitevokabelkasten":
                erstelleVokabelkasten();
                break;
            case "erstellevokabelfach":
            case "bearbeitevokabelfach":
                erstelleVokabelfach();
                break;
            case "erstellevokabel":
            case "bearbeitevokabel":
                erstelleVokabel();
                break;
            default:
                break;
        }
    }

    private void einlesen() {
    }

    private void erstelleVokabel() {
        new VokabelErstellen(mVokabelliste);
    }

    private void erstelleVokabelfach() {
        new ErstelleFach(mVokabelliste);
    }

    private void erstelleVokabelkasten() {
        new ErselleKasten(mVokabelliste);

    }

    private void hoereAb() {
        boolean mUnterbtochen;
        Vokabelkasten lVokabelkasten = bestimmeVokabelkasten();
        mUnterbtochen = lVokabelkasten.hoereAb(bestimmeVokabelfach(lVokabelkasten.getLaenge()));
        if (mUnterbtochen) {
            mView.zeige("es sind keine Vokabeln mehr in dem Fach");
        } else {
            mView.zeige("bestimmen sie die naeste Aktion, die ausgefuert werden soll");
        }
    }

    private void loescheVokabel() {
        new LöscheVokabel();
    }

    private void loescheVokabelfach() {
        new LöscheFach(mVokabelliste);
    }

    private void loeschen() {
        switch (cmd) {
            case "loescheexit":
                mSpeicher.speichern(mView);
                exit(0);
            case "loeschevokabelkasten":
                loescheVokabelkasten();
                break;
            case "loeschevokabelfach":
                loescheVokabelfach();
                break;
            case "loeschevokabel":
                loescheVokabel();
                break;
            default:
                break;
        }
    }

    /**
     * prüft Aktionevent auf bestimmte Strings.
     */
    @Override
    protected void actionEventPruefen() {
        switch (cmd) {
            case "exit":
                mSpeicher.speichern(mView);
                exit(0);
                break;
            case "abhoeren":
                hoereAb();
                break;
            case "einlesen":
                einlesen();
                break;
            default:
                if (cmd.startsWith("loesche")) {
                    loeschen();
                } else if (cmd.startsWith("erstelle") || cmd.startsWith("bearbeite")) {
                    einfuegen();
                }
                break;
        }
    }
}
