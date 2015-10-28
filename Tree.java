
import java.awt.Graphics2D;    
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Point2D;
import java.awt.Color;
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private int xLeft; 
    private int yTop; 

    /**
     * Constructor for objects of class Tree
     */
    public Tree(int x, int y )
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
        Ellipse2D.Double part1 = new Ellipse2D.Double(xLeft +10, yTop + 10,60,60); 
        Ellipse2D.Double part2 = new Ellipse2D.Double(xLeft +10, yTop + 10,60,60); 
        Ellipse2D.Double part3 = new Ellipse2D.Double(xLeft +10, yTop + 10,60,60); 
        
        
        g2.setColor(Color.GREEN); 
        g2.fill(part1);
        g2.fill(part2); 
        g2.fill(part3);
        
        
        
        
    }
}
