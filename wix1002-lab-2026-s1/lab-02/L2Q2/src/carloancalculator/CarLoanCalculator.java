/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carloancalculator;

import java.util.Scanner;

/**
 *
 * @author norla
 */
public class CarLoanCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the car : ");
        double P = sc.nextDouble();
        
        System.out.print("Enter the down payment of the car : ");
        double D = sc.nextDouble();
        
        System.out.print("Enter the interest rate in % :");
        double R = sc.nextDouble();
        
        System.out.print("Enter the loan duration in year : ");
        double Y = sc.nextDouble();
        
        double M = (((P-D)*(1+((R*Y)/100)))/(Y*12));
        
        System.out.printf("Monthly payment : %.2f\n",M);
        
    }
    
}
