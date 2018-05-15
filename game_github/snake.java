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
        move(2);
        if(Greenfoot.isKeyDown("left")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(-5);
        }
        eatmouse();
        turnback();
    }
    public void eatmouse()
    {
        removeTouching(mouse.class);
        if(isTouching(mouse.class))
        {
            getWorld().showText("YOU LOSE NOOB!!!", 300, 200);
        }
    }   
    public void turnback()
    {
        if(getX()+1>=550)
        {
            turn(5);
        }
    }
    
}