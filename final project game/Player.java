import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int firingRate = 20;
    private int firingCounter = 0;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int gravity=1;
    private int velocity;
    public Player(){
        velocity=0;
    }
    public void act() 
    {
        move();
        shoot();
        fall();
        if(Greenfoot.isKeyDown("space")&& isOnSolidGround() )jump();
    }
    public void fall(){
        setLocation(getX(),getY()+velocity);
        if(isOnSolidGround()) velocity=0;
        else velocity+=gravity;
    }
    public void jump(){
        velocity=-10;
    }
    public void move() {
        if (Greenfoot.isKeyDown("a")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(4);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            
        }
    }
    
    public void shoot() {
        if (Greenfoot.isKeyDown("f")) {
            firingCounter++;
            if (firingCounter == firingRate) {
                World world = getWorld();
                world.addObject(new Bullet(), getX(), getY());
                firingCounter = 0;
            }
        }
    }
    public boolean isOnSolidGround(){
      boolean isOnGround=false;
      int imageWidth=getImage().getWidth();
      int imageHeight=getImage().getHeight();
      if(getOneObjectAtOffset(imageWidth/-2,imageHeight/2,floor.class)!=null ||
         getOneObjectAtOffset(imageWidth/2,imageHeight/2,floor.class)!=null)
        isOnGround=true; 
      if(getOneObjectAtOffset(imageWidth/-2,imageHeight/2,floor2.class)!=null ||
         getOneObjectAtOffset(imageWidth/2,imageHeight/2,floor2.class)!=null)
        isOnGround=true; 
      if(getOneObjectAtOffset(imageWidth/-2,imageHeight/2,stairs.class)!=null ||
         getOneObjectAtOffset(imageWidth/2,imageHeight/2,stairs.class)!=null)
        isOnGround=true;
      if(getOneObjectAtOffset(imageWidth/-2,imageHeight/2,floor3.class)!=null ||
         getOneObjectAtOffset(imageWidth/2,imageHeight/2,floor3.class)!=null)
        isOnGround=true;
      if(getY()> getWorld().getHeight()- 30) isOnGround=true;
      return isOnGround;
      
    }    
}