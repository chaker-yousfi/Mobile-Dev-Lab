public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            printHelpMessage();
            return;
        }

        String option = args[0];
        String value = args[1];

        if ("-b".equals(option)) {
            int decimalValue = Integer.parseInt(value);
            String binary = Converter.decimalToBinary(decimalValue);
            System.out.println(binary);
        } else if ("-d".equals(option)) {
            int decimalValue = Converter.binaryToDecimal(value);
            System.out.println(decimalValue);
        } else if ("-h".equals(option)) {
            printHelpMessage();
        } else {
            System.out.println("Invalid option. Use -h for help.");
        }
    }

    private static void printHelpMessage() {
        System.out.println("Usage: program -b <decimal_value> (to convert decimal to binary)");
        System.out.println("       program -d <binary_value> (to convert binary to decimal)");
        System.out.println("       program -h (to show this help message)");
    }
}
