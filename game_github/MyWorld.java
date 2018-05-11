import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mouse mouse = new mouse();
        addObject(mouse,97,213);
        cherries cherries = new cherries();
        addObject(cherries,233,140);
        cherries cherries2 = new cherries();
        addObject(cherries2,255,272);
        cherries cherries3 = new cherries();
        addObject(cherries3,387,205);
    }
}
