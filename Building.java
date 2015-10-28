import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Point2D;
import  java.awt.Color; 

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop; 
    /**
     * Constructor for objects of class Building
     */
    public Building(int x , int y)
    {
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
        Rectangle building = new Rectangle(xLeft,yTop + 10,100,700); 
        g2.setColor(Color.gray); 
        g2.fill(building);
        g2.draw(building); 
        
        Rectangle building2 = new Rectangle(xLeft,yTop + 10,100,700); 
        g2.setColor(Color.gray); 
        g2.fill(building2);
        g2.draw(building2); 
        
        Rectangle building3 = new Rectangle(xLeft,yTop + 10,110,700); 
        g2.setColor(Color.gray); 
        g2.fill(building3);
        g2.draw(building3); 
        
        Rectangle building5 = new Rectangle(xLeft,yTop + 10,100,700); 
        g2.setColor(Color.gray); 
        g2.fill(building5);
        g2.draw(building5); 
        
        Rectangle building4 = new Rectangle(xLeft,yTop + 10,100,700); 
        g2.setColor(Color.gray); 
        g2.fill(building4);
        g2.draw(building4); 
        
        Rectangle building6 = new Rectangle(xLeft,yTop + 10,100,700); 
        g2.setColor(Color.gray); 
        g2.fill(building6);
        g2.draw(building6); 
        
        Rectangle building7 = new Rectangle(xLeft,yTop + 10,100,700); 
        g2.setColor(Color.gray); 
        g2.fill(building7);
        g2.draw(building7); 
    }
}
