import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Point2D;
import  java.awt.Color; 
/**
 * Write a description of class Bark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bark
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop; 

    /**
     * Constructor for objects of class Bark
     */
    public Bark(int x, int y)
    {
        xLeft = x ; 
        yTop = y ; 
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2) 
    {
        Rectangle bark = new Rectangle(xLeft, yTop +10 , 50, 70);
        g2.setColor(Color.ORANGE);
        g2.fill(bark); 
        g2.draw(bark); 
      
    }
}
