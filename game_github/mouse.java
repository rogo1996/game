import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mouse extends Actor
{
    /**
     * Act - do whatever the mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(2);
        if(Greenfoot.isKeyDown("left")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(3);
        }
        removeTouching(cherries.class);
    }    
}
