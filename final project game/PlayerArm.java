import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerArm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerArm extends Actor
{
    /**
     * Act - do whatever the PlayerArm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        pointToMouse();
        followPlayer();
    }   
    
    public void pointToMouse() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null)
        {
            double adjacent = mouse.getX() - getX();
            double opposite = mouse.getY() - getY();
            
            double angleRadians = Math.atan2(opposite, adjacent);
            double angleDegrees = Math.toDegrees(angleRadians);
            
            if (adjacent > 0)
            {
                setImage("player arm 2.png");
                setRotation((int) angleDegrees);
            }
            else
            {
                setImage("player arm.png");
                setRotation((int) angleDegrees + 180);
            }
        }
    }
    
    public void followPlayer()
    {
        Player player = getWorld().getObjects(Player.class).get(0);
        
        int difference = -20;
        int xPosition = player.getX();
        int yPosition = player.getY() + difference;
        
        setLocation(xPosition, yPosition);
    }
}
