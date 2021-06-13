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
public class Hcn {
     public Point d1, d2;
        public Color mau;
        public Point d3, d4;
        public Hcn()
        {
            d1 = new Point(0, 0);
            d2 = new Point(0, 0);
            d3 = new Point(0, 0);
            d4 = new Point(0, 0);
            mau = Color.DARK_GRAY;
        }
        public Hcn(Point dd1, Point dd2, Color m)
        {
            d1 = new Point(dd1.x, dd1.y);
            d2 = new Point(dd2.x, dd2.y);
            d3d4();
            mau = m;
        }
          public Hcn(Point dd1, Point dd2, Point dd3,Point dd4, Color m)
        {
          // Point d;
          // if (dd1.y> dd2.y) { d = dd1; dd1 = dd2; dd2 = d; }
            d1 = new Point(dd1.x, dd1.y);
            d2 = new Point(dd2.x, dd2.y);
            d3 = new Point(dd3.x, dd3.y);
            d4 = new Point(dd4.x, dd4.y);
            mau = m;
        }
        public void d3d4()
        {
            d3= new Point(d2.x, d1.y);
            d4 = new Point(d1.x, d2.y);
        }
        public void setpro(Point dd1, Point dd2, Color m)
        {
            d1 = dd1;
            d2 = dd2;
            d3d4();
            mau = m;
        }
        public Hcn getpro()
        {
            Hcn item = new Hcn(d1, d2, mau);
            return item;
        }
    }

