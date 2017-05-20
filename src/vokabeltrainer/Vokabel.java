package vokabeltrainer;

import java.io.Serializable;

/**
 * @author Friedrich
 */
public class Vokabel implements Serializable {

    private String mName;

    private String bedeutung;

    private String zusatsAngaben;

    private Double richtig;

    private Double aufrufe = 0.0;

    private boolean vokabelkasten;

    private boolean heufig;

    /**
     * @param mName
     * @param bedeutung
     * @param zusatsAngaben
     * @param vokabelkasten
     * @param heufig
     */
    public Vokabel(String mName, String bedeutung, String zusatsAngaben, boolean vokabelkasten, boolean heufig) {
        this.richtig = 0.0;
        this.mName = mName;
        this.bedeutung = bedeutung;
        this.zusatsAngaben = zusatsAngaben;
        this.vokabelkasten = vokabelkasten;
        this.heufig = heufig;
    }

    /**
     *
     * @return heufig
     */
    public boolean isHeufig() {
        return heufig;
    }

    /**
     *
     * @return Nme der Vokabel
     */
    public String getmName() {
        return mName;
    }

    /**
     * Setzwn des Wertes heufig
     *
     * @param heufig neuuer Wert
     */
    public void setHeufig(boolean heufig) {
        this.heufig = heufig;
    }

    /**
     * Gibt die Bedeutung der Vokabel zurück
     *
     * @return
     */
    public String getBedeutung() {
        return bedeutung;
    }

    /**
     * Gibt die zusazangaben der Vokabel zurück.
     *
     * @return
     */
    public String getZusatsAngaben() {
        return zusatsAngaben;
    }

    /**
     *  Anzahl der richtigen beantwortungen werden zurückgegeben.
     * @return anzahl der Antworten
     */
    public Double getRichtig() {
        return richtig;
    }

    /**
     * Anzajl der Aufrufe wird zurückgegeben.
     * @return
     */
    public Double getAufrufe() {
        return aufrufe;
    }
    /**
     * gibtzurück ob sich die Vokabel in eiem Vokabelkasten befindet
     * @return
     */
    public boolean isVokabelkasten() {
        return vokabelkasten;
    }

    /**
     * Bestimmt ob sich die Vokabel un eiem Vokabelkasten befindet.
     * @param vokabelkasten
     */
    public void setVokabelkasten(boolean vokabelkasten) {
        this.vokabelkasten = vokabelkasten;
    }

    /**
     * Gibt den Durchschnit der richtigen Antworten für die Vokabel wieders.
     * @return
     */
    public Double gibdurchscnitt() {
        if (aufrufe != 0.0) {
            return richtig / aufrufe * 100;
        }
        return -1.0;
    }
}
