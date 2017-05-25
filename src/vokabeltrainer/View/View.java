package vokabeltrainer.View;

import static java.awt.BorderLayout.CENTER;
import static java.awt.Color.WHITE;
import java.io.Serializable;
import javax.swing.*;
import vokabeltrainer.Model.Vokabel;
import vokabeltrainer.SControler;

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

    public void zeichneEinfuegen() {
    }

    public void zeichneLoeschen() {
    }

    public void fensterErstellen() {
        richteFrameEin();
        richteMenuBarein();
    }

}
