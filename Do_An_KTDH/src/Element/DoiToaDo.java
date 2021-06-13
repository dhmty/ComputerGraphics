
package Element;

import java.awt.Point;

/**
 *
 * @author NHOM8
 */
public class DoiToaDo {
     public int round(double tds){
        int tdm;
        double sodu = tds % 5;
        if (sodu != 0){
            if (sodu >= 3) tdm = (int)(tds + 5 - sodu);
            else tdm = (int)(tds - sodu);
        }
        else 
            tdm = (int)tds;
        

            
        return tdm;
        }
     
    public Point doiMtoND(int x, int y){
        Point temp = new Point();
        temp.x = (x - 500)/5;
        temp.y = ((y - 670/2) * (-1))/5;

        return temp;
    }
     
    public Point NDtoM(int x, int y){
        Point temp = new Point();
        temp.x = (x + 500);
        temp.y = (y* (-1) + 670/2) ;

        return temp;
    }
}
