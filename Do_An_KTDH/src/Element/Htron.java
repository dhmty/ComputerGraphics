/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;
import java.awt.Color;
import java.awt.Point;


/**
 *
 * @author Jun
 */
public class Htron {
    public int bkinh;
        public Point tam;
        public Color mau;
        public Htron()
        {
            bkinh = 0;
            tam = new Point(0,0);
            mau = Color.DARK_GRAY;
        }
        public Htron(int bk, Point tamht, Color m)
        {
            bkinh = bk;
            tam = new Point(tamht.x, tamht.y);
            mau = m;
        }
        public void setpro(int bk, Point tamht, Color m)
        {
            bkinh = bk;
            tam = tamht;
            mau = m;
        }
        public Htron getpro()
        {
            Htron item = new Htron(bkinh, tam, mau);
            return item;
        }
}

