/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

import java.util.Random;

/**
 *
 * @author norla
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        int number = rand.nextInt(100001);
        
        int digit1 = number%10; // 2361%10 = 236.1
        int digit2 = (number/10)%10; // 2361/10 = 236%10 = 6
        int digit3 = (number/100)%10;
        int digit4 = (number/1000)%10;
        int digit5 = (number/10000)%10;
        
        int sum = digit1 + digit2 + digit3 + digit4 + digit5;
        
        System.out.println("Random number is :"+number);
        
        System.out.println("Digit 1 :"+digit1);
        System.out.println("Digit 2 :"+digit2);
        System.out.println("Digit 3 :"+digit3);
        System.out.println("Digit 4 :"+digit4);
        System.out.println("Digit 5 :"+digit5);
        
        System.out.println("Sum of the digits is : "+sum);
        
    }
    
}
