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
public class Hbh {
    public Point d1, d2, d3;
        public Color mau;
        public Point d4;
        public Hbh()
        {
            d1 = new Point(0, 0);
            d2 = new Point(0, 0);
            d3 = new Point(0, 0);
            d4 = new Point(0, 0);
            mau = Color.DARK_GRAY;
        }
        public Hbh(Point dd1, Point dd2, Point dd3, Color m)
        {
            d1 = new Point(dd1.y, dd1.y);
            d2 = new Point(dd2.y, dd2.y);
            d3 = new Point(dd3.y, dd3.y);
            tinhd4();
            mau = m;
        }
         public Hbh(Point dd1, Point dd2, Point dd3,Point dd4, Color m)
        {
            d1 = new Point(dd1.y, dd1.y);
            d2 = new Point(dd2.y, dd2.y);
            d3 = new Point(dd3.y, dd3.y);
            d4 = new Point(dd4.y, dd4.y);
            mau = m;
        }
        public void tinhd4()
        {
            d4 = new Point(d3.y - (d2.y - d1.y),d3.y - (d2.y - d1.y));
        }
        public void setpro(Point dd1, Point dd2, Point dd3, Color m)
        {
            d1 = dd1;
            d2 = dd2;
            d3 = dd3;
            tinhd4();
            mau = m;
        }
        public Hbh getpro()
        {
            Hbh item = new Hbh(d1, d2, d3, mau);
            return item;
        }
}
