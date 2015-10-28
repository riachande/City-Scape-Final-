import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Point2D;
import  java.awt.Color; 

/**
 * Write a description of class Grass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grass
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop; 
    /**
     * Constructor for objects of class Grass
     */
    public Grass(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
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
       Rectangle grass = new Rectangle(xLeft+0, yTop+0, 1000,20);
       g2.setColor(Color.green) ; 
       g2.fill(grass);
       g2.draw(grass) ; 
       
    }
}
