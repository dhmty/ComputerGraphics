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
 * @author dhmty
 */
public class Slamp extends Shape {

    private java.awt.Point A;
    private java.awt.Point A1;
    private java.awt.Point B;
    private java.awt.Point B1;
    private java.awt.Point C;
    private java.awt.Point C1;
    private java.awt.Point D;
    private java.awt.Point D1;
    private java.awt.Point E ;
    private java.awt.Point E1;
    private java.awt.Point O1;
    private java.awt.Point O2;
    private java.awt.Point O3;
    private int R1;
    private int R23;

    public Slamp(java.awt.Point A, java.awt.Point A1,java.awt.Point B,java.awt.Point B1,java.awt.Point C,java.awt.Point C1,
            java.awt.Point D,java.awt.Point D1,java.awt.Point E,java.awt.Point E1,java.awt.Point O1,java.awt.Point O2,
            java.awt.Point O3,int R1,int R23) {
        this.A = A;
        this.A1 = A1;
        this.B = B;
        this.B1 = B1;
        this.C = C;
        this.C1 = C1;
        this.D = D;
        this.D1 = D1;
        this.E = E;
        this.E1 = E1;
        this.O1=O1;
        this.O2=O2;
        this.O3=O3;
        this.R1=R1;
        this.R23=R23;
    }

    public java.awt.Point getA() {
        return A;
    }

    public java.awt.Point getA1() {
        return A1;
    }

    public java.awt.Point getB() {
        return B;
    }

    public java.awt.Point getB1() {
        return B1;
    }

    public java.awt.Point getC() {
        return C;
    }

    public java.awt.Point getC1() {
        return C1;
    }

    public java.awt.Point getD() {
        return D;
    }

    public java.awt.Point getD1() {
        return D1;
    }

    public java.awt.Point getE() {
        return E;
    }

    public java.awt.Point getE1() {
        return E1;
    }

    public java.awt.Point getO1() {
        return O1;
    }

    public java.awt.Point getO2() {
        return O2;
    }

    public java.awt.Point getO3() {
        return O3;
    }

    public int getR1() {
        return R1;
    }

    public int getR23() {
        return R23;
    }

    public void setA(java.awt.Point A) {
        this.A = A;
    }

    public void setA1(java.awt.Point A1) {
        this.A1 = A1;
    }

    public void setB(java.awt.Point B) {
        this.B = B;
    }

    public void setB1(java.awt.Point B1) {
        this.B1 = B1;
    }

    public void setC(java.awt.Point C) {
        this.C = C;
    }

    public void setC1(java.awt.Point C1) {
        this.C1 = C1;
    }

    public void setD(java.awt.Point D) {
        this.D = D;
    }

    public void setD1(java.awt.Point D1) {
        this.D1 = D1;
    }

    public void setE(java.awt.Point E) {
        this.E = E;
    }

    public void setE1(java.awt.Point E1) {
        this.E1 = E1;
    }

    public void setO1(java.awt.Point O1) {
        this.O1 = O1;
    }

    public void setO2(java.awt.Point O2) {
        this.O2 = O2;
    }

    public void setO3(java.awt.Point O3) {
        this.O3 = O3;
    }

    public void setR1(int R1) {
        this.R1 = R1;
    }

    public void setR23(int R23) {
        this.R23 = R23;
    }

    //shifting this point with distance Sx, Sy
    @Override
    public Slamp Shifting(int Sx, int Sy) {
        //shifting
        java.awt.Point A = new Diem2D(this.A.x, this.A.y).Shifting(Sx, Sy);
        java.awt.Point A1 = new Diem2D(this.A1.x, this.A1.y).Shifting(Sx, Sy);
        java.awt.Point B = new Diem2D(this.B.x, this.B.y).Shifting(Sx, Sy);
        java.awt.Point B1 = new Diem2D(this.B1.x, this.B1.y).Shifting(Sx, Sy);
        java.awt.Point C = new Diem2D(this.B.x, this.B.y).Shifting(Sx, Sy);
        java.awt.Point C1 = new Diem2D(this.C1.x, this.C1.y).Shifting(Sx, Sy);
        java.awt.Point D = new Diem2D(this.D.x, this.D.y).Shifting(Sx, Sy);
        java.awt.Point D1 = new Diem2D(this.D1.x, this.D1.y).Shifting(Sx, Sy);
        java.awt.Point E = new Diem2D(this.E.x, this.E.y).Shifting(Sx, Sy);
        java.awt.Point E1 = new Diem2D(this.E1.x, this.E1.y).Shifting(Sx, Sy);
        java.awt.Point O1 = new Diem2D(this.O1.x, this.O1.y).Shifting(Sx, Sy);
        java.awt.Point O2 = new Diem2D(this.O2.x, this.O2.y).Shifting(Sx, Sy);
        java.awt.Point O3 = new Diem2D(this.O3.x, this.O3.y).Shifting(Sx, Sy);
        return new Slamp(A,A1,B,B1,C,C1,D,D1,E,E1,O1,O2,O3,R1,R23);
    }
}
