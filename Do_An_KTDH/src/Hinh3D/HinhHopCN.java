/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh3D;

import Diem.Diem2D;
import Diem.Diem3D;
import Hinh2D.Ve2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import Hinh3D.Ve3D;
import static java.lang.Math.sqrt;
/**
 *
 * @author ADMIN
 */
public class HinhHopCN {
    private Diem3D goc;
    private int dai, rong ,cao;
    private BufferedImage img;
    private Point center;
     private Point A, B, C, D, E, F, G, H;
      private int x, y, z;

    public HinhHopCN(Diem3D goc, int dai, int rong, int cao, BufferedImage img, Point center) {
        this.goc = goc;
        this.dai = dai;
        this.rong = rong;
        this.cao = cao;
        this.img = img;
        this.center = center;
        tinhToaDo();
    }

    public Diem3D getGoc() {
        return goc;
    }

    public void setGoc(Diem3D goc) {
        this.goc = goc;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getCao() {
        return cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }

    public Point getD() {
        return D;
    }

    public void setD(Point D) {
        this.D = D;
    }

    public Point getE() {
        return E;
    }

    public void setE(Point E) {
        this.E = E;
    }

    public Point getF() {
        return F;
    }

    public void setF(Point F) {
        this.F = F;
    }

    public Point getG() {
        return G;
    }

    public void setG(Point G) {
        this.G = G;
    }

    public Point getH() {
        return H;
    }

    public void setH(Point H) {
        this.H = H;
    }
     
    
    public Diem3D getViTri3D(String key){
        switch(key){
            case "A":
                return new Diem3D(this.goc.getX(),this.goc.getY(),this.goc.getZ());
            case "B":
                return new Diem3D(this.goc.getX()+this.rong,this.goc.getY(),this.goc.getZ());
            case "C":
                return new Diem3D(this.goc.getX()+this.rong,this.goc.getY(),this.goc.getZ()+this.dai);
            case "D":
                return new Diem3D(this.goc.getX(),this.goc.getY(),this.goc.getZ()+this.dai);
                  case "E":
                return new Diem3D(this.goc.getX(),this.goc.getY()+this.cao,this.goc.getZ());
                  case "F":
                return new Diem3D(this.goc.getX(),this.goc.getY()+this.cao,this.goc.getZ()+this.dai);
                  case "G":
                return new Diem3D(this.goc.getX()+this.rong,this.goc.getY()+this.cao,this.goc.getZ()+this.dai);
                  case "H":
                return new Diem3D(this.goc.getX(),this.goc.getY()+this.cao,this.goc.getZ()+this.dai);
                
        }
        return null;
    }
    
    private void tinhToaDo(){
       
        
        Diem3D a = new Diem3D(this.goc.getX(),this.goc.getY(),this.goc.getZ());
        Diem3D b = new Diem3D(this.goc.getX()+this.rong,this.goc.getY(),this.goc.getZ());
        Diem3D c = new Diem3D(this.goc.getX()+this.rong,this.goc.getY(),this.goc.getZ()+this.dai);
        Diem3D d = new Diem3D(this.goc.getX(),this.goc.getY(),this.goc.getZ()+this.dai);

        //các điểm đáy trên
        Diem3D e = new Diem3D(this.goc.getX(),this.goc.getY()+this.cao,this.goc.getZ());
        Diem3D f = new Diem3D(this.goc.getX()+this.rong,this.goc.getY()+this.cao,this.goc.getZ());
        Diem3D g = new Diem3D(this.goc.getX()+this.rong,this.goc.getY()+this.cao,this.goc.getZ()+this.dai);
        Diem3D h = new Diem3D(this.goc.getX(),this.goc.getY()+this.cao,this.goc.getZ()+this.dai);
       
        
        int xA= a.to2D().x +this.center.x;
        int yA= this.center.y-a.to2D().y;
        this.A=new Point(xA,yA);
        
//        int x = this.center.x + this.goc.getX() - (int) Math.round(Math.sqrt(2) / 2) * this.goc.getZ();
//        int y = this.center.y - this.goc.getY() - (int) Math.round(Math.sqrt(2) / 2) * this.goc.getZ();
//        this.A = new Point(x, y);
        //công thức bị thay đổi 
        // điểm A chuyển sang 2 chiều 
        // lấy từng tạo độ chuyển sang 3D rồi mới v
        
        x= this.center.x+b.to2D().x ;
        y= (int)(this.center.y-b.to2D().y);
        this.B = new Point(x,y);
        
       
        x = (int)this.center.x + c.to2D().x;
        y = (int) this.center.y-c.to2D().y;
        this.C = new Point(x, y);

        
        x = (int) this.center.x+ d.to2D().x;
        y = (int) this.center.y-d.to2D().y;
        this.D = new Point(x, y);

         x = (int) this.center.x+ e.to2D().x;
        y = (int) this.center.y-e.to2D().y;
        this.E = new Point(x, y);

          x = (int) this.center.x+ f.to2D().x;
        y = (int) this.center.y-f.to2D().y;
        this.F = new Point(x, y);

        x = (int) this.center.x+ g.to2D().x;
        y = (int) this.center.y-g.to2D().y;
        this.G = new Point(x, y);

          x = (int) this.center.x+h.to2D().x;
        y = (int) this.center.y-h.to2D().y;
        this.H = new Point(x, y);
    }
     
    public BufferedImage Ve(){
        Graphics g =this.img.getGraphics();
        
      
        
        //nét đứt
        this.img= new Ve2D(this.img).Dashed(this.A, this.B, Color.BLACK);
        this.img= new Ve2D(this.img).Dashed(this.A, this.E, Color.BLACK);
        this.img= new Ve2D(this.img).Dashed(this.A, this.D, Color.BLACK);
        
        // nét liền
         this.img = new Ve2D(this.img).drawLine(this.F, this.E, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.F, this.G, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.F, this.B, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.H, this.E, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.H, this.G, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.H, this.D, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.C, this.G, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.C, this.B, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.C, this.D, Color.BLACK);
        
        // vẽ tên điểm
        int khoangcach=5;
        g.setColor(Color.red);
        g.drawString("A", this.A.x+khoangcach, this.A.y-khoangcach);
        g.drawString("B", this.B.x+khoangcach, this.B.y-khoangcach);
        g.drawString("C", this.C.x+khoangcach, this.C.y+khoangcach);
        g.drawString("D", this.D.x+khoangcach, this.D.y+khoangcach);
        g.drawString("E", this.E.x+khoangcach, this.E.y-khoangcach);
        g.drawString("F", this.F.x+khoangcach, this.F.y-khoangcach);
        g.drawString("G", this.G.x+khoangcach, this.G.y-khoangcach);
        g.drawString("H", this.H.x+khoangcach, this.H.y-khoangcach);
        
        return this.img;
        
        
    }
    
   
     
}
