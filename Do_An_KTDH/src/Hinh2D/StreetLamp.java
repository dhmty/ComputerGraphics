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
 * @author dhmty
 */
public class StreetLamp {
    private BufferedImage img;
    private java.awt.Point root;
    private int ratio;
    private Slamp r1, r2, r3, r4, r5, r6, r7;
    private int R1=20;
    private int R23=10;
    public StreetLamp(BufferedImage img, Point root, int ratio) {
        this.img = img;
        this.root = root;
        this.ratio = ratio;
        Calculation();
    }

    public Slamp getR1() {
        return r1;
    }

    public Slamp getR2() {
        return r2;
    }

    public Slamp getR3() {
        return r3;
    }

    public Slamp getR4() {
        return r4;
    }

    public Slamp getR5() {
        return r5;
    }

    public Slamp getR6() {
        return r6;
    }

    public Slamp getR7() {
        return r7;
    }


   private void Calculation() {
        java.awt.Point A, A1, B, B1, C, C1, D,D1, E, E1, O1, O2, O3;
        int x = 0, y = 0, reverse = -1;
// xác định vị trí của các thanh
        x = (int) Math.round(this.root.x - 1.2 * this.ratio);
        y = (int) Math.round(this.root.y - 1 * this.ratio * reverse);
        A = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 1 * this.ratio);
        y = (int) Math.round(this.root.y - 0.2 * this.ratio * reverse);
        A1 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 1.2 * this.ratio);
        y = (int) Math.round(this.root.y - 0.4 * this.ratio * reverse);
        B = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 2.2 * this.ratio);
        y = (int) Math.round(this.root.y - 0.3 * this.ratio * reverse);
        B1 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 1 * this.ratio);
        y = (int) Math.round(this.root.y - 0.4 * this.ratio * reverse);
        C = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 0 * this.ratio);
        y = (int) Math.round(this.root.y - 0.3 * this.ratio * reverse);
        C1 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 1.7 * this.ratio);
        y = (int) Math.round(this.root.y - 0.35 * this.ratio * reverse);
        D = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 1.2 * this.ratio);
        y = (int) Math.round(this.root.y - 0.3 * this.ratio * reverse);
        D1 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 0.5 * this.ratio);
        y = (int) Math.round(this.root.y - 0.35 * this.ratio * reverse);
        E = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 1 * this.ratio);
        y = (int) Math.round(this.root.y - 0.3 * this.ratio * reverse);
        E1 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 1.1 * this.ratio);
        y = (int) Math.round(this.root.y - 0.15 * this.ratio * reverse);
        O1 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 2.7 * this.ratio);
        y = (int) Math.round(this.root.y - 0.25 * this.ratio * reverse);
        O2 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x + 1 * this.ratio);
        y = (int) Math.round(this.root.y - 0.25 * this.ratio * reverse);
        O3 = new java.awt.Point(x, y);
        
        
        
        
//        W1e = new java.awt.Point((int) (W1s.x + 1.2 * this.ratio), 
//                (int) (W1s.y - 0.2 * this.ratio * reverse));
//        W2e = new java.awt.Point((int) (W2s.x + 1.2 * this.ratio), 
//                (int) (W2s.y - 0.2 * this.ratio * reverse));
//        W3e = new java.awt.Point((int) (W3s.x + 1.2 * this.ratio), 
//                (int) (W3s.y - 0.2 * this.ratio * reverse));
//        W4e = new java.awt.Point((int) (W4s.x + 1.2 * this.ratio), 
//                (int) (W4s.y - 0.2 * this.ratio * reverse));
//        W5e = new java.awt.Point((int) (W5s.x + 1.2 * this.ratio), 
//                (int) (W5s.y - 0.2 * this.ratio * reverse));
//        W6e = new java.awt.Point((int) (W6s.x + 1.2 * this.ratio), 
//                (int) (W6s.y - 0.2 * this.ratio * reverse));
//        W7e = new java.awt.Point((int) (W7s.x + 1.2 * this.ratio), 
//                (int) (W7s.y - 0.2 * this.ratio * reverse));

        //init
        r1 = new Slamp(A,A1,B,B1,C,C1,D,D1,E,E1,O1,O2,O3,R1,R23);
 //       r2 = new Rect(W2s, W2e);
//        r3 = new Rect(W3s, W3e);
//        r4 = new Rect(W4s, W4e);
//        r5 = new Rect(W5s, W5e);
//        r6 = new Rect(W6s, W6e);
//        r7 = new Rect(W7s, W7e);
    }
//
   public BufferedImage drawStreetLamp(int key) {
//        //init
       Graphics g = this.img.getGraphics();
//
//        //get Sx
//        int Sx = (int) (0.2 * key * this.ratio);

        //Shifting
 //       this.r1 = new Rect(this.r1.getRootS(), this.r1.getRootE()).Shifting(Sx, 0);
 //       this.r2 = new Rect(this.r2.getRootS(), this.r2.getRootE()).Shifting(Sx, 0);
//        this.r3 = new Rect(this.r3.getRootS(), this.r3.getRootE()).Shifting(Sx, 0);
//        this.r4 = new Rect(this.r4.getRootS(), this.r4.getRootE()).Shifting(Sx, 0);
//        this.r5 = new Rect(this.r5.getRootS(), this.r5.getRootE()).Shifting(Sx, 0);
//        this.r6 = new Rect(this.r6.getRootS(), this.r6.getRootE()).Shifting(Sx, 0);
//        this.r7 = new Rect(this.r7.getRootS(), this.r7.getRootE()).Shifting(Sx, 0);
        
        //draw Slamp trong draw 2d 
      this.img = new Ve2D(this.img).drawSlamp(this.r1.getA(),this.r1.getA1(),this.r1.getB(),this.r1.getB1(),
               this.r1.getC(),this.r1.getC1(),this.r1.getD(),this.r1.getD1(),
              this.r1.getE(),this.r1.getE1(),this.r1.getO1(),this.r1.getO2(),this.r1.getO3(),R1,R23,Color.red);
//        this.img = new Ve2D(this.img).drawRect(this.r2.getRootS(), 
//                this.r2.getRootE(), Color.WHITE);
//        this.img = new Ve2D(this.img).drawRect(this.r3.getRootS(), 
//                this.r3.getRootE(), Color.WHITE);
//        this.img = new Ve2D(this.img).drawRect(this.r4.getRootS(), 
//                this.r4.getRootE(), Color.WHITE);
//        this.img = new Ve2D(this.img).drawRect(this.r5.getRootS(), 
//                this.r5.getRootE(), Color.WHITE);
//        this.img = new Ve2D(this.img).drawRect(this.r6.getRootS(), 
//                this.r6.getRootE(), Color.WHITE);
//        this.img = new Ve2D(this.img).drawRect(this.r7.getRootS(), 
//                this.r7.getRootE(), Color.WHITE);
        
        
        
        //viết một hàm fill riêng với đối số vào là một graphic và một slamp
        // xác định chiều dài và rộng của rect
//        double dai=(double)Math.abs(this.r1.getRootS().x-this.r1.getRootE().x)/100;
//        double rong=(double)Math.abs(this.r1.getRootS().y-this.r1.getRootE().y)/100;
//        
//        //fill
//        g.fillRect(this.r1.getRootS().x, this.r1.getRootS().y, 
//                (int) (dai * this.ratio), (int) (rong * this.ratio));
//        g.fillRect(this.r2.getRootS().x, this.r2.getRootS().y, 
//                (int) (dai * this.ratio), (int) (rong * this.ratio));
//        g.fillRect(this.r3.getRootS().x, this.r3.getRootS().y, 
//                (int) (dai * this.ratio), (int) (rong * this.ratio));
//        g.fillRect(this.r4.getRootS().x, this.r4.getRootS().y, 
//                (int) (dai * this.ratio), (int) (rong * this.ratio));
//        g.fillRect(this.r5.getRootS().x, this.r5.getRootS().y, 
//                (int) (dai * this.ratio), (int) (rong * this.ratio));
//        g.fillRect(this.r6.getRootS().x, this.r6.getRootS().y, 
//                (int) (dai * this.ratio), (int) (rong * this.ratio));
//        g.fillRect(this.r7.getRootS().x, this.r7.getRootS().y, 
//                (int) (dai * this.ratio), (int) (rong * this.ratio));
        
       return this.img;
    }
    
}
