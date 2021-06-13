/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh2D;

import java.awt.Color;
import java.awt.Graphics;
import Diem.Diem2D;
import java.awt.Font;
import java.awt.image.BufferedImage;
/**
 *
 * @author ADMIN
 */
public class Bus {
     private java.awt.Point goc;
    private BufferedImage img;
    private int tile;
    private java.awt.Point A, B, C, D, E, F, G, H, I, J, K, L, M, N, A1, B1, C1,
            D1, E1, F1, G1, O1, O2, O3, O4, xP, xT;
    private  java.awt.Point N1,N2,N3,N4,N5,N6,N7,N8,N9,N10; 
    private DuongThang rootLine, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;

    public Bus(java.awt.Point goc, BufferedImage img, int tile) {
        this.goc = goc;
        this.img = img;
        this.tile = tile;
        Calculation();
    }

    public java.awt.Point getGoc() {
        return goc;
    }

    public void setGoc(java.awt.Point goc) {
        this.goc = goc;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public int getTile() {
        return tile;
    }

    public void setTile(int tile) {
        this.tile = tile;
    }

    public java.awt.Point getA() {
        return A;
    }

    public void setA(java.awt.Point A) {
        this.A = A;
    }

    public java.awt.Point getB() {
        return B;
    }

    public void setB(java.awt.Point B) {
        this.B = B;
    }

    public java.awt.Point getC() {
        return C;
    }

    public void setC(java.awt.Point C) {
        this.C = C;
    }

    public java.awt.Point getD() {
        return D;
    }

    public void setD(java.awt.Point D) {
        this.D = D;
    }

    public java.awt.Point getE() {
        return E;
    }

    public void setE(java.awt.Point E) {
        this.E = E;
    }

    public java.awt.Point getF() {
        return F;
    }

    public void setF(java.awt.Point F) {
        this.F = F;
    }

    public java.awt.Point getG() {
        return G;
    }

    public void setG(java.awt.Point G) {
        this.G = G;
    }

    public java.awt.Point getH() {
        return H;
    }

    public void setH(java.awt.Point H) {
        this.H = H;
    }

    public java.awt.Point getI() {
        return I;
    }

    public void setI(java.awt.Point I) {
        this.I = I;
    }

    public java.awt.Point getJ() {
        return J;
    }

    public void setJ(java.awt.Point J) {
        this.J = J;
    }

    public java.awt.Point getK() {
        return K;
    }

    public void setK(java.awt.Point K) {
        this.K = K;
    }

    public java.awt.Point getL() {
        return L;
    }

    public void setL(java.awt.Point L) {
        this.L = L;
    }

    public java.awt.Point getM() {
        return M;
    }

    public void setM(java.awt.Point M) {
        this.M = M;
    }

    public java.awt.Point getN() {
        return N;
    }

    public void setN(java.awt.Point N) {
        this.N = N;
    }

    public java.awt.Point getA1() {
        return A1;
    }

    public void setA1(java.awt.Point A1) {
        this.A1 = A1;
    }

    public java.awt.Point getB1() {
        return B1;
    }

    public void setB1(java.awt.Point B1) {
        this.B1 = B1;
    }

    public java.awt.Point getC1() {
        return C1;
    }

    public void setC1(java.awt.Point C1) {
        this.C1 = C1;
    }

    public java.awt.Point getD1() {
        return D1;
    }

    public void setD1(java.awt.Point D1) {
        this.D1 = D1;
    }

    public java.awt.Point getE1() {
        return E1;
    }

    public void setE1(java.awt.Point E1) {
        this.E1 = E1;
    }

    public java.awt.Point getF1() {
        return F1;
    }

    public void setF1(java.awt.Point F1) {
        this.F1 = F1;
    }

    public java.awt.Point getG1() {
        return G1;
    }

    public void setG1(java.awt.Point G1) {
        this.G1 = G1;
    }

    public java.awt.Point getO1() {
        return O1;
    }

    public void setO1(java.awt.Point O1) {
        this.O1 = O1;
    }

    public java.awt.Point getO2() {
        return O2;
    }

    public void setO2(java.awt.Point O2) {
        this.O2 = O2;
    }

    public java.awt.Point getO3() {
        return O3;
    }

    public void setO3(java.awt.Point O3) {
        this.O3 = O3;
    }

    public java.awt.Point getO4() {
        return O4;
    }

    public void setO4(java.awt.Point O4) {
        this.O4 = O4;
    }

    public java.awt.Point getxP() {
        return xP;
    }

    public void setxP(java.awt.Point xP) {
        this.xP = xP;
    }

    public java.awt.Point getxT() {
        return xT;
    }

    public void setxT(java.awt.Point xT) {
        this.xT = xT;
    }

    public java.awt.Point getN1() {
        return N1;
    }

    public void setN1(java.awt.Point N1) {
        this.N1 = N1;
    }

    public java.awt.Point getN2() {
        return N2;
    }

    public void setN2(java.awt.Point N2) {
        this.N2 = N2;
    }

    public java.awt.Point getN3() {
        return N3;
    }

    public void setN3(java.awt.Point N3) {
        this.N3 = N3;
    }

    public java.awt.Point getN4() {
        return N4;
    }

    public void setN4(java.awt.Point N4) {
        this.N4 = N4;
    }

    public java.awt.Point getN5() {
        return N5;
    }

    public void setN5(java.awt.Point N5) {
        this.N5 = N5;
    }

    public java.awt.Point getN6() {
        return N6;
    }

    public void setN6(java.awt.Point N6) {
        this.N6 = N6;
    }

    public java.awt.Point getN7() {
        return N7;
    }

    public void setN7(java.awt.Point N7) {
        this.N7 = N7;
    }

    public java.awt.Point getN8() {
        return N8;
    }

    public void setN8(java.awt.Point N8) {
        this.N8 = N8;
    }

    public java.awt.Point getN9() {
        return N9;
    }

    public void setN9(java.awt.Point N9) {
        this.N9 = N9;
    }

    public java.awt.Point getN10() {
        return N10;
    }

    public void setN10(java.awt.Point N10) {
        this.N10 = N10;
    }

    public DuongThang getRootLine() {
        return rootLine;
    }

    public void setRootLine(DuongThang rootLine) {
        this.rootLine = rootLine;
    }

    public DuongThang getL1() {
        return l1;
    }

    public void setL1(DuongThang l1) {
        this.l1 = l1;
    }

    public DuongThang getL2() {
        return l2;
    }

    public void setL2(DuongThang l2) {
        this.l2 = l2;
    }

    public DuongThang getL3() {
        return l3;
    }

    public void setL3(DuongThang l3) {
        this.l3 = l3;
    }

    public DuongThang getL4() {
        return l4;
    }

    public void setL4(DuongThang l4) {
        this.l4 = l4;
    }

    public DuongThang getL5() {
        return l5;
    }

    public void setL5(DuongThang l5) {
        this.l5 = l5;
    }

    public DuongThang getL6() {
        return l6;
    }

    public void setL6(DuongThang l6) {
        this.l6 = l6;
    }

    public DuongThang getL7() {
        return l7;
    }

    public void setL7(DuongThang l7) {
        this.l7 = l7;
    }

    public DuongThang getL8() {
        return l8;
    }

    public void setL8(DuongThang l8) {
        this.l8 = l8;
    }

    public DuongThang getL9() {
        return l9;
    }

    public void setL9(DuongThang l9) {
        this.l9 = l9;
    }

    public DuongThang getL10() {
        return l10;
    }

    public void setL10(DuongThang l10) {
        this.l10 = l10;
    }
    
    
    private void Calculation(){
        
        int x=0,y=0;
        int dao=-1;
        
        x = (int) Math.round(this.goc.x - 2* this.tile);
        y = (int) Math.round(this.goc.y + 0.9 * this.tile *dao);
        this.A = new java.awt.Point(x, y);
        
        
        x = (int) Math.round(this.goc.x + 2.45 * this.tile);
        y = (int) Math.round(this.goc.y + 0.9 * this.tile*dao);
        this.B = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x +2.8 * this.tile);
        y = (int) Math.round(this.goc.y);
        this.C = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 3.2 * this.tile);
        y = (int) Math.round(this.goc.y);
        this.D = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 3.3 * this.tile);
        y = (int) Math.round(this.goc.y - 0.15 * this.tile*dao);
        this.E = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 3.35 * this.tile);
        y = (int) Math.round(this.goc.y - 0.4 * this.tile*dao);
        this.F = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 3.35 * this.tile);
        y = (int) Math.round(this.goc.y - 0.8 * this.tile*dao);
        this.G = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 2.6 * this.tile);
        y = (int) Math.round(this.goc.y - 0.8 * this.tile*dao);
        this.H = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x +2.2 * this.tile);
        y = (int) Math.round(this.goc.y - 0.8 * this.tile*dao);
        this.I = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 1.5 * this.tile);
        y = (int) Math.round(this.goc.y - 0.8 * this.tile*dao);
        this.J = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 1.8 * this.tile);
        y = (int) Math.round(this.goc.y - 0.8 * this.tile*dao);
        this.K = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 2.4 * this.tile);
        y = (int) Math.round(this.goc.y - 0.8 * this.tile*dao);
        this.L = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 2.5 * this.tile);
        y = (int) Math.round(this.goc.y - 0.4 * this.tile*dao);
        this.M = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 2.5 * this.tile);
        y = (int) Math.round(this.goc.y);
        this.N = new java.awt.Point(x, y);
         
        // Tính toạ độ đg chia cửa 
        
        x = (int) Math.round(this.goc.x+ 1.8*this.tile);
        y = (int) Math.round(this.goc.y + 0.7* this.tile*dao);
        this.O1 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x+1.8*this.tile);
        y = (int) Math.round(this.goc.y );
        this.O2 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 1.5 * this.tile);
        y = (int) Math.round(this.goc.y - 0.8 * this.tile*dao);
        this.O3 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 2.5 * this.tile);
        y = (int) Math.round(this.goc.y - 0.8 * this.tile*dao);
        this.O4 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 1.9 * this.tile);
        y = (int) Math.round(this.goc.y + 0.7 * this.tile*dao);
        this.A1 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 2.3 * this.tile);
        y = (int) Math.round(this.goc.y + 0.7 * this.tile*dao);
        this.B1 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 2.55 * this.tile);
        y = (int) Math.round(this.goc.y);
        this.C1 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x + 2.55 * this.tile);
        y = (int) Math.round(this.goc.y - 0.4* this.tile*dao);
        this.D1 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 2.3 * this.tile);
        y = (int) Math.round(this.goc.y - 0.4 * this.tile*dao);
        this.E1 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 2.3 * this.tile);
        y = (int) Math.round(this.goc.y - 0.3 * this.tile*dao);
        this.F1 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x - 2.25 * this.tile);
        y = (int) Math.round(this.goc.y);
        this.G1 = new java.awt.Point(x, y);

        x = O3.x;
        y = (int) (O3.y + 0.2 * this.tile * dao);
        this.xP = new java.awt.Point(x, y);

        x = O4.x;
        y = (int) (O4.y + 0.2 * this.tile*dao);
        this.xT = new java.awt.Point(x, y);
        // tính song cửa 
        x = (int) Math.round(this.goc.x+ 1.2*this.tile);
        y = (int) Math.round(this.goc.y + 0.7* this.tile*dao);
        this.N1 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x+1.2*this.tile);
        y = (int) Math.round(this.goc.y -0.4* this.tile*dao);
        this.N2 = new java.awt.Point(x, y);
       
        x = (int) Math.round(this.goc.x+ 0.5*this.tile);
        y = (int) Math.round(this.goc.y + 0.7* this.tile*dao);
        this.N3 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x+0.5*this.tile);
        y = (int) Math.round(this.goc.y );
        this.N4 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.goc.x-0.2*this.tile);
        y = (int) Math.round(this.goc.y + 0.7* this.tile*dao);
        this.N5 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x -0.2*this.tile);
        y = (int) Math.round(this.goc.y );
        this.N6 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.goc.x-1*this.tile);
        y = (int) Math.round(this.goc.y + 0.7* this.tile*dao);
        this.N7 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x-1*this.tile);
        y = (int) Math.round(this.goc.y -0.4* this.tile*dao);
        this.N8 = new java.awt.Point(x, y);
        
        x = (int) Math.round(this.goc.x-1.7*this.tile);
        y = (int) Math.round(this.goc.y + 0.7* this.tile*dao);
        this.N9 = new java.awt.Point(x, y);

        x = (int) Math.round(this.goc.x-1.7*this.tile);
        y = (int) Math.round(this.goc.y -0.4* this.tile*dao);
        this.N10 = new java.awt.Point(x, y);
        
        
    }
    
    public BufferedImage veBanhXe(int key) {
        drawWheel(key, this.xP, this.O3);
        drawWheel(key, this.xT, this.O4);
        return this.img;
    }
    
     private void drawWheel(int key, java.awt.Point xP, java.awt.Point root) {

        //convert to Object.Diem2D
        Diem2D xPObject = new Diem2D(xP.x, xP.y);
        Diem2D O3Object = new Diem2D(root.x, root.y);
        rootLine= new DuongThang(O3Object, xPObject);
     
        // góc đường nan bánh xe
        
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
        
        // truyền gia trị để quay
        
        int value;
        value= key * -24;
        l1= l1.Rotate(root, Math.toRadians(value));
        l2= l2.Rotate(root, Math.toRadians(value));
        l3= l3.Rotate(root, Math.toRadians(value));
        l4= l4.Rotate(root, Math.toRadians(value));
        l5= l5.Rotate(root, Math.toRadians(value));
        l6= l6.Rotate(root, Math.toRadians(value));
        l7= l7.Rotate(root, Math.toRadians(value));
        l8= l8.Rotate(root, Math.toRadians(value));
        l9= l9.Rotate(root, Math.toRadians(value));
        l10= l10.Rotate(root, Math.toRadians(value));
        
        //Vex đường nan
        this.img= new Ve2D(this.img).drawLine(l1.getStart().toJavaPoint(),
                l1.getEnd().toJavaPoint(), Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(l2.getStart().toJavaPoint(),
                l2.getEnd().toJavaPoint(), Color.GREEN);
        this.img = new Ve2D(this.img).drawLine(l3.getStart().toJavaPoint(),
                l3.getEnd().toJavaPoint(), Color.PINK);
        this.img = new Ve2D(this.img).drawLine(l4.getStart().toJavaPoint(),
                l4.getEnd().toJavaPoint(), Color.GRAY);
        this.img = new Ve2D(this.img).drawLine(l5.getStart().toJavaPoint(),
                l5.getEnd().toJavaPoint(), Color.RED);
        this.img = new Ve2D(this.img).drawLine(l6.getStart().toJavaPoint(),
                l6.getEnd().toJavaPoint(), Color.ORANGE);
        this.img = new Ve2D(this.img).drawLine(l7.getStart().toJavaPoint(),
                l7.getEnd().toJavaPoint(), Color.YELLOW);
        this.img = new Ve2D(this.img).drawLine(l8.getStart().toJavaPoint(),
                l8.getEnd().toJavaPoint(), Color.BLUE);
        this.img = new Ve2D(this.img).drawLine(l9.getStart().toJavaPoint(),
                l9.getEnd().toJavaPoint(), Color.LIGHT_GRAY);
        this.img = new Ve2D(this.img).drawLine(l10.getStart().toJavaPoint(),
                l10.getEnd().toJavaPoint(), Color.MAGENTA);
        
        
     }
    
     
     public BufferedImage draw(int tile, int key){
         Graphics g =this.img.getGraphics();
         int dao =-1;
         
         // Vẽ Khung xe 
         this.img = new Ve2D(this.img).drawLine(this.A, this.B, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.C, this.B, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.D, this.C, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.D, this.E, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.F, this.E, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.F, this.G, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.H, this.G, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.I, this.J, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.L, this.K, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.L, this.M, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.N, this.M, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.N, this.A, Color.BLACK);
        // tô màu 
        int axx[] = new int[10], ayx[] = new int[10];
        axx[0] = this.A.x;
        axx[1] = this.B.x;
        axx[2] = this.C.x;
        axx[3] = this.D.x;
        axx[4] = this.E.x;
        axx[5] = this.F.x;
        axx[6] = this.G.x;
        axx[7] = this.L.x;
        axx[8] = this.M.x;
        axx[9] = this.N.x;
        ayx[0] = this.A.y;
        ayx[1] = this.B.y;
        ayx[2] = this.C.y;
        ayx[3] = this.D.y;
        ayx[4] = this.E.y;
        ayx[5] = this.F.y;
        ayx[6] = this.G.y;
        ayx[7] = this.L.y;
        ayx[8] = this.M.y;
        ayx[9] = this.N.y;
        g.setColor(Color.BLUE);
        g.fillPolygon(axx, ayx, 10);
        
        // VẼ khung cửa
        this.img = new Ve2D(this.img).drawLine(this.A1, this.B1, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.B1, this.C1, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.D1, this.C1, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.D1, this.E1, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.F1, this.E1, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.F1, this.G1, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.A1, this.G1, Color.BLACK);
        //tô màu 
        int axc[] = new int[5], ayc[] = new int[5];
        axc[0] = this.C1.x;
        axc[1] = this.D1.x;
        axc[2] = this.E1.x;
        axc[3] = this.F1.x;
        axc[4] = this.G1.x;
        ayc[0] = this.C1.y;
        ayc[1] = this.D1.y;
        ayc[2] = this.E1.y;
        ayc[3] = this.F1.y;
        ayc[4] = this.G1.y;
        g.setColor(Color.red);
        g.fillPolygon(axc, ayc, 5);
        
         int axcs[] = new int[4], aycs[] = new int[4];
        axcs[0] = this.A1.x;
        axcs[1] = this.B1.x;
        axcs[2] = this.C1.x;
        axcs[3] = this.G1.x;
       
        
        aycs[0] = this.A1.y;
        aycs[1] = this.B1.y;
        aycs[2] = this.C1.y;
        aycs[3] = this.G1.y;
      
        g.setColor(Color.white);
        g.fillPolygon(axcs, aycs, 4);
        
        this.img = new Ve2D(this.img).drawLine(this.O1, this.O2, Color.RED);
        this.img = new Ve2D(this.img).drawLine(this.G1, this.C1, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.N1, this.N2, Color.BLACK);
         this.img = new Ve2D(this.img).drawLine(this.N3, this.N4, Color.BLACK);
         this.img = new Ve2D(this.img).drawLine(this.N5, this.N6, Color.BLACK);
         this.img = new Ve2D(this.img).drawLine(this.N7, this.N8, Color.BLACK);
         this.img = new Ve2D(this.img).drawLine(this.N9, this.N10, Color.BLACK);
         
         g.setFont(new Font("NewellsHand", Font.PLAIN, 24));
        g.drawString(" BUS SCHOOL ", 390, 430); 
        
                 
         // Buồng lái 
        int axt[] = new int[4], ayt[] = new int[4];
        axt[0]= this.O1.x;
        axt[1]=this.B1.x;
        axt[2]=this.C1.x;
        axt[3]=this.O2.x;
        
        ayt[0]=this.O1.y;
        ayt[1]=this.B1.y;
        ayt[2]=this.C1.y;
        ayt[3]=this.O2.y;
         g.setColor(Color.yellow);
        g.fillPolygon(axt, ayt, 4);
        
        /// vẽ và set màu cho bánh xe
        
        this.img= new Ve2D(this.img).drawCircle(this.O3, (int)(0.3*tile), Color.BLACK, 1);
        this.img= new Ve2D(this.img).drawCircle(this.O3, (int)(0.2*tile), Color.BLACK,1);
        this.img= new Ve2D(this.img).drawCircle(this.O3,(int)(0.05* tile), Color.BLACK, 1);
        
         this.img = new Ve2D(this.img).drawCircle(this.O3,
                (int) (0.3 * tile), Color.BLACK, 1);
        this.img = new Ve2D(this.img).drawCircle(this.O3,
                (int) (0.2 * tile), Color.BLACK, 1);
        this.img = new Ve2D(this.img).drawCircle(this.O3,
                (int) (0.05 * tile), Color.BLACK, 1);

        g.setColor(Color.black);
        g.fillOval((int) (this.O3.x - 0.3 * tile),
                (int) (this.O3.y + 0.3 * tile * dao),
                (int) (2 * 0.3 * tile), (int) (2 * 0.3 * tile));

        g.setColor(Color.white);
        g.fillOval((int) (this.O3.x - 0.2 * tile),
                (int) (this.O3.y + 0.2 * tile * dao),
                (int) (2 * 0.2 * tile), (int) (2 * 0.2 * tile));

        g.setColor(Color.black);
        g.fillOval((int) (this.O3.x - 0.05 * tile),
                (int) (this.O3.y + 0.05 * tile*dao),
                (int) (2 * 0.05 * tile), (int) (2 * 0.05 * tile));

        this.img = new Ve2D(this.img).drawCircle(this.O4, (int) (0.3 * tile), Color.BLACK, 1);
        this.img = new Ve2D(this.img).drawCircle(this.O4, (int) (0.2 * tile), Color.BLACK, 1);
        this.img = new Ve2D(this.img).drawCircle(this.O4, (int) (0.05 * tile), Color.BLACK, 1);

        g.setColor(Color.black);
        g.fillOval((int) (this.O4.x - 0.3 * tile),
                (int) (this.O4.y + 0.3 * tile * dao),
                (int) (2 * 0.3 * tile), (int) (2 * 0.3 * tile));

        g.setColor(Color.white);
        g.fillOval((int) (this.O4.x - 0.2 * tile),
                (int) (this.O4.y + 0.2 * tile *dao),
                (int) (2 * 0.2 * tile), (int) (2 * 0.2 * tile));

        g.setColor(Color.black);
        g.fillOval((int) (this.O4.x - 0.05 * tile),
                (int) (this.O4.y + 0.05 * tile * dao),
                (int) (2 * 0.05 * tile ), (int) (2 * 0.05 * tile));

       
       
         veBanhXe(key);
        return this.img;  
     }

}
