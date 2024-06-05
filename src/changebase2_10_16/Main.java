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
        Validation v = new Validation();
        UI ui = new UI();
        /*String binary = "1101";
        System.out.println("Binary to Decimal: " + m.convertBinaryToDecimal(binary)); // 13
        System.out.println("Binary to Hexa: " + m.convertBinaryToHexa(binary)); // D
        */
        /*String hexaaa = "1A";
        System.out.println("Hexa to Decimal: " + m.convertHexaToDecimal(hexaaa)); // 26
        System.out.println("Hexa to Binary: " + m.convertHexaToBinary(hexaaa)); // 11010
        
        String decimalll = "27";
        System.out.println("Decimal to Binary: " + m.convertDecimalToBinary(decimalll)); // 11011
        System.out.println("Decimal to Hexa: " + m.convetDecimalToHexa(decimalll)); // 1B
*/
        
        while (true){
        int choice = m.menu();
            switch (choice) {
                case 1:
                    String binary = v.checkInputBinary();
                    ui.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = v.checkInputDecimal();
                    ui.convertFromDecimal(decimal);
                    break;
                    
                case 3:
                    String hexa = v.checkHexaInput();
                    ui.convertFromHexadecimal(hexa);
                    break;
                    
                case 4:
                    
                    return;
                default:
                    throw new AssertionError();
            }
        }  
}
    
}
