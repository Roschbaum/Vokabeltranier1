package vokabeltrainer;

import Speichern.Speichern;
import java.io.Serializable;
import static java.lang.System.exit;
import java.util.ArrayList;
import vokabeltrainer.Model.Einlese;
import vokabeltrainer.Model.Vokabel;
import vokabeltrainer.Model.Vokabelkasten;
import vokabeltrainer.Model.Vokabelliste;
import vokabeltrainer.View.ErselleKasten;
import vokabeltrainer.View.ErstelleFach;
import vokabeltrainer.View.View;
import vokabeltrainer.View.VokabelErstellen;

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
     * Erstellt eine Vokabel
     *
     * @param nName
     * @param nZusatsangaben
     * @param nBedeutung
     * @param vokabelkasten ist sie ineime,Vokabelkaseten zu fimden ?
     * @param heufig
     */
    private void erstelleVokabel(String nName, String nZusatsangaben, String nBedeutung, boolean vokabelkasten, boolean heufig) {
        Vokabel nVokabel = new Vokabel(nName, nZusatsangaben, nBedeutung, vokabelkasten, heufig);
        mVokabelliste.einfuegen(nVokabel);
        if (vokabelkasten) {
            bestimmeVokabelkasten().fuegeVokabelEin(nVokabel, 0);
        }
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
        Vokabelkasten m = bestimmeVokabelkasten();
        mKasten.remove(m);
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
        mView.zeichneEinfuegen();
        warteAufEvent();
        switch (cmd) {
            case "vokabelkasten":
                erstelleVokabelkasten();
                break;
            case "vokabelfach":
                erstelleVokabelfach();
                break;
            case "vokabel":
                erstelleVokabel();
                break;
            case "einlesen":
                einlesen();
                break;
            default:
                break;
        }
    }

    private void einlesen() {
    }

    private void erstelleVokabel() {
        VokabelErstellen erstellen = new VokabelErstellen();
        String name = erstellen.getEingabeName();
        String zuastzangaben = erstellen.getEingabeZusatzangaben();
        String bedeutung = erstellen.getEingabeBedeutung();
        boolean vokabelkasten = erstellen.getBooleanVokabelkasten();
        boolean heufig = erstellen.getBooleanHeufig();
        if (erstellen.getEingabeRichtig()) {
            erstelleVokabel(name, zuastzangaben, bedeutung, vokabelkasten, heufig);
        }
        erstellen.closeVokabeleingabe();
    }

    private void erstelleVokabelfach() {
        ErstelleFach erstelleFach = new ErstelleFach();
        String name = erstelleFach.getVokabelFachName();
        Vokabelkasten mVokabelkasten = bestimmeVokabelkasten();
        if (erstelleFach.getEingabeRichtig()) {
            mVokabelkasten.erzeugeFach(name);
        }
        erstelleFach.closeVokablfacheingabe();
    }

    private void erstelleVokabelkasten() {
        ErselleKasten erselleKasten = new ErselleKasten();
        String name = erselleKasten.getNameVokabelkasten();
         if (erselleKasten.getEingabeRichtig()) {
             mKasten.add(new Vokabelkasten(name, this));
         }
         erselleKasten.close();
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
    }

    private void loescheVokabelfach() {
    }

    private void loeschen() {
        mView.zeichneLoeschen();
        warteAufEvent();
        switch (cmd) {
            case "exit":
                mSpeicher.speichern(mView);
                exit(0);
            case "vokabelkasten":
                loescheVokabelkasten();
                break;
            case "vokabelfach":
                loescheVokabelfach();
                break;
            case "vokabel":
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
            case "einfuegen":
                einfuegen();
                break;
            case "loeschen":
                loeschen();
                break;
            default:
                break;
        }
    }
}
