/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waterheatercalculator;

import java.util.Scanner;

/**
 *
 * @author norla
 */
public class WaterHeaterCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of water in gram");
        double water = sc.nextDouble();
        
        System.out.println("Enter initial temperature in Fahrenheit");
        double F1 = sc.nextDouble();
        
        System.out.println("Enter the final temperature in Fahrenheit");
        double F2 = sc.nextDouble();
        
        double M = water/1000;
        double initialTemp = (F1-32)/1.8;
        double finalTemp = (F2-32)/1.8;
        
        double Q = M*(finalTemp-initialTemp)*4184;
        
        System.out.printf("The energy needed is %e\n",Q);
        
    }
    
}
