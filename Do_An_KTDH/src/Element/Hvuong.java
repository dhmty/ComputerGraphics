/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;
import java.awt.Point;
import java.awt.Color;
/**
 *
 * @author Jun
 */
public class Hvuong {
     public int canh;
        public Point d1, d2;
        public Color mau;
        public Point d3, d4;
        public Hvuong()
        {
            d1 = new Point(0, 0);
            d2 = new Point(0, 0);
            d3 = new Point(0, 0);
            d4 = new Point(0, 0);
            mau = Color.DARK_GRAY;
        }
        public Hvuong(Point dd1, Point dd2, Color m)
        {
            d1 = new Point(dd1.x, dd1.y);
            d2 = new Point(dd2.x, dd2.y);
             canh = Math.abs(d2.x - d1.x);
            d3d4();
            mau = m;
        }
        public Hvuong(Point dd1, Point dd2, Point dd3,Point dd4, Color m)
        {
           // Point d;
           // if (dd1.x > dd2.x) { d = dd1; dd1 = dd2; dd2 = d; }
            d1 = new Point(dd1.x, dd1.y);
            d2 = new Point(dd2.x, dd2.y);
            d3 = new Point(dd3.x, dd3.y);
            d4 = new Point(dd4.x, dd4.y);
            mau = m;
        }
        public void d3d4()
        {
            //int canh = Math.Abs(d2.x - d1.x);
            d3 = new Point(d1.x, d1.y + canh);
            d4 = new Point(d2.x, d2.y + canh);
        }
        public void setpro(Point dd1, Point dd2, Color m)
        {
            d1 = dd1;
            d2 = dd2;
            d3d4();
            mau = m;
        }
        public Hvuong getpro()
        {
            Hvuong item = new Hvuong(d1, d2, mau);
            return item;
        }
}

