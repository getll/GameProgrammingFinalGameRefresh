
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        generateText();
    }
    
    public void generateText() {
        int maxHealth = 100;
        int currentHealth = Player.getHealth();
        int fontSize = 40;
        
        GreenfootImage image = new GreenfootImage(" Health : " + currentHealth + " / " + maxHealth + " ", 
                fontSize, Color.WHITE, Color.RED, Color.BLACK);
        setImage(image);
    }
    
}
