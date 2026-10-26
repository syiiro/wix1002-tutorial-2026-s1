/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timeconverter;

import java.util.Scanner;
        
/**
 *
 * @author norla
 */
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in seconds :");
        int S = sc.nextInt();
        
        int hours = S/3600;
        int minutes = (S%3600)/60;
        int seconds = (S%3600)%60;
        
        System.out.println(S+" seconds is "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds.");
        
        
        
        
        
    }
    
}
