/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh2D;

import Diem.Diem2D;
import Diem.Shape;
import java.awt.Point;

/**
 *
 * @author Welcome
 */
public class DuongThang extends Shape {

    public Diem2D getStart() {
        return start;
    }

    public void setStart(Diem2D start) {
        this.start = start;
    }

    public Diem2D getEnd() {
        return end;
    }

    public void setEnd(Diem2D end) {
        this.end = end;
    }

    private Diem2D start;
    private Diem2D end;

    public DuongThang(Diem2D start, Diem2D end) {
        this.start = start;
        this.end = end;
    }

    //scale this line with the root point as the start point
    @Override
    public DuongThang Scale(java.awt.Point goc, float tile) {
        //scale
        Point nDau = new Diem2D(this.start.getX(), this.start.getY()).Scale(goc, tile);
        Point nCuoi = new Diem2D(this.end.getX(), this.end.getY()).Scale(goc, tile);
        
        //Chuyển java.awt.Diem2D to Diem2D(Object)
        Diem2D nS = new Diem2D(nDau.x, nDau.y);
        Diem2D nE = new Diem2D(nCuoi.x, nCuoi.y);
        return new DuongThang(nS, nE);
    }

    //shifting this line with distance Sx, Sy
    @Override
    public DuongThang Shifting(int Sx, int Sy) {
        //shifting
        Point nDau = new Diem2D(this.start.getX(), this.start.getY()).Shifting(Sx, Sy);
        Point nCuoi = new Diem2D(this.end.getX(), this.end.getY()).Shifting(Sx, Sy);
        
        //convert java.awt.Diem2D to Diem2D(Object)
        Diem2D nS = new Diem2D(nDau.x, nDau.y);
        Diem2D nE = new Diem2D(nCuoi.x, nCuoi.y);
        return new DuongThang(nS, nE);
    }

    //quay tại điểm 
    @Override
    public DuongThang Rotate(Point goc, double alpha) {
        //rotate
       Point nCuoi = new Diem2D(this.end.getX(), this.end.getY()).Rotate(goc, alpha);
       Point nDau = new Diem2D(this.start.getX(), this.start.getY()).Rotate(goc, alpha);
        
        //convert java.awt.Diem2D to Diem2D(Object)
        Diem2D nS = new Diem2D(nDau.x, nDau.y);
        Diem2D nE = new Diem2D(nCuoi.x, nCuoi.y);
        return new DuongThang(nS, nE);
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + start + ", end=" + end + '}';
    }

}
