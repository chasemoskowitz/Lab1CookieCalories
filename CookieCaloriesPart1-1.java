//Chase Moskowitz

package com.mycompany.cookiecalorie;
  
import java.util.Scanner;
public class CookieCaloriesPart1 {

    public static void main(String[] args) {
        
      //Declare variables
      int cookieInBag=0;
      int cookiesEaten=0;
      int servings=0;
      int caloriesInServing=0;
      double totalCalories=0;
      String typeOfCookie;
      double cookiesPerServings=0;
      double caloriePerCookie=0;
        
      //inport scanner in
     Scanner keyboard=new Scanner(System.in);

      //Recieve information from user
      System.out.print("What kind of cookie did you eat? ");
      typeOfCookie=keyboard.nextLine();

      System.out.print("How many cookies are in a bag? ");
      cookieInBag=keyboard.nextInt();

      System.out.print("How many servings are in a bag? ");
      servings=keyboard.nextInt();

      System.out.print("How many calories are in a serving? ");
      caloriesInServing=keyboard.nextInt();

      System.out.print("\nHow many cookies did you eat? ");
      cookiesEaten=keyboard.nextInt();

      //Calculate calorie of a single cookie
      cookiesPerServings=(double)(cookieInBag)/(servings);
      caloriePerCookie=caloriesInServing/cookiesPerServings;

      //Find total calories based on amount of cookies
      totalCalories=caloriePerCookie*cookiesEaten;

      //print results
     System.out.printf("\n%d %s cookies is %.1f calories", 
             cookiesEaten, typeOfCookie, totalCalories);
        
        
        
    }
}
