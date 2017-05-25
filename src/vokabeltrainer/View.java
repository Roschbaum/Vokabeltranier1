package vokabeltrainer;

import static java.awt.BorderLayout.CENTER;
import static java.awt.Color.WHITE;
import java.io.Serializable;
import javax.swing.*;

public class View extends JFrame implements Serializable {

    private final SControler mController;

    private final JFrame frame = new JFrame(CENTER);

    private final int x;

    private final int y;

    public View() {
        this.mController = new SControler(this);
        x = 800;
        y = 400;
        fensterErstellen();
    }

    private void richteFrameEin() {
        frame.getContentPane().setBackground(WHITE);
        frame.setLayout(null);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setTitle("vokabeltrainer");
    }

    private void richteMenuBarein() {
        JMenuBar menuBar = new JMenuBar();
        JMenu start = new JMenu("Start");
        JMenu vokabel = new JMenu("Vokabel");
        frame.setJMenuBar(menuBar);
        menuBar.add(start);
        menuBar.add(vokabel);
        addMenueitem(start, "Exit", "exit");
        addMenueitem(vokabel, "Vokabelerstellen", "erstellen");
    }

    private void addMenueitem(JMenu meneu, String mName, String ko) {
        JMenuItem mItem = new JMenuItem(mName);
        meneu.add(mItem);
        mItem.addActionListener(mController);
        mItem.setActionCommand(ko);
        mItem.setVisible(true);
    }

    public void zeichneVokabel(Vokabel v) {
    }

    public void zeichneZusatangaben(Vokabel v) {
    }

    public void zeichneBedeutung(Vokabel v) {
    }

    public void zeige(String es_sind_keine_Vokabeln_mehr_in_dem_Fach) {
    }

    public void closeVokabeleingabe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void erstelleVokabeleingabe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getBooleanHeufig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getBooleanVokabelkasten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEingabeBedeutung() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEingabeName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEingabeZusatzangaben() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void zeichneEinfuegen() {
    }

    public void zeichneLoeschen() {
    }

    public void fensterErstellen() {
        richteFrameEin();
        richteMenuBarein();
    }

    void closeVokablfacheingabe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void erselleVokablekastenfenster() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void erstelleVokabelfacheingabe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getEingabeRichtig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNameVokabelkasten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getVokabelFachName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
