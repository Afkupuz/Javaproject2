/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it251;

import java.util.Scanner;

/**
 *
 * @author nicolas
 */
public class IT251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        BuisnessLogo myLogo = new BuisnessLogo();
        LogoFrame myFrame = new LogoFrame();
        
        //create instances of classes
        //Account myAccount = new Account("Basic");
        Supply mySupplies = new Supply("Supplies", "home");
        Service myServices = new Service("Services", 50, "Dad");
        Paper myPaper = new Paper("Paper", "satin", 5);
    
        
        //log class information and toString info
        //Logger.logO(myAccount);
        Logger.logO(mySupplies);
        Logger.logO(myServices);
        Logger.logO(myPaper);
        
        //myLogo.GenerateFrame();
        
        //myLogo.setCompany("Zomg Sales Company");
        
        //myFrame.GenerateFrame("Zomg Sales Company");
        
        //set parameters in a try block to catch errors
        try{
            
        //set supply parameters and display
        mySupplies.enterSales();
        mySupplies.displaySales();
        
        
        //set service parameters and display
        myServices.enterSales();
        myServices.displaySales();
        
        //set paper parameters and display
        myPaper.enterSales();
        myPaper.displaySales();
        
        }
        catch(Exception a){
            System.out.println("Too many errors. Quitting because of:");
            System.out.println(a);
            System.exit(-1);
        }
        
        
        
        Account[] classArray = new Account[3];
        
        classArray[0] = mySupplies;
        classArray[1] = myServices;
        classArray[2] = myPaper;
        
        double totalSales = 0.0;
        //print results of calling computeSales on each class instance
        for (int i = 0; i < 3; i++){
            System.out.println("Compute Sales for: "+
                    classArray[i].getClass().getSimpleName()+" : "+
                    classArray[i].computeSales());
                    totalSales += classArray[i].computeSales();
        }
        
        System.out.println("The total value of sales between all departmens is $"+
                totalSales+"!");
        
        System.out.println("The value of supplies sold: " + 
                mySupplies.computeSales());
        System.out.println("Total pay for services rendered: " + 
                myServices.computeSales());
        System.out.println("Total paper value: " + 
                myPaper.computeSales());
        
        //add final values to the frame
        
        String overall = "The total value of sales between all departmens is $"+
                totalSales+"!";
        String sup = "The value of supplies sold: $" + 
                mySupplies.computeSales();
        String ser = "Total pay for services rendered: $" + 
                myServices.computeSales();
        String pap = "Total paper value: $" + 
                myPaper.computeSales();
        
        //generate frame
        
        myFrame.GenerateFrame("My Company", overall, ser, pap, sup);
 
        //runs program while frame loads
        String end = User.ask("Are you done? Yes or No?");
        
        while (end != "yes") {
            end = User.ask("Are you done? yes or no?");
            
        };
        
        
    }//end main
    
}//end class
