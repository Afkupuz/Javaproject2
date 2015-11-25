/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it251;

import static java.awt.Color.red;
import static java.awt.Color.white;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.yellow;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author nicolas
 */
public class BuisnessLogo extends JPanel{
    
    String company = "Magic DB";
    String userFont = "Herculanum";
    String tot = "total";
    String sup = "supply";
    String pap = "paper";
    String ser = "service";
    
    public void setCompany(String user){
        company = user;
    }
    public void setFont(String user){
        userFont = user;
    }
    public void setTot(String user){
        tot = user;
    }
    public void setSup(String user){
        sup = user;
    }
    public void setPap(String user){
        pap = user;
    }
    public void setSer(String user){
        ser = user;
    }
    
    //draws passed irregular shapes
    public void drawShape(Graphics2D g2d, int[] pointX, int[] pointY, 
            int placeX, int placeY, int colorA, int colorB, int colorC, 
            Color color1, Color color2){
        
        GeneralPath NewShape = new GeneralPath();
        
        NewShape.moveTo(pointX[0], pointY[0]);
        for(int count = 1; count < pointX.length; count++)
        {
            // draw the lines
            NewShape.lineTo(pointX[count], pointY[count]);

        }
        
        NewShape.closePath();
        GradientPaint redtowhite = new GradientPaint(25,0,color1, 75, 0,color2);
        g2d.setPaint(redtowhite);
        g2d.translate(placeX, placeY);
        //g2d.setColor(new Color(colorA,colorB,colorC));
        g2d.fill(NewShape);
        
        }

    // this method paints to frame
    public void paintComponent(Graphics g)
    {
        // pass the graphics object to the paintComponent of the parent class
        super.paintComponent(g);
        
        int bigStarTX[] = {30, 0, 45, 60, 75, 120};
        int bigStarTY[] = {15, -15, -15, -60, -15, -15};
        int bigStarBX[] = {120, 90, 110, 60, 10, 30, 0, 45};
        int bigStarBY[] = {-15, 15, 60, 30, 60, 15, -15, -15};
        int smallStarX[] = {0, 10, 15, 20, 30, 22, 27, 15, 2, 6};
        int smallStarY[] = {-3, -3, -15, -3, -3, 3, 15, 7, 15, 3};
        int smallStarAX[] = {0, 10, 15, 20, 30, 22, 27, 15, 2, 6};
        int smallStarAY[] = {-3, -3, -15, -3, -3, 3, 15, 7, 15, 3};
        int smallStarBX[] = {0, 10, 15, 20, 30, 22, 27, 15, 2, 6};
        int smallStarBY[] = {-3, -3, -15, -3, -3, 3, 15, 7, 15, 3};
        
        Graphics2D g2d = (Graphics2D) g;
        
        this.drawShape(g2d, smallStarX, smallStarY, 100, 100, 20, 60, 90, green, white);
        this.drawShape(g2d, bigStarBX, bigStarBY, 20, 20, 90, 20, 60, white, red);
        this.drawShape(g2d, bigStarTX, bigStarTY, 0, 0, 20, 90, 60, red, white);
        this.drawShape(g2d, smallStarAX, smallStarAY, 0, 50, 90, 140, 80, blue, white);
        this.drawShape(g2d, smallStarBX, smallStarBY, 90, -70, 190, 140, 30, yellow, white);
        
        
        g.setColor(Color.green);
        g.setFont(new Font(userFont,Font.BOLD,30));
        g.drawString(company, -30, 50);
        g.setColor(Color.black);
        g.setFont(new Font("serif",Font.PLAIN, 20));
        g.drawString(tot, -100, 150);
        g.drawString(ser, -100, 170);
        g.drawString(sup, -100, 190);
        g.drawString(pap, -100, 210);


    }
    

    

}
