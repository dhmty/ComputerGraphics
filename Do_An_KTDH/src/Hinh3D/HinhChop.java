/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinh3D;
import Diem.Diem3D;
import Diem.Diem2D;
import Hinh2D.Ve2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class HinhChop {
    
    private Diem3D goc;
    private int rong,cao;
    private BufferedImage img;
    private Point center;
    private Point A,B,C,D,S,O;

    public HinhChop(Diem3D goc, int rong, int cao, BufferedImage img, Point center) {
        this.goc = goc;
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

    public Point getS() {
        return S;
    }

    public void setS(Point S) {
        this.S = S;
    }

    public Point getO() {
        return O;
    }

    public void setO(Point O) {
        this.O = O;
    }
    
    public BufferedImage Ve(){
        Graphics g = this.img.getGraphics();
        //net lien
         this.img = new Ve2D(this.img).Dashed(this.A, this.C, Color.BLACK);
        this.img = new Ve2D(this.img).Dashed(this.B, this.D, Color.BLACK);
        this.img = new Ve2D(this.img).Dashed(this.O, this.S, Color.BLACK);
        
        //nét đứt
         this.img = new Ve2D(this.img).drawLine(this.C, this.B, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.C, this.D, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.S, this.B, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.S, this.C, Color.BLACK);
        this.img = new Ve2D(this.img).drawLine(this.S, this.D, Color.BLACK);
        
        
       /// kiểm tra vẽ nét đứt
       if(this.cao< this.rong/2){
           this.img = new Ve2D(this.img).drawLine(this.A, this.D, Color.BLACK);
           this.img = new Ve2D(this.img).drawLine(this.A, this.S, Color.BLACK);
       }else{
             this.img = new Ve2D(this.img).Dashed(this.A, this.D, Color.BLACK);
             this.img = new Ve2D(this.img).Dashed(this.A, this.S, Color.BLACK);
               }
       
       if(this.cao < (this.rong* Math.sqrt(2)/4)){
           this.img = new Ve2D(this.img).drawLine(this.A, this.B, Color.BLACK);
       }else{
           this.img = new Ve2D(this.img).Dashed(this.A, this.B, Color.BLACK);
       }
       
       
       // vẽ tên điểm
        int khoangcach=5;
        g.setColor(Color.red);
        g.drawString("A", this.A.x+khoangcach, this.A.y+khoangcach);
        g.drawString("B", this.B.x+khoangcach, this.B.y-khoangcach);
        g.drawString("C", this.C.x+khoangcach, this.C.y+khoangcach);
        g.drawString("D", this.D.x+khoangcach, this.D.y+khoangcach);
        g.drawString("S", this.S.x+khoangcach, this.S.y-khoangcach);
        g.drawString("O'", this.O.x+khoangcach, this.O.y-khoangcach);
       
     return this.img;
    }
    
    public Diem3D getViTri3D(String key){
        switch(key){
              case "A":
                return new Diem3D(this.goc.getX(),this.goc.getY(),this.goc.getZ());
            case "B":
                return new Diem3D(this.goc.getX()+this.rong,this.goc.getY(),this.goc.getZ());
              case "C":
                return new Diem3D(this.goc.getX()+this.rong,this.goc.getY(),this.goc.getZ()+this.rong);
                  case "D":
                return new Diem3D(this.goc.getX(),this.goc.getY(),this.goc.getZ()+this.rong);
                  case "O'":
                 return new Diem3D(this.goc.getX() + this.rong / 2, this.goc.getY(),
                        this.goc.getZ() + this.rong / 2);
            case "S":
                return new Diem3D(this.goc.getX() + this.rong/ 2, this.goc.getY() + this.cao,
                        this.goc.getZ() + this.rong / 2);
        }
        return null;
       
    }
    
    private void tinhToaDo(){
        
        Diem3D a = new Diem3D(this.goc.getX(),this.goc.getY(),this.goc.getZ());
        Diem3D b= new Diem3D(this.goc.getX()+this.rong,this.goc.getY(),this.goc.getZ());
        Diem3D c= new Diem3D(this.goc.getX()+this.rong,this.goc.getY(),this.goc.getZ()+this.rong);
        Diem3D d= new Diem3D(this.goc.getX(),this.goc.getY(),this.goc.getZ()+this.rong);
        Diem3D o = new Diem3D(this.goc.getX() + this.rong / 2, this.goc.getY(),
                        this.goc.getZ() + this.rong / 2);
        Diem3D s =new Diem3D(this.goc.getX() + this.rong/ 2, this.goc.getY() + this.cao,
                        this.goc.getZ() + this.rong / 2); 
           
        int dao= -1;
        
        int x= a.to2D().x +this.center.x;
        int y= this.center.y-a.to2D().y;
        this.A=new Point(x,y);
        
        x= this.center.x+b.to2D().x ;
        y= (int)(this.center.y-b.to2D().y);
        this.B = new Point(x,y);
        
       
        x = (int)this.center.x + c.to2D().x;
        y = (int) this.center.y-c.to2D().y;
        this.C = new Point(x, y);

        
        x = (int) this.center.x+ d.to2D().x;
        y = (int) this.center.y-d.to2D().y;
        this.D = new Point(x, y);

         
        O = new Diem2D(C.x, C.y).Scale(A, 0.5f);

        S = new java.awt.Point(O.x, O.y + cao * dao);
        
    }
}