/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package changebase2_10_16;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {
    Scanner in = new Scanner(System.in);
    String binaryValid = "[0-1]*";
    String decimalValid = "[0-9]*";
    String hexaValid ="[0-9A-F]*";
    
    //check user input number limit
    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result;
                result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    
     //check user input number binary
    public String checkInputBinary() {
        System.out.print("Enter number binary: ");
        String result;
        //loop until user input correct
        while (true) {
            result = in.nextLine().trim();
            if (result.matches(binaryValid)) {
                return result;
            }
            System.err.println("Must be enter 0 or 1");
            System.out.print("Enter again: ");
        }
    }

    public String checkInputDecimal(){
        System.out.printf("Enter number decimal: ");
        String result;
        
        while (true) {            
            result = in.nextLine().trim();
            if (result.matches(decimalValid)){
                return result;
            }
            System.err.println("number must between '0' - '9'");
            System.out.println("Try again: ");
        }
    }
    
    public String checkHexaInput(){
        System.out.println("Enter number hexadecimal: ");
        String result;
        
         while (true) {            
            result = in.nextLine().trim();
            if (result.matches(hexaValid)){
                return result;
            }
            System.err.println("number must between '0' - '9'");
            System.out.println("Try again: ");
        }
    }
    
}
