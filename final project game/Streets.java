
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
        setBackground(new GreenfootImage("Streets.png"));
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,801,397);
        Door door = new Door(1);
        addObject(door,157,406);
        Zombie zombie = new Zombie();
        addObject(zombie,220,566);
        Zombie zombie2 = new Zombie();
        addObject(zombie2,289,565);
        Zombie zombie3 = new Zombie();
        addObject(zombie3,359,556);
        Zombie zombie4 = new Zombie();
        addObject(zombie4,435,563);
        floor floor = new floor();
        addObject(floor,422,349);
        floor.setLocation(462,597);
        floor.setLocation(466,589);
        zombie4.setLocation(429,544);
        zombie3.setLocation(371,543);
        zombie2.setLocation(295,536);
        zombie.setLocation(233,537);
        door.setLocation(111,525);
        player.setLocation(740,546);
        zombie2.setLocation(289,553);
        zombie.setLocation(241,549);
        zombie2.setLocation(294,540);
        zombie.setLocation(238,525);
        zombie.setLocation(224,548);
        door.setLocation(106,532);
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
