import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Point2D;
import  java.awt.Color; 
/**
 * Write a description of class Stars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop; 
    
    /**
     * Constructor for objects of class Stars
     */
    public Stars(int x , int y )
    {
        xLeft = x ; 
        yTop = y; 
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2) 
    {
        
        Ellipse2D.Double star = new Ellipse2D.Double(xLeft + 10, yTop + 20, 3,3  );
         g2.setColor(Color.WHITE);
         g2.fill(star);
        g2.draw(star);
    }
}
