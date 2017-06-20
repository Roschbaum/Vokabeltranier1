/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainer.Model;

import java.util.TreeMap;

/**
 *
 * @author Friedrich
 */
public class VokabelmitGleichemNamen {

    private String mName;
    private TreeMap<String, Vokabel> mVokabeln;

    public VokabelmitGleichemNamen(String mName) {
        this.mName = mName;
        mVokabeln = new TreeMap<>();
    }

    public String getmName() {
        return mName;
    }

    boolean add(Vokabel nVokabel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
