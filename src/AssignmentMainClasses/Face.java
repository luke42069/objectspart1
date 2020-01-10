
package AssignmentMainClasses;

import java.awt.Color;
import java.awt.Graphics;


public class Face {
    private int xpos,ypos,diameter;
    private Color c,e;
    private Graphics g;
    private boolean happy;
    
    
    public Face(Graphics g, int x, int y){
        happy=true;
        xpos=x;
        ypos=y;
        this.g=g;
        diameter=100;
        c=Color.red;e= Color.yellow;
    }
    
    
    public void draw(){
        if(g==null)return;
        head();
        eyes();
        if(happy)
        happymouth();
        else
            sadmouth();
    }
    
    private void head(){
        g.setColor(c);
        g.fillOval(xpos,ypos,diameter,diameter);
    }
    
    private void eyes(){
        g.setColor(e);
        g.fillOval(xpos+(int)(diameter*.2),ypos+(int)(diameter*.2),(int)(diameter*.2),(int)(diameter*.2));
        g.fillOval(xpos+(int)(diameter*.6),ypos+(int)(diameter*.2),(int)(diameter*.2),(int)(diameter*.2));
    }
    
    private void happymouth(){
        g.setColor(Color.black);
        g.drawLine(xpos+(int)(diameter*.2),ypos+(int)(diameter*.6),xpos+(int)(diameter*.3),ypos+(int)(diameter*.7));
        g.drawLine(xpos+(int)(diameter*.3),ypos+(int)(diameter*.7),xpos+(int)(diameter*.7),ypos+(int)(diameter*.7));
        g.drawLine(xpos+(int)(diameter*.7),ypos+(int)(diameter*.7),xpos+(int)(diameter*.8),ypos+(int)(diameter*.6));
    }
    
    private void sadmouth(){
        g.setColor(Color.black);
        g.drawLine(xpos+(int)(diameter*.2),ypos+(int)(diameter*.7),xpos+(int)(diameter*.3),ypos+(int)(diameter*.6));
        g.drawLine(xpos+(int)(diameter*.3),ypos+(int)(diameter*.6),xpos+(int)(diameter*.7),ypos+(int)(diameter*.6));
        g.drawLine(xpos+(int)(diameter*.7),ypos +(int)(diameter*.6),xpos+(int)(diameter*.8),ypos+(int)(diameter*.7));
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xpos-10,ypos-10,diameter+20,diameter+20);
    }
    
    public void setColour(Color fc, Color ec){
        erase();
        c = fc;
        e = ec;
        draw();
    }
    
    public void setLoc(int x,int y){
        erase();
        xpos = x;
        ypos = y;
        draw();
    }
    
    public void mood(){
        erase();
        if(happy)
            happy=false;
        else happy=true;
        draw();
    }
    
    public void resize(int d){
        erase();
        diameter=d;
        draw();
    }
}
