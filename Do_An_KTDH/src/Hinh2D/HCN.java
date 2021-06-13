/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh2D;

import Diem.Diem2D;
import Diem.Shape;

/**
 *
 * @author Welcome
 */
public class HCN extends Shape {

    private java.awt.Point rootS;
    private java.awt.Point rootE;

    public HCN(java.awt.Point rootS, java.awt.Point rootE) {
        this.rootS = rootS;
        this.rootE = rootE;
    }

    public java.awt.Point getRootS() {
        return rootS;
    }

    public void setRootS(java.awt.Point rootS) {
        this.rootS = rootS;
    }

    public java.awt.Point getRootE() {
        return rootE;
    }

    public void setRootE(java.awt.Point rootE) {
        this.rootE = rootE;
    }

    //shifting this point with distance Sx, Sy
    @Override
    public HCN Shifting(int Sx, int Sy) {
        //shifting
        java.awt.Point nRootS = new Diem2D(this.rootS.x, this.rootS.y).Shifting(Sx, Sy);
        java.awt.Point nRootE = new Diem2D(this.rootE.x, this.rootE.y).Shifting(Sx, Sy);
        return new HCN(nRootS, nRootE);
    }

}
