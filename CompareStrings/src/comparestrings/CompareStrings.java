/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparestrings;

import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class CompareStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
     
        //Tell user to insert string to check for the digit within the string
        System.out.println("Enter a string to check for a digit");
        String word = obj.nextLine();
        
        //call method that will validate a string for a digit
        CheckForDigit check = new CheckForDigit();
        System.out.println("String has a digit?;" + check.DigitMethod(word));
        check.DigitMethod(word);
                      
    }//end of main method therefore dont touch here
    
    //create a class-blueprint inside of a blueprint
    public static class CheckForDigit{
        
        //create a method
        //String is Dintle3 and it is an input = Dintle3
        public boolean DigitMethod(String input) {
            for(int i = 0; i < input.length(); i++){
                if(Character.isDigit(input.charAt(i))){
                    return true;
                    
                }//end of if statement
            }//end of for loop
            
            return false;
            
        }//end of String input
    }//end of CheckForDigit class
    
}
