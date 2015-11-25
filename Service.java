/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it251;


/**
 *
 * @author nicolas
 */
public class Service extends Account {
    
    String serviceName;
    double hoursWorked = 0;
    double hourlyRate;
    
    public Service(String name, double rate, String service){
        super(name);
        this.hourlyRate = rate;
        this.serviceName = service;
        
    }
    
    public void setHours(double numberOfHours){
        this.hoursWorked = numberOfHours;
    }
    
    public void setRate(double theRate){
        this.hourlyRate = theRate;
    }
    
    public double getHours(){
        return hoursWorked;
    };
    public double getRate(){
        return hourlyRate;
    };
    
    @Override
    public String toString(){
        String original = super.toString();
        return original + "; Service Name: " + this.serviceName;
    };
    
    @Override
    public double computeSales(){
                double totalpay = this.hoursWorked * this.hourlyRate;
                
                return totalpay;
            };
    
    @Override
    public void enterSales(){
      double userHours = User.askNum("Set total hours worked:");
        this.setHours(userHours);
      double userRate = User.askNum("Set hourly Rate:");
        this.setRate(userRate);
        
    };
    
    @Override
    public void displaySales(){
        System.out.println("The Services' current hours worked = "+this.getHours()
                + " Hours. The rate per hour is = "+this.getRate()+".");
        
    };
           
}//end service class
