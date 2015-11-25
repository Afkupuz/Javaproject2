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
public class User {
    
    // static method usable without creating class instance
    public static String ask(String prompt){
      Scanner scan = new Scanner(System.in);
      System.out.println(prompt);
      String response = scan.nextLine();
      return response;
    };
    
    //asks for user input and checks thats it is a number
    public static double askNum(String prompt){
      Scanner scan = new Scanner(System.in);
      double response = 0.0;
      int counter = 0;
      int MAXCOUNTER = 5;
      do{
      System.out.println(prompt);
      try {
          response = Double.valueOf(scan.nextLine());
          break;
      }
      catch (RuntimeException e){
          if (counter < MAXCOUNTER){
          System.out.println("Please enter a number:");
          }
          else {
          System.out.println("Giving up!");
          throw e;
          }
      }
      } while (counter++ < MAXCOUNTER);
      return response;
        
    }
}
