/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatureconverter;

import java.util.Scanner;

/**
 *
 * @author norla
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        double fahrenheit = sc.nextDouble();
        double celcius = (fahrenheit - 32)/18;
                
    System.out.print(celcius);
    }
    
}
