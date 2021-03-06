/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author Welcome
 */
public class RoadMarking {

    private BufferedImage img;
    private java.awt.Point root;
    private int ratio;
    private HCN r1, r2, r3, r4, r5, r6, r7;

    public RoadMarking(BufferedImage img, Point root, int ratio) {
        this.img = img;
        this.root = root;
        this.ratio = ratio;
        Calculation();
    }

    public HCN getR1() {
        return r1;
    }

    public HCN getR2() {
        return r2;
    }

    public HCN getR3() {
        return r3;
    }

    public HCN getR4() {
        return r4;
    }

    public HCN getR5() {
        return r5;
    }

    public HCN getR6() {
        return r6;
    }

    public HCN getR7() {
        return r7;
    }

    private void Calculation() {
        java.awt.Point W1s, W2s, W3s, W4s, W5s, W6s, W7s, W1e, W2e, W3e, W4e, W5e, W6e, W7e;
        int x = 0, y = 0, reverse = -1;
// xác định vị trí của các thanh
        x = (int) Math.round(this.root.x - 6 * this.ratio);
        y = (int) Math.round(this.root.y - 2.4 * this.ratio * reverse);
        W1s = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 4 * this.ratio);
        y = (int) Math.round(this.root.y - 2.4 * this.ratio * reverse);
        W2s = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 2 * this.ratio);
        y = (int) Math.round(this.root.y - 2.4 * this.ratio * reverse);
        W3s = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x);
        y = (int) Math.round(this.root.y - 2.4 * this.ratio * reverse);
        W4s = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x + 2 * this.ratio);
        y = (int) Math.round(this.root.y - 2.4 * this.ratio * reverse);
        W5s = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x + 4 * this.ratio);
        y = (int) Math.round(this.root.y - 2.4 * this.ratio * reverse);
        W6s = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x + 6 * this.ratio);
        y = (int) Math.round(this.root.y - 2.4 * this.ratio * reverse);
        W7s = new java.awt.Point(x, y);

        W1e = new java.awt.Point((int) (W1s.x + 1.2 * this.ratio), 
                (int) (W1s.y - 0.2 * this.ratio * reverse));
        W2e = new java.awt.Point((int) (W2s.x + 1.2 * this.ratio), 
                (int) (W2s.y - 0.2 * this.ratio * reverse));
        W3e = new java.awt.Point((int) (W3s.x + 1.2 * this.ratio), 
                (int) (W3s.y - 0.2 * this.ratio * reverse));
        W4e = new java.awt.Point((int) (W4s.x + 1.2 * this.ratio), 
                (int) (W4s.y - 0.2 * this.ratio * reverse));
        W5e = new java.awt.Point((int) (W5s.x + 1.2 * this.ratio), 
                (int) (W5s.y - 0.2 * this.ratio * reverse));
        W6e = new java.awt.Point((int) (W6s.x + 1.2 * this.ratio), 
                (int) (W6s.y - 0.2 * this.ratio * reverse));
        W7e = new java.awt.Point((int) (W7s.x + 1.2 * this.ratio), 
                (int) (W7s.y - 0.2 * this.ratio * reverse));

        //init
        r1 = new HCN(W1s, W1e);
        r2 = new HCN(W2s, W2e);
        r3 = new HCN(W3s, W3e);
        r4 = new HCN(W4s, W4e);
        r5 = new HCN(W5s, W5e);
        r6 = new HCN(W6s, W6e);
        r7 = new HCN(W7s, W7e);
    }

    public BufferedImage drawRoadMarking(int key) {
        //init
        Graphics g = this.img.getGraphics();

        //get Sx
        int Sx = (int) (0.2 * key * this.ratio);

        //Shifting
        this.r1 = new HCN(this.r1.getRootS(), this.r1.getRootE()).Shifting(Sx, 0);
        this.r2 = new HCN(this.r2.getRootS(), this.r2.getRootE()).Shifting(Sx, 0);
        this.r3 = new HCN(this.r3.getRootS(), this.r3.getRootE()).Shifting(Sx, 0);
        this.r4 = new HCN(this.r4.getRootS(), this.r4.getRootE()).Shifting(Sx, 0);
        this.r5 = new HCN(this.r5.getRootS(), this.r5.getRootE()).Shifting(Sx, 0);
        this.r6 = new HCN(this.r6.getRootS(), this.r6.getRootE()).Shifting(Sx, 0);
        this.r7 = new HCN(this.r7.getRootS(), this.r7.getRootE()).Shifting(Sx, 0);
        
        //draw
       this.img = new Ve2D(this.img).drawRect(this.r1.getRootS(), 
              this.r1.getRootE(), Color.WHITE);
        this.img = new Ve2D(this.img).drawRect(this.r2.getRootS(), 
                this.r2.getRootE(), Color.WHITE);
        this.img = new Ve2D(this.img).drawRect(this.r3.getRootS(), 
                this.r3.getRootE(), Color.WHITE);
        this.img = new Ve2D(this.img).drawRect(this.r4.getRootS(), 
                this.r4.getRootE(), Color.WHITE);
        this.img = new Ve2D(this.img).drawRect(this.r5.getRootS(), 
                this.r5.getRootE(), Color.WHITE);
        this.img = new Ve2D(this.img).drawRect(this.r6.getRootS(), 
                this.r6.getRootE(), Color.WHITE);
        this.img = new Ve2D(this.img).drawRect(this.r7.getRootS(), 
                this.r7.getRootE(), Color.WHITE);
        
        // xác định chiều dài và rộng của rect
        double dai=(double)Math.abs(this.r1.getRootS().x-this.r1.getRootE().x)/100;
        double rong=(double)Math.abs(this.r1.getRootS().y-this.r1.getRootE().y)/100;
        
        //fill
        g.fillRect(this.r1.getRootS().x, this.r1.getRootS().y, 
                (int) (dai * this.ratio), (int) (rong * this.ratio));
        g.fillRect(this.r2.getRootS().x, this.r2.getRootS().y, 
                (int) (dai * this.ratio), (int) (rong * this.ratio));
        g.fillRect(this.r3.getRootS().x, this.r3.getRootS().y, 
                (int) (dai * this.ratio), (int) (rong * this.ratio));
        g.fillRect(this.r4.getRootS().x, this.r4.getRootS().y, 
                (int) (dai * this.ratio), (int) (rong * this.ratio));
        g.fillRect(this.r5.getRootS().x, this.r5.getRootS().y, 
                (int) (dai * this.ratio), (int) (rong * this.ratio));
        g.fillRect(this.r6.getRootS().x, this.r6.getRootS().y, 
                (int) (dai * this.ratio), (int) (rong * this.ratio));
        g.fillRect(this.r7.getRootS().x, this.r7.getRootS().y, 
                (int) (dai * this.ratio), (int) (rong * this.ratio));
        
        return this.img;
    }
}
