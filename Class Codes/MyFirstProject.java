/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hashemim
 */
public class MyFirstProject {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myNumber = 54;
        float myFloat = 25.3f;
        boolean myFlag = true;
        
        printSomething();
        
        Clock clock1 = new Clock();
        Clock clock2 = new Clock(1, 20, 15);
        
        System.out.println(clock2.getTime());
        
        System.out.println(Math.min(25, 35));
        System.out.println(Math.round(3.5));
        
        System.out.println(Math.random());
        
        Random random = new Random();

        System.out.println(random.nextInt(3));
        System.out.println(random.nextInt(6) + 1);
        System.out.println(random.nextInt(5) * 2 + 1);
        
        // 7, 10, 13, 16, 19, 22
        System.out.println(random.nextInt(6) * 3 + 7);
        
        Scanner scanner = new Scanner(System.in);
        
//        System.out.println("Please input a number: ");
//        int num = scanner.nextInt();
//        
//        System.out.println(num);
        
//        System.out.println("Please input a string: ");
//        String input = scanner.nextLine();
//        System.out.println(input);
        
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
        
        for(int i = 0; i < 5; i++) {
            if(i == 3) {
                //break;
                continue;
            }
            
            System.out.println(i);
        }
        
        System.out.println(5 > 7 ? "true" : "false");
    }
    
    // Ab5
    
    public static boolean isPasswordValid(String password) {
    boolean upper = false;
    boolean lower = false;
    boolean digit = false;

    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);
        
        if(password.length() < 7) {
            break;
        }
        
        if (Character.isUpperCase(c))
            upper = true;
        else if (Character.isLowerCase(c))
            lower = true;
        else if (Character.isDigit(c))
            digit = true;
    }

    return upper && lower && digit;
}
    
    public static void printSomething() {
        System.out.println("Hello snow storm!");
    }
    
}
