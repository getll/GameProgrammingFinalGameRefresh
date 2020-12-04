import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hopsital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hopsital extends World
{
    GreenfootSound hMusic = new GreenfootSound("Hospital soundtrack.wav");
    
    /**
     * Constructor for objects of class Hopsital.
     * 
     */
    public Hopsital()
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
        floor floor = new floor();
        addObject(floor,418,591);

        Door door = new Door();
        addObject(door,75,536);

        floor3 floor3 = new floor3();
        addObject(floor3,180,290);

        floor2 floor2 = new floor2();
        addObject(floor2,788,439);

        stairs stairs = new stairs();
        addObject(stairs,420,279);

        stairs stairs1 = new stairs();
        addObject(stairs1,452,300);

        stairs stairs3 = new stairs();
        addObject(stairs3,484,321);

        stairs stairs4 = new stairs();
        addObject(stairs4,516,342);

        stairs stairs5 = new stairs();
        addObject(stairs5,548,363);

        stairs stairs6 = new stairs();
        addObject(stairs6,580,384);

        stairs stairs7 = new stairs();
        addObject(stairs7,612,406);

        stairs stairs8 = new stairs();
        addObject(stairs8,644,428);

        stairs stairs9 = new stairs();
        addObject(stairs9,612,450);

        stairs stairs10 = new stairs();
        addObject(stairs10,580,472);

        stairs stairs11 = new stairs();
        addObject(stairs11,548,494);

        stairs stairs12 = new stairs();
        addObject(stairs12,516,516);

        stairs stairs13 = new stairs();
        addObject(stairs13,484,538);

        stairs stairs14 = new stairs();
        addObject(stairs14,452,560);

        Player player = new Player();
        addObject(player,235,221);

        Zombie zombie = new Zombie(2, 5, 2); //speed, damage, health
        addObject(zombie,262,545);

        Zombie zombie2 = new Zombie(3, 5, 2);
        addObject(zombie2,204,545);

        Zombie zombie3 = new Zombie(1, 5, 2);
        addObject(zombie3,329,545);
        
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,743,51);
    }

    public void act()
    {
        hMusic.play();
    }
    
    public void started()
    {
        hMusic.playLoop();   
    }
    
    public void stopped()
    {
        hMusic.stop();   
    }
    
}
