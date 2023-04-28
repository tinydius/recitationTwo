import greenfoot.*;  // (World, greenfoot.Actor, greenfoot.GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Actor
{
    private final static int MAX_RADIUS = 20;
    
    private int radius;
    private int increment;
    private int maxRadius;
    GreenfootImage image;
    Random rand;
    
    private void init(int maxRadius){
        this.maxRadius = maxRadius;
        increment = maxRadius;
        radius = Math.abs(increment-maxRadius);
        image = new GreenfootImage(2*maxRadius,2*maxRadius);
        image.setColor(Color.RED);
        rand = new Random(17);
        setRotation(90);
    }
    
    public Circle(){
        init(MAX_RADIUS);
    }
    
    public Circle(int maxRadius){
        init(maxRadius);
    }
    
    private void pulsate(){
        image.clear();
        image.fillOval(maxRadius-radius,maxRadius-radius,
                        2*radius,2*radius);
        setImage(image);
        increment = (increment+1) % (2*maxRadius);
        radius = Math.abs(increment-maxRadius);    
    }
    
    private void moveIt(){
        // TODO replace this comment with your code
    }
    
    /**
     * Act - do whatever the Circle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        pulsate();
        moveIt();
    }
}
