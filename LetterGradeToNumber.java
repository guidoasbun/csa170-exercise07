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
        int numGrade = input.nextInt();
        char letterGrade = 'F';
        
        if (numGrade == 4){
            letterGrade = 'A';
        }else if(numGrade == 3){
            letterGrade = 'B';
        }else if(numGrade == 2){
            letterGrade = 'C';
        }else if(numGrade == 1){
            letterGrade = 'D';
        }
        
        System.out.println
    }
}