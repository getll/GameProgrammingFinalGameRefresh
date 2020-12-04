
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Streets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Streets extends World
{
    private GreenfootSound sMusic = new GreenfootSound("City soundtrack.wav");
    
    /**
     * Constructor for objects of class Streets.
     * 
     */
    public Streets()
    {
        super(900, 600, 1);
        prepare();
        setBackground(new GreenfootImage("Streets.png"));
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,740,546);
        
        Door door = new Door();
        addObject(door,106,532);
        
        Zombie zombie = new Zombie(1, 5, 2);
        addObject(zombie,224,548);
        
        Zombie zombie2 = new Zombie(1, 5, 2);
        addObject(zombie2,294,540);
        
        Zombie zombie3 = new Zombie(1, 5, 2);
        addObject(zombie3,371,543);
        
        Zombie zombie4 = new Zombie(1, 5, 2);
        addObject(zombie4,429,544);
        
        floor floor = new floor();
        addObject(floor,466,589);
        
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,743,51);
    }
    
    public void act()
    {
        sMusic.play();
    }
    
    public void started()
    {
        sMusic.playLoop();
    }
    
    public void stopped()
    {
        sMusic.stop();
    }
    
}
