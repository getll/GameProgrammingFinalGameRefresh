import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int firingRate = 20;
    private int firingCounter;
    private static int health = 100;
    private static int levelProgress = 0;
    
    private final int gravity = 1;
    private int velocity;
    
    public Player()
    {
        velocity = 0;
        firingCounter = 0;
    }
    
    public void act() 
    {
        move();
        shoot();
        fall();
        checkGameOver();
        flip();
    }
    
    public static void reset()
    {
        health = 100;
        levelProgress = 0;
    }
    
    public void fall(){
        setLocation(getX(),getY()+velocity);
        if(isOnSolidGround())
            velocity = 0;
        else
            velocity += gravity;
    }
    
    public void jump(){
        velocity=-14;
    }
    
    public void move()
    {
        if (Greenfoot.isKeyDown("a"))
            move(-4);
        if (Greenfoot.isKeyDown("d"))
            move(4);
        if(Greenfoot.isKeyDown("w") && isOnSolidGround())
            jump();
    }
    
    public void shoot()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (Greenfoot.isKeyDown("space") && mouse != null)
        {
            firingCounter++;
            
            if (firingCounter == firingRate)
            {
                World world = getWorld();
                int difference = -20;
                Bullet bullet = new Bullet();
                
                double adjacent = mouse.getX() - getX();
                double opposite = mouse.getY() - getY();
            
                double angleRadians = Math.atan2(opposite, adjacent);
                double angleDegrees = Math.toDegrees(angleRadians);
            
                world.addObject(bullet, getX(), getY() + difference);
                double rotate = 180.1;
                bullet.setRotation((int) angleDegrees + 180);
                
                firingCounter = 0;
            }
        }
    }
    
    public boolean isOnSolidGround() {
        boolean isOnGround = false;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        int xDistance1 = imageWidth / -2;
        int xDistance2 = imageWidth / 2;
        int yDistance = imageHeight / 2;
        
        if(getOneObjectAtOffset(xDistance1, yDistance, floor.class) != null ||
            getOneObjectAtOffset(xDistance2, yDistance, floor.class) != null)
           isOnGround = true;
        
        if(getOneObjectAtOffset(xDistance1, yDistance, floor2.class) != null ||
            getOneObjectAtOffset(xDistance2, yDistance, floor2.class) != null)
           isOnGround = true; 
        
        if(getOneObjectAtOffset(xDistance1, yDistance, floor3.class) != null ||
            getOneObjectAtOffset(xDistance2, yDistance, floor3.class) != null)
           isOnGround = true;
        
        if(getOneObjectAtOffset(xDistance1, yDistance, stairs.class) != null ||
            getOneObjectAtOffset(xDistance2, yDistance, stairs.class) != null)
           isOnGround = true;
        
        if(getOneObjectAtOffset(xDistance1, yDistance, Grass.class) != null ||
            getOneObjectAtOffset(xDistance2, yDistance, Grass.class) != null)
           isOnGround = true;
        
        if(getY()> getWorld().getHeight() - 30)
           isOnGround = true;
        
        return isOnGround;
    }
    
    public void checkGameOver() {
        if (health <= 0)
        {
            World gameOverScreen = new GameOverScreen();
            getWorld().stopped();
            Greenfoot.setWorld(gameOverScreen);
        }
    }
    
    public static void getHurt(int damage)
    {
        health -= damage;
    }
    
    public void flip()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null)
        {
            double adjacent = mouse.getX() - getX();
            double opposite = mouse.getY() - getY();
            
            if (adjacent > 0)
                setImage("player no arm.png");
            else
                setImage("player no arm 2.png");
        }
    }
    
    public static int getHealth()
    {
        return health;
    }
    
    public static void setHealth(int newHealth)
    {
        health = newHealth;
    }
    
    public static void setLevelProgress(int worldNum)
    {
        levelProgress = worldNum;
    }
    
    public static int getLevelProgress()
    {
        return levelProgress;
    }
}