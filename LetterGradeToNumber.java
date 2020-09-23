/* 
*   Guido Asbun
*   CS A170 
*   22-September-2020     
* 
*   Exercise 07
*/ 

import java.util.Scanner;
public class LetterGradeToNumber{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter letter grade: ");
        String letterGrade = input.next();
        int numGrade = 0;
        
        if (letterGrade.equalsIgnoreCase("A")){
            numGrade = 4;
        }else if(letterGrade.equalsIgnoreCase("B")){
            numGrade = 3;
        }else if(letterGrade.equalsIgnoreCase("C")){
            numGrade = 2;
        }else if(letterGrade.equalsIgnoreCase("D")){
            numGrade = 1;
        }
        
        System.out.println(numGrade);
    }
}