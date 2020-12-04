import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        enterDoor();
    }
    
    public void enterDoor() {
        Actor Player = getOneIntersectingObject(Player.class);
        
        if (Player != null) {
            changeWorld();
        }
    }
    
    public void changeWorld() {
        switch (Player.getLevelProgress()) {
            case (0):
                transitionToStreets();
                Player.setLevelProgress(1);
                break;
            case (1):
                transitionToForest();
                Player.setLevelProgress(2);
                break;
            case (2):
                transitionToBeach();
                Player.setLevelProgress(3);
                break;
            case (3):
                transitionToWinWorld();
                break;
        }
    }
    
    public void transitionToStreets() {
        World streets = new Streets();
        getWorld().stopped();
        Greenfoot.setWorld(streets);
    }
     
    public void transitionToForest() {
        World forest = new Forest();
        getWorld().stopped();
        Greenfoot.setWorld(forest);
    } 
     
    public void transitionToBeach() {
        World beach = new Beach();
        getWorld().stopped();
        Greenfoot.setWorld(beach);
    } 
     
    public void transitionToWinWorld() {
        World winWorld = new WinScreen();
        getWorld().stopped();
        Greenfoot.setWorld(winWorld);
    }
}
