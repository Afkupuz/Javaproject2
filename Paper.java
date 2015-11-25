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
public class Paper extends Account{
    
    double poundsOfPaper = 0;
    double paperValue;
    String paperType;
    
    public Paper(String name, String type, double val){
        super(name);
        this.paperType = type;
        this.paperValue = val;
    };

    public void setValue(double val){
        if (val <= 0.0) {
            throw new IllegalArgumentException(
            "Value must be greater than 0!");
        }
        
        this.paperValue = val;
    };
    
    public void setPounds(double pounds){
        this.poundsOfPaper = pounds;
    };
    
    public double getPounds(){
        return poundsOfPaper;
    };
    public double getValue(){
        return paperValue;
    };
    
    @Override
    public String toString(){
        String original = super.toString();
        return original + "; Paper Type: " + paperType;
    }

    @Override
    public double computeSales(){
                double totalValue = this.paperValue * this.poundsOfPaper;
                
                return totalValue;
    };
    
    @Override
    public void enterSales(){
      double userPounds = User.askNum("Set total pounds of paper sold:");
        this.setPounds(userPounds);
      double userValue = User.askNum("Set the value per pound of paper:");
        this.setValue(userValue);
        
    };
    
    @Override
    public void displaySales(){
        System.out.println("The Papers' current pounds sold is = "+this.getPounds()
                + " pounds. The value per pound is = $"+this.getValue()+".");
        
    };





}//end paper class
