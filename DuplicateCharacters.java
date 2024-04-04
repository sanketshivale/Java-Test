// Sanket Shivale 04/04/2024
// Write a Java Program to find the duplicate characters in a string.

import java.util.Scanner;

public class DuplicateCharacters {  

     public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string1 = sc.nextLine();
 
        int count;  
          
        char stringArr[] = string1.toCharArray();  

        System.out.println("Duplicate characters in the enter string are as follows: ");

        for(int i = 0; i <stringArr.length; i++) {  
            count = 1;  
            for(int j = i+1; j <stringArr.length; j++) {  
                if(stringArr[i] == stringArr[j] && stringArr[i] != ' ') {  
                    count++;   
                    stringArr[j] = '1';  
                }  
            }  
            if(count > 1 && stringArr[i] != '1')  
                System.out.println(stringArr[i]);  
        }  
    }  
}  


// Duplicate characters in the enter string are as follows: 
// l
// i
// a
// t
// e
// r
// y
// S
// n