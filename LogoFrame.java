/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it251;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author nicolas
 */
public class LogoFrame {
    
    public void GenerateFrame(String title, String total, String service, String paper, String supply)
    {
        
        // create a new frame
        JFrame frame = new JFrame("Buisness Logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        BuisnessLogo logo = new BuisnessLogo();
        //SalesFigures mySales = new SalesFigures();
        
        logo.setCompany(title);
        logo.setTot(total);
        logo.setPap(paper);
        logo.setSer(service);
        logo.setSup(supply);

        //frame.add(mySales);
        frame.add(logo);
        //frame.add(logo);
        
        
        //Creat action listener to have something happen for swing timer
        ActionListener neonFlash;
        neonFlash = new ActionListener(){
            boolean isOn = false;
            public void actionPerformed(ActionEvent event){
                //makes frame visible and repaints
                frame.setSize(800,400);
                frame.setVisible(true);
                frame.repaint();
                //checks if logo is present and removes or adds
                if(isOn == true){
                    frame.remove(logo);
                    isOn = false;
                    
                }else{
                    frame.add(logo);
                    isOn = true;
                }
                    
            }
            
        };
        //timer in seconds that performs the action
        Timer displayTimer = new Timer(1000, neonFlash);
        displayTimer.start();
        
        

    }
}
