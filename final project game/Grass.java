import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grass extends Actor
{
    /**
     * Act - do whatever the floor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Grass(){
        getImage().scale(getImage().getWidth()*6,getImage().getHeight()/8);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
