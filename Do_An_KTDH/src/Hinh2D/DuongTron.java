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
public class DuongTron extends Shape{
    private Diem2D root;
    private int r;

    public DuongTron(Diem2D root, int r) {
        this.root = root;
        this.r = r;
    }

}
