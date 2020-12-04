import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    private int movingSpeed;
    private int damage;
    private int hits;
    private int playerKnockback = 70;
    
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        followPlayer();
        damagePlayer();
        //killed();
    }
    
    public Zombie()
    {
        this.movingSpeed = 1;
    }
    
    public Zombie(int movingSpeed, int damage, int hits)
    {
        this.movingSpeed = movingSpeed;
        this.damage = damage;
        this.hits = hits;
    }
    
    public void followPlayer() {
        Actor player = getWorld().getObjects(Player.class).get(0);
        int path = player.getX();
        
        GreenfootImage zombieImage = new GreenfootImage("zombie1.png");
        GreenfootImage zombieImageFlipped = new GreenfootImage("zombie2.png");
        
        if (getX() < path)
        {
            move(movingSpeed);
            this.setImage(zombieImage);
        }
        else
        {
            move(-movingSpeed);
            this.setImage(zombieImageFlipped);
        }    
    }
    
    public int getDamage() {
        return this.damage;
    }
    
    public void damagePlayer() {
        Actor player = getOneIntersectingObject(Player.class);
        if (player != null)
        {
            Player.getHurt(damage);
            int path = player.getX();
            if (getX() < path)
            {
                player.move(playerKnockback);
            }
            else
            {
                player.move(-playerKnockback);
            }
        }
    }
}   
