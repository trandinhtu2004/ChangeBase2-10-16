/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package changebase2_10_16;

/**
 *
 * @author ADMIN
 */
public class Manager {
    
    char[] digits = "0123456789ABCDEF".toCharArray();
    
    char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    Validation v = new Validation();

    /*public int menu() {
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 4);
        return choice;
    }*/

/*    public int displayConvert(String from, String toCase1, String toCase2) {
        System.out.println("1.Convert from " + from + " to " + toCase1);
        System.out.println("2.Convert from " + from + " to " + toCase2);
        int choice = v.checkInputIntLimit(1, 2);
        return choice;
    }
*/
/*    public void convertFromBinary(String binary) {
                System.out.println("Decimal: "
                        + convertToDecimal(binary, 2));

                int decimalValue = convertToDecimal(binary, 2);
                System.out.println("Hexadecimal: "
                        + convertFromDecimal(decimalValue, 16));
    }

    public void convertFromDecimal(String decimal) {
        int deci = Integer.parseInt(decimal);
                System.out.println("Binary: "
                        + convertFromDecimal(deci, 2));
                System.out.println("Hexadecimal: "
                        + convertFromDecimal(deci, 16));
        
    }

    public void convertFromHexadecimal(String hexadecimal) {
            int deci = convertToDecimal(hexadecimal, 16);
                System.out.println("Binary: "
                        + convertFromDecimal(deci, 2));
                System.out.println("Decimal: "
                        + convertToDecimal(hexadecimal, 16));
    }
*/    
     public int convertToDecimal(String input, int fromBase) {
        int decimalValue = 0;
        int digit;

    /*    for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(input.length() - 1 - i);
            if (currentChar >= '0' && currentChar <= '9') {
                digit = currentChar - '0';
            } else if (currentChar >= 'A' && currentChar <= 'F') {
                digit = currentChar - 'A' + 10;
            } else if (currentChar >= 'a' && currentChar <= 'f') {
                digit = currentChar - 'a' + 10;
            } else {
                throw new IllegalArgumentException("Invalid character in input: " + currentChar);
            }
            decimalValue += digit * Math.pow(fromBase, i);
        }
        return decimalValue;*/
    
        for (int i = 0; i < input.length();i++){
            char curChar = input.charAt(input.length() - 1 - i);
            if (curChar >= '0' && curChar <= '9'){
                digit = curChar - '0';
            }
            else if (curChar >= 'A' && curChar <= 'F'){
                digit = curChar - 'A' + 10;
            } 
            else{ throw new IllegalArgumentException("Invalid character: " 
            + curChar);
            }
            decimalValue += digit * Math.pow(fromBase, i);
            
        }
        return decimalValue;
    }
     public String convertFromDecimal(int decimalValue, int toBase) {
        if (decimalValue == 0) {
            return "0";
        }
        
        /*StringBuilder result = new StringBuilder();
        while (decimalValue > 0) {
            int remainder = decimalValue % toBase; // chia lấy số dư
        //    System.out.println("Decimal: " + decimalValue + " Remainder: " + remainder + " Result so far: " + result.toString());
            result.insert(0, hexDigits[remainder]); // lấy char ở phần tử thứ reminder
        //    System.out.println("Decimal: " + decimalValue + " Remainder: " + remainder + " Result so far: " + result.toString());
            decimalValue /= toBase;
        }

        return result.toString();*/
        StringBuilder result = new StringBuilder();
        while (decimalValue > 0){
            int reminder = decimalValue % toBase;
            result.insert(0, digits[reminder]);
            decimalValue /= toBase;
        }
        return result.toString();
     }
    /*public String convertBinaryToDecimal(String binary){
        int decimal = 0;
        int length = binary.length();
        
        for (int i = 0; i < length;i++){
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1'){
                decimal += Math.pow(2, i);
            }
        }
        return Integer.toString(decimal);
    }*/
/*  // lam thu cong
    public String convertBinaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(binary.length() - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return Integer.toString(decimal);
    }

    /*public String convertDecimalToBinary(String decimal){
        int deci = Integer.parseInt(decimal);
        String binary = "";
        while (deci > 0){
            binary = (deci%2) + binary;
            deci /= 2;
        }
        return binary;
    }
    public String convertDecimalToBinary(String decimal) {
        int deci = Integer.parseInt(decimal);
        String binary = "";
        while (deci > 0) {
            binary = (deci % 2) + binary;
            deci /= 2;
        }
        return binary;
    }

    public String convetDecimalToHexa(String decimal) {
        int deci = Integer.parseInt(decimal);
        String hexa = "";
        while (deci > 0) {
            hexa = hexDigits[deci % 16] + hexa;
            deci /= 16;
        }
        return hexa;
    }

    public String convertBinaryToHexa(String binary) {
        String decimal = convertBinaryToDecimal(binary);
        return convetDecimalToHexa(decimal);
    }

    public String convertHexaToBinary(String hexa) {
        String decimal = Integer.toString(convertHexaToDecimal(hexa));
        return convertDecimalToBinary(decimal);
    }

    public int convertHexaToDecimal(String hexa) {
        int decimal = 0;
        int length = hexa.length();

        for (int i = 0; i < length; i++) {
            char hexChar = hexa.charAt(length - 1 - i);
            int hexValue = Character.digit(hexChar, 16);
            decimal += hexValue * Math.pow(16, i);
        }
        return decimal;
    }
*/
}
