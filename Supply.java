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
public class Supply extends Account {
    
    private String location;
    private double booksValue = 0;
    private double apparelValue = 0;
    private double officeSuppliesValue = 0;
    
    public Supply(String name, String where){
        super(name);
        location = where;
                
    };
    
    public void setBook(double val){
        booksValue = val;
    }
    
    public void setApparel(double val){
        apparelValue = val;
    };
    
    public void setOffice(double val){
        officeSuppliesValue = val;
    };
    
    public double getBook(){
        return booksValue;
    };
    public double getApparel(){
        return apparelValue;
    };
    public double getOffice(){
        return officeSuppliesValue;
    };
    
    @Override
    public String toString(){
        String original = super.toString();
        return original + "; Location: "+location;
    };
    
    @Override
    public double computeSales(){
        double total = booksValue + apparelValue + officeSuppliesValue;
                        
        return total;
    };
    
    @Override
    public void enterSales(){
      double userBooks = User.askNum("Set total $ value of books sold:");
        this.setBook(userBooks);
        
        double userApparel = User.askNum("Set total $ value of apparel sold:");
        this.setApparel(userApparel);
        
        double userOffice = User.askNum("Set total $ value of office supplies sold:");
        this.setOffice(userOffice);
        
    };
    
    @Override
    public void displaySales(){
        System.out.println("The Supplies' current value of books = $"+this.getBook()
                + ", apparel = $"+this.getApparel()+", and office supplies = $"
        +this.getOffice()+".");
        
    };
    
}//end supply class
