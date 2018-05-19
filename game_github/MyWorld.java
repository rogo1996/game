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
        Greenfoot.playSound("title-theme.mp3");
        prepare();

    }
    
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
        snake snake = new snake();
        addObject(snake,386,89);
        snake.setLocation(380,305);
        snake.setLocation(483,188);
        snake snake2 = new snake();
        addObject(snake2,426,78);
        snake snake3 = new snake();
        addObject(snake3,415,321);
        snake2.setLocation(160,70);
        snake.setLocation(310,196);
        snake3.setLocation(320,330);
        snake snake4 = new snake();
        addObject(snake4,215,345);
        snake3.setLocation(415,60);
        snake.setLocation(320,200);
        snake4.setLocation(315,340);
        cherries cherries4 = new cherries();
        addObject(cherries4,401,104);
        cherries4.setLocation(400,104);
        cherries cherries5 = new cherries();
        addObject(cherries5,452,162);
        cherries cherries6 = new cherries();
        addObject(cherries6,453,289);
        cherries cherries7 = new cherries();
        addObject(cherries7,86,361);
        cherries cherries8 = new cherries();
        addObject(cherries8,67,120);
        cherries cherries9 = new cherries();
        addObject(cherries9,306,41);
        cherries cherries10 = new cherries();
        addObject(cherries10,200,367);
        cherries cherries11 = new cherries();
        addObject(cherries11,500,45);
        cherries cherries12 = new cherries();
        addObject(cherries12,100,50);
    }

}
