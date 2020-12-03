import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int shotSpeed = 20;
    private int direction;
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shot();
        getOffScreen();
    }
    
    public void shot() {
        direction = -1;
        move(direction * shotSpeed);
    }
    
    public void getOffScreen() {
        if (this.isAtEdge())
            getWorld().removeObject(this);
    }
    
}    
