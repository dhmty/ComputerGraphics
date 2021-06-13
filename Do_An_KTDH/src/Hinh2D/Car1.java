/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh2D;

/**
 *
 * @author dhmty
 */
import java.awt.Color;
import java.awt.Graphics;
import Diem.Diem2D;
import java.awt.image.BufferedImage;


public class Car1 {

    private java.awt.Point root;
    private BufferedImage img;
    private int ratio;
    private double y1=0; // để chỉnh vị trí
    private Color Car_Color= new Color(50,46,47);
    private java.awt.Point A, B, C, D, E, F, G, H, I, J, K, L, M, N,P, Q,M1,
            O1, O2, xP, xT;
    private DuongThang rootLine, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;

    public Car1(java.awt.Point root, BufferedImage img, int ratio) {
        this.root = root;
        this.img = img;
        this.ratio = ratio;
        Calculation();
    }

    public DuongThang getL1() {
        return l1;
    }

    public DuongThang getL2() {
        return l2;
    }

    public DuongThang getL3() {
        return l3;
    }

    public DuongThang getL4() {
        return l4;
    }

    public DuongThang getL5() {
        return l5;
    }

    public DuongThang getL6() {
        return l6;
    }

    public DuongThang getL7() {
        return l7;
    }

    public DuongThang getL8() {
        return l8;
    }

    public DuongThang getL9() {
        return l9;
    }

    public DuongThang getL10() {
        return l10;
    }

    public java.awt.Point getRoot() {
        return root;
    }

    public BufferedImage getImg() {
        return img;
    }

    public int getRatio() {
        return ratio;
    }

    public java.awt.Point getA() {
        return A;
    }

    public java.awt.Point getB() {
        return B;
    }

    public java.awt.Point getC() {
        return C;
    }

    public java.awt.Point getD() {
        return D;
    }

    public java.awt.Point getE() {
        return E;
    }

    public java.awt.Point getF() {
        return F;
    }

    public java.awt.Point getG() {
        return G;
    }

    public java.awt.Point getH() {
        return H;
    }

    public java.awt.Point getI() {
        return I;
    }

    public java.awt.Point getJ() {
        return J;
    }

    public java.awt.Point getK() {
        return K;
    }

    public java.awt.Point getL() {
        return L;
    }

    public java.awt.Point getM() {
        return M;
    }
    
    public java.awt.Point getM1() {
        return M1;
    }

    public java.awt.Point getN() {
        return N;
    }
   
    public java.awt.Point getP() {
        return P;
    }
   
    public java.awt.Point getQ() {
        return Q;
    }

    public java.awt.Point getO1() {
        return O1;
    }

    public java.awt.Point getO2() {
        return O2;
    }

    public java.awt.Point getxP() {
        return xP;
    }

    public java.awt.Point getxT() {
        return xT;
    }

    private void Calculation() {
        int x = 0, y = 0, reverse = -1;
//oke
        x = (int) Math.round(this.root.x - 2.4 * this.ratio);
        y = (int) Math.round(this.root.y - (1.5+y1) * this.ratio * reverse);
        this.A = new java.awt.Point(x, y);

        x = (int) Math.round(this.root.x - 1.3 * this.ratio);
        y = (int) Math.round(this.root.y - (1.3+y1) * this.ratio * reverse);
        this.B = new java.awt.Point(x, y);

        x = (int) Math.round(this.root.x - 0.5 * this.ratio);
        y = (int) Math.round(this.root.y - (0.8+y1) * this.ratio * reverse);
        this.C = new java.awt.Point(x, y);

        x = (int) Math.round(this.root.x + 1.1 * this.ratio);
        y = (int) Math.round(this.root.y - (0.8+y1) * this.ratio * reverse);
        this.D = new java.awt.Point(x, y);

        x = (int) Math.round(this.root.x + 1.9 * this.ratio);
        y = (int) Math.round(this.root.y - (1.3+y1) * this.ratio * reverse);
        this.E = new java.awt.Point(x, y);
//oke
        x = (int) Math.round(this.root.x + 2.2 * this.ratio);
        y = (int) Math.round(this.root.y - (1.4+y1) * this.ratio * reverse);
        this.F = new java.awt.Point(x, y);

        x = (int) Math.round(this.root.x + 2.4 * this.ratio);
        y = (int) Math.round(this.root.y - (1.9+y1) * this.ratio * reverse);
        this.G = new java.awt.Point(x, y);

        x = (int) Math.round(this.root.x + 1.8 * this.ratio);
        y = (int) Math.round(this.root.y - (2+y1) * this.ratio * reverse);
        this.H = new java.awt.Point(x, y);

        //oke
        x = (int) Math.round(this.root.x + 1.2 * this.ratio);
        y = (int) Math.round(this.root.y - (2+y1) * this.ratio * reverse);
        this.I = new java.awt.Point(x, y);

        //oke
        x = (int) Math.round(this.root.x - 1.5 * this.ratio);
        y = (int) Math.round(this.root.y - (2+y1) * this.ratio * reverse);
        this.J = new java.awt.Point(x, y);

        //oke
        x = (int) Math.round(this.root.x - 2.1 * this.ratio);
        y = (int) Math.round(this.root.y - (2+y1) * this.ratio * reverse);
        this.K = new java.awt.Point(x, y);

        //oke
        x = (int) Math.round(this.root.x - 2.5 * this.ratio);
        y = (int) Math.round(this.root.y - (2+y1) * this.ratio * reverse);
        this.L = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x - 0.3 * this.ratio);
        y = (int) Math.round(this.root.y - (1.95+y1) * this.ratio * reverse);
        this.M = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x + 0.5 * this.ratio);
        y = (int) Math.round(this.root.y - (1.3+y1) * this.ratio * reverse);
        this.N = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x + 1.1 * this.ratio);
        y = (int) Math.round(this.root.y - (1.95+y1) * this.ratio * reverse);
        this.P = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.root.x + 1.3 * this.ratio);
        y = (int) Math.round(this.root.y - (1.3+y1) * this.ratio * reverse);
        this.Q = new java.awt.Point(x, y);

        x = (int) Math.round(this.root.x - 0.3 * this.ratio);
        y = (int) Math.round(this.root.y - (0.8+y1) * this.ratio * reverse);
        this.M1 = new java.awt.Point(x, y);

       
//oke
        x = (int) Math.round(this.root.x - 1.8 * this.ratio);
        y = (int) Math.round(this.root.y - (2+y1) * this.ratio * reverse);
        this.O1 = new java.awt.Point(x, y);
//oke
        x = (int) Math.round(this.root.x + 1.5 * this.ratio);
        y = (int) Math.round(this.root.y - (2+y1) * this.ratio * reverse);
        this.O2 = new java.awt.Point(x, y);

        x = O1.x;
        y = (int) (O1.y + 0.2 * this.ratio * reverse);
        this.xP = new java.awt.Point(x, y);

        x = O2.x;
        y = (int) (O2.y + 0.2 * this.ratio * reverse);
        this.xT = new java.awt.Point(x, y);
    }

    public BufferedImage drawWheels(int key) {
        drawWheel(key, this.xP, this.O1);
        drawWheel(key, this.xT, this.O2);
        return this.img;
    }

    private void drawWheel(int key, java.awt.Point xP, java.awt.Point root) {

        //convert to Object.Point
        Diem2D xPObject = new Diem2D(xP.x, xP.y);
        Diem2D O3Object = new Diem2D(root.x, root.y);
        rootLine = new DuongThang(O3Object, xPObject);

        //calculator line
        l1 = rootLine.Rotate(root, Math.toRadians(0));
        l2 = rootLine.Rotate(root, Math.toRadians(36));
        l3 = rootLine.Rotate(root, Math.toRadians(72));
        l4 = rootLine.Rotate(root, Math.toRadians(108));
        l5 = rootLine.Rotate(root, Math.toRadians(144));
        l6 = rootLine.Rotate(root, Math.toRadians(180));
        l7 = rootLine.Rotate(root, Math.toRadians(216));
        l8 = rootLine.Rotate(root, Math.toRadians(252));
        l9 = rootLine.Rotate(root, Math.toRadians(288));
        l10 = rootLine.Rotate(root, Math.toRadians(324));

        //get value rotate
        int value;
        value = key * 24;

        //rotate
        l1 = l1.Rotate(root, Math.toRadians(value));
        l2 = l2.Rotate(root, Math.toRadians(value));
        l3 = l3.Rotate(root, Math.toRadians(value));
        l4 = l4.Rotate(root, Math.toRadians(value));
        l5 = l5.Rotate(root, Math.toRadians(value));
        l6 = l6.Rotate(root, Math.toRadians(value));
        l7 = l7.Rotate(root, Math.toRadians(value));
        l8 = l8.Rotate(root, Math.toRadians(value));
        l9 = l9.Rotate(root, Math.toRadians(value));
        l10 = l10.Rotate(root, Math.toRadians(value));

        //match
        this.img = new Ve2D(this.img).drawLine(l1.getStart().toJavaPoint(),
                l1.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l2.getStart().toJavaPoint(),
                l2.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l3.getStart().toJavaPoint(),
                l3.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l4.getStart().toJavaPoint(),
                l4.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l5.getStart().toJavaPoint(),
                l5.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l6.getStart().toJavaPoint(),
                l6.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l7.getStart().toJavaPoint(),
                l7.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l8.getStart().toJavaPoint(),
                l8.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l9.getStart().toJavaPoint(),
                l9.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l10.getStart().toJavaPoint(),
                l10.getEnd().toJavaPoint(), Color.BLACK);
    }

    public BufferedImage draw(int ratio, int key) {
        //init
        Graphics g = this.img.getGraphics();
        int reverse = -1;

        //MATCH
        this.img = new Ve2D(this.img).drawLine(this.A, this.B, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.C, this.B, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.D, this.C, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.D, this.E, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.F, this.E, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.F, this.G, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.H, this.G, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.I, this.J, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.L, this.K, Car_Color);
        this.img = new Ve2D(this.img).drawLine(this.A, this.L, Car_Color);
        //FILL oke
        int axx[] = new int[9], ayx[] = new int[9];
        axx[0] = this.A.x;
        axx[1] = this.B.x;
        axx[2] = this.C.x;
        axx[3] = this.D.x;
        axx[4] = this.E.x;
        axx[5] = this.F.x;
        axx[6] = this.G.x;
        axx[7] = this.H.x;
        axx[8] = this.L.x;
        ayx[0] = this.A.y;
        ayx[1] = this.B.y;
        ayx[2] = this.C.y;
        ayx[3] = this.D.y;
        ayx[4] = this.E.y;
        ayx[5] = this.F.y;
        ayx[6] = this.G.y;
        ayx[7] = this.H.y;
        ayx[8] = this.L.y;
        g.setColor(Car_Color);
        g.fillPolygon(axx, ayx, 9);




// vẽ các hình
        this.img = new Ve2D(this.img).drawLine(this.D, this.Q, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.B, this.E, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.M, this.M1, Color.BLACK);
        //fill
        g.setColor(new Color(35,31,32));
        g.fillRect(this.B.x,this.B.y,Math.abs(this.M.x-this.B.x), Math.abs(this.M.y-this.B.y));
        g.fillRect(this.M.x,this.B.y,Math.abs(this.M.x-this.N.x), Math.abs(this.M.y-this.N.y));
        g.fillRect(this.N.x,this.N.y,Math.abs(this.N.x-this.P.x), Math.abs(this.N.y-this.P.y));
        this.img = new Ve2D(this.img).drawRect(this.B, this.M, Color.BLACK);
        this.img = new Ve2D(this.img).drawRect(this.M, this.N, Color.BLACK);
        this.img = new Ve2D(this.img).drawRect(this.N, this.P, Color.BLACK);
        
        int axc[] = new int[4], ayc[] = new int[4];
        axc[0] = this.M.x;
        axc[1] = this.M1.x;
        axc[2] = this.D.x;
        axc[3] = this.Q.x;
        ayc[0] = this.B.y;
        ayc[1] = this.M1.y;
        ayc[2] = this.D.y;
        ayc[3] = this.Q.y;
        g.setColor(new Color(99,108,120));
        g.fillPolygon(axc, ayc, 4);

        int axcs[] = new int[4], aycs[] = new int[4];
        axcs[0] = this.B.x;
        axcs[1] = this.C.x;
        axcs[2] = this.M1.x;
        axcs[3] = this.M.x;
        aycs[0] = this.B.y;
        aycs[1] = this.C.y;
        aycs[2] = this.M1.y;
        aycs[3] = this.B.y;
        g.setColor(new Color(189,192,197));
        g.fillPolygon(axcs, aycs, 4);
//
//        this.img = new Ve2D(this.img).drawLine(this.O1, this.O2, Color.BLACK);
//        this.img = new Ve2D(this.img).drawLine(this.G1, this.C1, Color.BLACK);

// vẽ màu cho bánh xe
        this.img = new Ve2D(this.img).drawCircle(this.O1,(int) (0.3 * ratio), Color.BLACK, 1);
        this.img = new Ve2D(this.img).drawCircle(this.O1,(int) (0.2 * ratio), Color.BLACK, 1);
        this.img = new Ve2D(this.img).drawCircle(this.O1,(int) (0.05 * ratio), Color.BLACK, 1);

        g.setColor(Color.black);
        g.fillOval((int) (this.O1.x - 0.3 * ratio),
                (int) (this.O1.y + 0.3 * ratio * reverse),
                (int) (2 * 0.3 * ratio), (int) (2 * 0.3 * ratio));

        g.setColor(Color.white);
        g.fillOval((int) (this.O1.x - 0.2 * ratio),
                (int) (this.O1.y + 0.2 * ratio * reverse),
                (int) (2 * 0.2 * ratio), (int) (2 * 0.2 * ratio));

        g.setColor(Color.black);
        g.fillOval((int) (this.O1.x - 0.05 * ratio),
                (int) (this.O1.y + 0.05 * ratio * reverse),
                (int) (2 * 0.05 * ratio), (int) (2 * 0.05 * ratio));

        this.img = new Ve2D(this.img).drawCircle(this.O2, (int) (0.3 * ratio), Color.BLACK, 1);
        this.img = new Ve2D(this.img).drawCircle(this.O2, (int) (0.2 * ratio), Color.BLACK, 1);
        this.img = new Ve2D(this.img).drawCircle(this.O2, (int) (0.05 * ratio), Color.BLACK, 1);

        g.setColor(Color.black);
        g.fillOval((int) (this.O2.x - 0.3 * ratio),
                (int) (this.O2.y + 0.3 * ratio * reverse),
                (int) (2 * 0.3 * ratio), (int) (2 * 0.3 * ratio));

        g.setColor(Color.white);
        g.fillOval((int) (this.O2.x - 0.2 * ratio),
                (int) (this.O2.y + 0.2 * ratio * reverse),
                (int) (2 * 0.2 * ratio), (int) (2 * 0.2 * ratio));

        g.setColor(Color.black);
        g.fillOval((int) (this.O2.x - 0.05 * ratio),
                (int) (this.O2.y + 0.05 * ratio * reverse),
                (int) (2 * 0.05 * ratio), (int) (2 * 0.05 * ratio));

        drawWheels(key);
        return this.img;
    }
}
