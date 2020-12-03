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
        Player player = new Player();
        addObject(player,726,554);
        Door door = new Door(0);
        addObject(door,99,551);
        Zombie zombie = new Zombie();
        addObject(zombie,243,550);
        Zombie zombie2 = new Zombie();
        addObject(zombie2,335,552);
        Zombie zombie3 = new Zombie();
        addObject(zombie3,421,551);
        floor floor = new floor();
        addObject(floor,416,332);
        door.setLocation(103,202);
        zombie.setLocation(265,255);
        zombie2.setLocation(371,234);
        zombie3.setLocation(531,208);
        player.setLocation(703,168);
        floor.setLocation(335,551);
        floor.setLocation(364,569);
        door.setLocation(66,501);
        zombie.setLocation(158,505);
        zombie2.setLocation(211,504);
        zombie3.setLocation(292,506);
        player.setLocation(868,512);
        player.setLocation(860,494);

        stairs stairs = new stairs();
        addObject(stairs,477,505);
        stairs.setLocation(476,520);
        stairs stairs2 = new stairs();
        addObject(stairs2,520,486);
        stairs2.setLocation(504,496);
        stairs stairs3 = new stairs();
        addObject(stairs3,549,466);
        stairs3.setLocation(535,479);
        stairs stairs4 = new stairs();
        addObject(stairs4,582,436);
        stairs4.setLocation(568,457);
        stairs stairs5 = new stairs();
        addObject(stairs5,617,417);
        stairs5.setLocation(598,442);
        stairs stairs6 = new stairs();
        addObject(stairs6,650,401);
        stairs6.setLocation(630,421);
        stairs stairs7 = new stairs();
        addObject(stairs7,677,386);
        stairs7.setLocation(663,400);
        stairs2.setLocation(509,500);
        stairs3.setLocation(543,476);
        stairs4.setLocation(569,458);
        floor2 floor2 = new floor2();
        addObject(floor2,709,367);
        floor2.setLocation(785,377);
        stairs7.setLocation(687,274);
        floor2.setLocation(773,410);
        floor3 floor3 = new floor3();
        addObject(floor3,112,264);
        floor3.setLocation(261,222);
        stairs stairs8 = new stairs();
        addObject(stairs8,614,371);
        stairs8.setLocation(631,377);
        stairs stairs9 = new stairs();
        addObject(stairs9,558,341);
        stairs9.setLocation(600,357);
        stairs stairs10 = new stairs();
        addObject(stairs10,496,312);
        stairs10.setLocation(569,340);
        stairs10.setLocation(568,338);
        stairs stairs11 = new stairs();
        addObject(stairs11,475,286);
        stairs11.setLocation(539,317);
        stairs stairs12 = new stairs();
        addObject(stairs12,506,282);
        stairs12.setLocation(512,298);
        stairs stairs13 = new stairs();
        addObject(stairs13,479,250);
        stairs13.setLocation(480,284);
        stairs stairs14 = new stairs();
        addObject(stairs14,428,267);
        stairs14.setLocation(447,260);
        floor3.setLocation(207,229);

        stairs7.setLocation(691,271);
        stairs7.setLocation(669,235);
        removeObject(stairs7);
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
