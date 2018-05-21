import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Font;
/**
 * Write a description of class skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skor extends Actor
{
    /**
     * Act - do whatever the skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int value = 1;
    private int target = 1;
    private String text;
    private int stringLength;
    public skor()
    {
        this("");
    }
    public skor(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 18;
        
        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));
        
        updateImage();
    }
    public void act() 
    {
        if(value < target) {
         value++;
         updateImage();
        }
        else if(value > target) {
         value--;
         updateImage();
        }
    }
    public void add(int skor)
    {
        target += skor;
    }
    
    public int getvalue()
    {
        return value;
    }
    private void updateImage()
    {
     GreenfootImage image = getImage();
     image.clear();
     image.drawString(text + value, 3, 25);
    }
}
