/* 
*   Guido Asbun
*   CS A170 
*   22-September-2020     
* 
*   Exercise 07
*/ 

import java.util.Scanner;
public class NumberInt{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
       
        int num = input.nextInt();
        String numType = "";
        
        if(num > 0){
            numType = "positive";
        } else if(num == 0){
            numType = "zero";
        }else {
            numType = "negative";
        }
        
        System.out.println("It's a " + numType + " number.");

    }
}