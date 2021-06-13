
package Element;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author NHOM8
 */
public class Elip {
    public Point point;
    public int R, r;
    public Color mau;

    public Elip(){
        point = new Point(0, 0);
        R = r = 0;
        mau = Color.GREEN;
    }
        
    public Elip(Point p, int RR, int rr, Color m){
        point = new Point(p.x, p.y);
        R = RR; r = rr;
        mau = m;
    }
       
    public void setpro(Point p, int RR, int rr, Color m){
        point = p;
        R = RR; r = rr;
        mau = m;
    }
        
    public Elip getpro(){
        Elip item = new Elip(point, R, r, mau);
        return item;
    }
}

