import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(3);
        if(Greenfoot.getRandomNumber(110)<15){
            turn(Greenfoot.getRandomNumber(20)-30);
        
    }
    eatmouse();
    }
    
    public void eatmouse()
    {
        if(isTouching(mouse.class))
            removeTouching(mouse.class);
    }
}