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
public abstract class Account {
    
    //initialize variables
    protected String accountName;
    protected int accountID;
    private static int nextID = 1;
        
            
    //variable constructor
    Account(String name){
        this.accountName = name;
        this.accountID = nextID++;
    };
            
            
    @Override
    public String toString() {
        return "Account ID: " +accountID +" ; Account Name: " +accountName;
    };
            
            
    public String getAccountName() {
        return accountName;
    };
            
    public void setAccountName(String newName){
        this.accountName = newName;
    };
       
    public abstract double computeSales();
    
    public abstract void enterSales();
    
    public abstract void displaySales();
           
              
}//end account class

