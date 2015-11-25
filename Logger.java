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
public class Logger {
    
    
    //prints to log
    public static void log(String tolog){
        
      System.out.println(tolog);
      
    };
    
    //prints toString to the log
    public static void logO(Object thing){
        Logger.log("Class name: "+ thing.getClass().getSimpleName() +" ; "
                + thing.toString());
        
    }
}
