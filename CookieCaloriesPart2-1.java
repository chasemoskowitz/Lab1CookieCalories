//Chase Moskowitz
package com.mycompany.cookiecaloriespart2;
import java.util.Scanner;

public class CookieCaloriesPart2 {

    public static void main(String[] args) {
    
     //Declare variables
     final double SUGAR = 1.50;
     final double BUTTER = 1.00;
     final double FLOUR = 2.75;
     final int COOKIES = 48;
     double newFlour=0;
     double newSugar=0;
     double newButter=0;
     int totalCookies = 0;
     double cookieRatio=0;

     //inport scanner in
     Scanner keyboard=new Scanner(System.in);

     //Recieve information from user
     System.out.print("How many cookies do you need? ");
     totalCookies=keyboard.nextInt();
    
     //Calculate ratio of original batch to the new batch
     cookieRatio=(double)(totalCookies)/(COOKIES);

     /*Use the ratio to find right amount of batter needed for specified amount 
     of cookies*/
     newFlour=FLOUR*cookieRatio;
     newSugar=SUGAR*cookieRatio;
     newButter=BUTTER*cookieRatio;

     System.out.printf("\nTo make %s cookies using this recipe you will need:", 
             totalCookies);

      //print results
     System.out.printf("\n%-8s %6.2f Cups\n%-8s %6.2f Cups\n%-8s %6.2f Cups", 
             "Sugar", newSugar, "Buter", newButter, "Flour", newFlour);
        
        
        
        
        
        
        
        
    }
}
