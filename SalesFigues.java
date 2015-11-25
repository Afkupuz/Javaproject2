/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it251;

import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.yellow;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.Timer;

/**
 *
 * @author nicolas
 */
public class SalesFigures extends JPanel{
    
    String salesFigures = "ZOMG NUMBERS";
    String userFont = "Herculanum";
    
    public void setFigures(String user){
        salesFigures = user;
    }
    public void setFont(String user){
        userFont = user;
    }

    // this method draws
    public void paintComponent(Graphics g)
    {
        // pass the graphics object to the paintComponent of the parent class
        super.paintComponent(g);
        
        g.setColor(Color.green);
        g.setFont(new Font(userFont,Font.BOLD,30));
        g.drawString("ZOMG THIS IS MORE STUFF", 300, 250);


    }
    

    

}
