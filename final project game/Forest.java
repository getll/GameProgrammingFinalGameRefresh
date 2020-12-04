import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends World
{
    GreenfootSound fMusic = new GreenfootSound("Forest soundtrack.wav");
    
    /**
     * Constructor for objects of class Forest.
     * 
     */
    public Forest()
    {
        super(900, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setBackground(new GreenfootImage("Forest.png"));
        
        Player player = new Player();
        addObject(player,734,100);
        
        Door door = new Door();
        addObject(door,108,424);
        
        Grass grass = new Grass();
        addObject(grass,390,597);
        
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,743,51);
    }
    
    public void act()
    {
        fMusic.play();
    }
    
    public void started()
    {
        fMusic.playLoop();
    }
    
    public void stopped()
    {
        fMusic.stop();
    }
}
