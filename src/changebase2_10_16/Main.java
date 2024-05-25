/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changebase2_10_16;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m = new Manager();
        String binary = "1101";
        System.out.println("Binary to Decimal: " + m.convertBinaryToDecimal(binary)); // 13
        System.out.println("Binary to Hexa: " + m.convertBinaryToHexa(binary)); // D
        
        String hexa = "1A";
        System.out.println("Hexa to Decimal: " + m.convertHexaToDecimal(hexa)); // 26
        System.out.println("Hexa to Binary: " + m.convertHexaToBinary(hexa)); // 11010
        
        String decimal = "27";
        System.out.println("Decimal to Binary: " + m.convertDecimalToBinary(decimal)); // 11011
        System.out.println("Decimal to Hexa: " + m.convetDecimalToHexa(decimal)); // 1B
    }
    
}
