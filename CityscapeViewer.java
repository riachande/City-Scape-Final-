import javax.swing.JFrame; 
import java.awt.Color ;
import javax.swing.*;
import sun.audio.*; 
import java.io.*;
import java.util.Scanner;


public class CityscapeViewer 
{
    public static void main(String[] args) 
    {
       String color = ""; 
        Scanner user_input = new Scanner(System.in);  
        JFrame frame = new JFrame(); 
        frame.setSize(950,1000);
        frame.setTitle("CityScapes Project"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        System.out.println("What Color do you want background*Yellow,Black,Blue*: ");
       color = user_input.next() ; 
    
       if (color.equals("Yellow") ) {
            frame.setBackground(Color.YELLOW); 
    }  
        if (color.equals( "Black ") ) {
        frame.setBackground(Color.BLACK); 
    }
    if (color.equals("Blue")){
        frame.setBackground(Color.BLUE);
    }
    
        
        CityScapeComponent component = new CityScapeComponent(); 
        frame.add(component); 
        
        frame.setVisible(true);
    }}



