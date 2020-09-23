/* 
*   Guido Asbun
*   CS A170 
*   22-September-2020     
* 
*   Exercise 07
*/ 

import java.util.Scanner;
public class NumberEvenOdd{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
       
        int num = input.nextInt();
        
        String isEvenOdd = ((num%2)>0)? "Odd" : "Even";
        
        System.out.println(num + " is an " + isEvenOdd + " number");
    }
}