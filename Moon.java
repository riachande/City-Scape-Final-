import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D;
import java.awt.geom.Point2D; 
 import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 * Creates the moon object.
 * 
 * @Ria Chande 
 * @version (a version number or a date)
 */
public class Moon 
{
    private int xLeft; 
    private int yTop; 
  

    /**
     * Constructor for objects of class Moon
     */
    public Moon(int x,int y)
    {
       xLeft = x ; 
       yTop = y ; 
       
    }

    /**
     * Creates the moon.
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft + 10, yTop + 20, 80,80 );
         g2.setColor(Color.YELLOW);
         g2.fill(moon);
        g2.draw(moon); 
        
    }
   
    }
