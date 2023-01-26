/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstproject;

/**
 *
 * @author hashemim
 */

// Instance Variable & Instance method -> works
// Instance Variable & Static method -> doesn't work
// Static variable & Instance method -> works
// Static variable & Static method -> works

public class Clock {
    private String color = "blue";
    private int hour;
    private int minute;
    private int second;
    private static String brand = "Ashby";
    private static int numberOfClocks = 0;
    
    public Clock() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        
        ++numberOfClocks;
    }
    
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
        ++numberOfClocks;
    }
       
//    public Clock(){
//        
//    }
    
    public static int getNumberOfClocks() {
        //System.out.println(this.color);
        
        return Clock.numberOfClocks;
    }
    
    public String getTime() {
        System.out.println(numberOfClocks);
        
        //return this.hour + ":" + this.minute + ":" + this.second;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    
}
