
package com.joysistvi.decisionmaking.day6;

import java.util.Scanner;
public class VotersAgeClassification {
    
    
    public static void main(String[] args) {
        System.out.println("---Age Classification---");
        System.out.println("18 above : National Election");
        System.out.println("15 - 17 : SK Election");
        System.out.println("14 below : Not Eligible");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        
        if (age >= 18) {
            System.out.println("National Election"); 
        }  else if (age >= 15 && age <= 17) {
            System.out.println("SK Election");
        }  else if (age <= 14 && age != 0) {
            System.out.println("Not Eligible");
        }  else {
            System.out.println("Invalid");
        }
        
    }
}
