/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package changebase2_10_16;

/**
 *
 * @author ADMIN
 */
public class UI {
    Manager manager = new Manager();
    Validation v = new Validation();
    public int menu() {
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 4);
        return choice;
    }
    
     public void convertFromBinary(String binary) {
                System.out.println("Decimal: "
                        + manager.convertToDecimal(binary, 2));

                int decimalValue = manager.convertToDecimal(binary, 2);
                System.out.println("Hexadecimal: "
                        + manager.convertFromDecimal(decimalValue, 16));
    }

    public void convertFromDecimal(String decimal) {
        int deci = Integer.parseInt(decimal);
                System.out.println("Binary: "
                        + manager.convertFromDecimal(deci, 2));
                System.out.println("Hexadecimal: "
                        + manager.convertFromDecimal(deci, 16));
        
    }

    public void convertFromHexadecimal(String hexadecimal) {
            int deci = manager.convertToDecimal(hexadecimal, 16);
                System.out.println("Binary: "
                        + manager.convertFromDecimal(deci, 2));
                System.out.println("Decimal: "
                        + manager.convertToDecimal(hexadecimal, 16));
    }
}
