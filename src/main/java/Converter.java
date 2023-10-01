// Converter.java
public class Converter {
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}

