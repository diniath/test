/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author nande
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for statement to find out what will happen for numbers from 1 to 100
        for (int i = 1; i<=100; i++){
            
            // if the number can be divided both by 3 and 5, printout FizzBuzz instead of the number
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");  
                
            // if the number is only divided by 3, printout Fizz instead of the number
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
                
            // if the number is only divided by 5, printout Buzz instead of the number    
            }else if (i % 5 == 0){
                System.out.println("Buzz");
                
            // if the number cannot be divided by 3 or by 5, just printout the number
            }else {
                System.out.println(i);
            }
            
        }
    }
    
}
