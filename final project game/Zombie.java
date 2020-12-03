import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    private int movingSpeed = 1;
    
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        followPlayer();
        //damagePlayer();
        //killed();
    }
    
    public void followPlayer() {
        Actor player = getWorld().getObjects(Player.class).get(0);
        int path = player.getX();
        
        if (getX() < path)
            move(movingSpeed);
        else
            move(-1 * movingSpeed);
    }
}
